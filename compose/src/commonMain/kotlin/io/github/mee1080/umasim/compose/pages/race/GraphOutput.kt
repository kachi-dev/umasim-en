package io.github.mee1080.umasim.compose.pages.race

import androidx.compose.foundation.border
import io.github.mee1080.umasim.compose.translation.LanguageManager
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import io.github.koalaplot.core.ChartLayout
import io.github.koalaplot.core.Symbol
import io.github.koalaplot.core.legend.FlowLegend
import io.github.koalaplot.core.legend.LegendLocation
import io.github.koalaplot.core.line.AreaBaseline
import io.github.koalaplot.core.line.AreaPlot
import io.github.koalaplot.core.line.LinePlot
import io.github.koalaplot.core.style.AreaStyle
import io.github.koalaplot.core.style.LineStyle
import io.github.koalaplot.core.util.ExperimentalKoalaPlotApi
import io.github.koalaplot.core.xygraph.*
import io.github.mee1080.umasim.compose.common.atoms.LabeledCheckbox
import io.github.mee1080.umasim.compose.common.atoms.TooltipSurface
import io.github.mee1080.umasim.compose.common.parts.WithTooltip
import io.github.mee1080.umasim.store.AppState
import io.github.mee1080.umasim.store.GraphData
import kotlin.math.max
import kotlin.math.min

@Composable
fun GraphOutput(state: AppState) {
    val graphData = state.graphData ?: return
    GraphArea(graphData)
}

private val defaultLegends = listOf(
    "速度" to Color.Blue,
    "耐力" to Color(255, 128, 100),
    "走行レーン" to Color.Green,
)

private val virtualLegends = defaultLegends + listOf(
    "先頭との差" to Color(0, 255, 255),
)

@OptIn(ExperimentalKoalaPlotApi::class)
@Composable
private fun GraphArea(graphData: GraphData) {
    val frameList = graphData.frameList
    Column {
        Text(LanguageManager.getText("直近レース詳細"), style = MaterialTheme.typography.headlineSmall)
        var verticalZoom by remember { mutableStateOf(false) }
        LabeledCheckbox(verticalZoom, { verticalZoom = it }) {
            Text(LanguageManager.getText("スキル数に応じて縦方向に拡大"))
        }
        val height by derivedStateOf { if (verticalZoom) max(520, graphData.skillData.size * 34) else 520 }
        ChartLayout(
            modifier = Modifier.height(height.dp),
            legend = {
                val legends = if (graphData.paceMakerData.isEmpty()) defaultLegends else virtualLegends
                FlowLegend(
                    itemCount = legends.size,
                    symbol = { Symbol(shape = RectangleShape, fillBrush = SolidColor(legends[it].second)) },
                    label = { Text(LanguageManager.getText(legends[it].first)) },
                    modifier = Modifier.border(1.dp, Color.Black).padding(8.dp)
                )
            },
            legendLocation = LegendLocation.BOTTOM,
        ) {
            val xMax = (frameList.size - 1) / 15f
            XYGraph(
                xAxisModel = rememberFloatLinearAxisModel(0f..xMax),
                yAxisModel = rememberFloatLinearAxisModel(0f..1f),
                yAxisLabels = { "" },
            ) {
                AreaPlot(
                    data = graphData.straightData.map { Point(it.first, it.second) },
                    areaBaseline = AreaBaseline.ConstantLine(0f),
                    areaStyle = AreaStyle(SolidColor(Color(0, 128, 255)), 0.15f),
                )
                AreaPlot(
                    data = graphData.cornerData.map { Point(it.first, it.second) },
                    areaBaseline = AreaBaseline.ConstantLine(0f),
                    areaStyle = AreaStyle(SolidColor(Color(128, 0, 255)), 0.15f),
                )
                AreaPlot(
                    data = graphData.upSlopeData.map { Point(it.first, it.second + 0.1f) },
                    areaBaseline = AreaBaseline.ConstantLine(0.1f),
                    areaStyle = AreaStyle(SolidColor(Color(0, 255, 128)), 0.15f),
                )
                AreaPlot(
                    data = graphData.downSlopeData.map { Point(it.first, it.second + 0.1f) },
                    areaBaseline = AreaBaseline.ConstantLine(0.1f),
                    areaStyle = AreaStyle(SolidColor(Color(255, 255, 0)), 0.15f),
                )
                VerticalLineAnnotation(graphData.phase1Start, LineStyle(SolidColor(Color.Black), 1.dp, alpha = 0.8f))
                VerticalLineAnnotation(graphData.phase2Start, LineStyle(SolidColor(Color.Black), 1.dp, alpha = 0.8f))
                HorizontalLineAnnotation(graphData.staminaZero, LineStyle(SolidColor(Color.Black), 1.dp, alpha = 0.8f))
                LinePlot(
                    data = graphData.laneData.map { Point(it.first, it.second) },
                    lineStyle = LineStyle(SolidColor(Color.Green), 2.dp),
                )
                if (graphData.paceMakerData.isNotEmpty()) {
                    LinePlot(
                        data = graphData.paceMakerData.map { Point(it.first, it.second) },
                        lineStyle = LineStyle(SolidColor(Color(0, 255, 255)), 2.dp),
                    )
                }
                LinePlot(
                    data = graphData.speedData.map { Point(it.first, it.second) },
                    lineStyle = LineStyle(SolidColor(Color.Blue), 2.dp),
                )
                LinePlot(
                    data = graphData.staminaData.map { Point(it.first, it.second) },
                    lineStyle = LineStyle(SolidColor(Color(255, 128, 100)), 2.dp),
                )
                LinePlot(
                    data = graphData.staminaOverData.map { Point(it.first, it.second) },
                    lineStyle = LineStyle(SolidColor(Color.Red), 2.dp),
                )
                XYAnnotation(Point(0f, 0.05f), AnchorPoint.LeftMiddle) {
                    TooltipSurface(containerColor = Color(0, 0, 0, 128)) {
                        Text(LanguageManager.getText("直線(青)/コーナー(紫)"))
                    }
                }
                XYAnnotation(Point(0f, 0.15f), AnchorPoint.LeftMiddle) {
                    TooltipSurface(containerColor = Color(0, 0, 0, 128)) {
                        Text(LanguageManager.getText("上り坂(緑)/下り坂(黄)"))
                    }
                }
                if (graphData.skillData.isNotEmpty()) {
                    val skillMargin = min(0.1f, 0.8f / graphData.skillData.size)
                    graphData.skillData.forEachIndexed { index, skill ->
                        val top = 1f - skillMargin * index
                        XYAnnotation(Point(skill.start, top), AnchorPoint.TopLeft) {
                            if (skill.description.isEmpty()) {
                                TooltipSurface(containerColor = Color(0, 0, 0, 128)) {
                                    Text(LanguageManager.getText(skill.name))
                                }
                            } else {
                                WithTooltip(
                                    tooltip = {
                                        Text(LanguageManager.getText(skill.description))
                                    }
                                ) {
                                    TooltipSurface(containerColor = Color(0, 0, 0, 128)) {
                                        Text(LanguageManager.getText(skill.name))
                                    }
                                }
                            }
                        }
                        if (skill.end != null) {
                            LinePlot(
                                data = listOf(Point(skill.start, top - 0.003f), Point(skill.end, top - 0.003f)),
                                lineStyle = LineStyle(SolidColor(Color.Red), 2.dp),
                            )
                        }
                    }
                }
            }
        }
    }
}