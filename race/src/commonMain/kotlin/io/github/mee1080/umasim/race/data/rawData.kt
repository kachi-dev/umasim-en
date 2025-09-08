/*
 * Copyright 2023 mee1080
 *
 * This file is part of umasim.
 *
 * umasim is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * umasim is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with umasim.  If not, see <https://www.gnu.org/licenses/>.
 */
/*
 * This file was ported from uma-clock-emu by Romulus Urakagi Tsai(@urakagi)
 * https://github.com/urakagi/uma-clock-emu
 */
package io.github.mee1080.umasim.race.data

internal val rawCourseData = """
{
  "10001": {
    "name": "札幌",
    "courses": {
      "10101": {
        "raceTrackId": 10001,
        "name": "芝1200m",
        "distance": 1200,
        "distanceType": 1,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 13500,
        "finishTimeMin": 67.5,
        "finishTimeMax": 71.0,
        "corners": [
          {
            "length": 275,
            "start": 400
          },
          {
            "length": 275,
            "start": 675
          }
        ],
        "straights": [
          {
            "end": 400,
            "start": 0
          },
          {
            "end": 1200,
            "start": 950
          }
        ],
        "slopes": [
          {
            "start": 106,
            "length": 132,
            "slope": -13658.779454831994
          },
          {
            "start": 297,
            "length": 84,
            "slope": 13697.022475759184
          },
          {
            "start": 444,
            "length": 105,
            "slope": -13343.314315891834
          }
        ]
      },
      "10102": {
        "raceTrackId": 10001,
        "name": "芝1500m",
        "distance": 1500,
        "distanceType": 2,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 13500,
        "finishTimeMin": 87.9,
        "finishTimeMax": 95.0,
        "corners": [
          {
            "length": 275,
            "start": 150
          },
          {
            "length": 275,
            "start": 700
          },
          {
            "length": 275,
            "start": 975
          }
        ],
        "straights": [
          {
            "end": 700,
            "start": 425
          },
          {
            "end": 1500,
            "start": 1250
          }
        ],
        "slopes": [
          {
            "start": 621,
            "length": 27,
            "slope": 10224.118405066165
          },
          {
            "start": 726,
            "length": 126,
            "slope": -14747.959281922656
          }
        ]
      },
      "10103": {
        "raceTrackId": 10001,
        "name": "芝1800m",
        "distance": 1800,
        "distanceType": 2,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 13500,
        "finishTimeMin": 104.4,
        "finishTimeMax": 110.0,
        "corners": [
          {
            "length": 275,
            "start": 175
          },
          {
            "length": 275,
            "start": 450
          },
          {
            "length": 275,
            "start": 1000
          },
          {
            "length": 275,
            "start": 1275
          }
        ],
        "straights": [
          {
            "end": 175,
            "start": 0
          },
          {
            "end": 1000,
            "start": 725
          },
          {
            "end": 1800,
            "start": 1550
          }
        ],
        "slopes": [
          {
            "start": 866,
            "length": 102,
            "slope": 16575.984653375035
          },
          {
            "start": 1022,
            "length": 125,
            "slope": -14390.600844852579
          }
        ]
      },
      "10104": {
        "raceTrackId": 10001,
        "name": "芝2000m",
        "distance": 2000,
        "distanceType": 3,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          3
        ],
        "laneMax": 13500,
        "finishTimeMin": 117.1,
        "finishTimeMax": 123.0,
        "corners": [
          {
            "length": 275,
            "start": 375
          },
          {
            "length": 275,
            "start": 650
          },
          {
            "length": 275,
            "start": 1200
          },
          {
            "length": 275,
            "start": 1475
          }
        ],
        "straights": [
          {
            "end": 375,
            "start": 0
          },
          {
            "end": 1200,
            "start": 925
          },
          {
            "end": 2000,
            "start": 1750
          }
        ],
        "slopes": [
          {
            "start": 1075,
            "length": 91,
            "slope": 14837.395277821317
          },
          {
            "start": 1227,
            "length": 108,
            "slope": -13319.853613322479
          }
        ]
      },
      "10105": {
        "raceTrackId": 10001,
        "name": "芝2600m",
        "distance": 2600,
        "distanceType": 4,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          2
        ],
        "laneMax": 13500,
        "finishTimeMin": 157.6,
        "finishTimeMax": 165.0,
        "corners": [
          {
            "length": 275,
            "start": 175
          },
          {
            "length": 275,
            "start": 450
          },
          {
            "length": 275,
            "start": 975
          },
          {
            "length": 275,
            "start": 1250
          },
          {
            "length": 275,
            "start": 1800
          },
          {
            "length": 275,
            "start": 2075
          }
        ],
        "straights": [
          {
            "end": 175,
            "start": 0
          },
          {
            "end": 975,
            "start": 725
          },
          {
            "end": 1800,
            "start": 1525
          },
          {
            "end": 2600,
            "start": 2350
          }
        ],
        "slopes": [
          {
            "start": 34,
            "length": 37,
            "slope": 12718.643363708981
          },
          {
            "start": 92,
            "length": 73,
            "slope": 29058.64030040597
          },
          {
            "start": 219,
            "length": 55,
            "slope": -10712.038794833159
          },
          {
            "start": 850,
            "length": 238,
            "slope": -15575.624733528048
          },
          {
            "start": 1675,
            "length": 92,
            "slope": 14780.173684557452
          },
          {
            "start": 1827,
            "length": 108,
            "slope": -13318.094610903598
          }
        ]
      },
      "10106": {
        "raceTrackId": 10001,
        "name": "ダート1000m",
        "distance": 1000,
        "distanceType": 1,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 11000,
        "finishTimeMin": 57.4,
        "finishTimeMax": 63.0,
        "corners": [
          {
            "length": 230,
            "start": 280
          },
          {
            "length": 230,
            "start": 510
          }
        ],
        "straights": [
          {
            "end": 280,
            "start": 0
          },
          {
            "end": 1000,
            "start": 740
          }
        ],
        "slopes": [
          {
            "start": 284,
            "length": 95,
            "slope": -21478.67570922132
          }
        ]
      },
      "10107": {
        "raceTrackId": 10001,
        "name": "ダート1700m",
        "distance": 1700,
        "distanceType": 2,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [
          1
        ],
        "laneMax": 11000,
        "finishTimeMin": 101.4,
        "finishTimeMax": 113.0,
        "corners": [
          {
            "length": 230,
            "start": 240
          },
          {
            "length": 230,
            "start": 470
          },
          {
            "length": 230,
            "start": 980
          },
          {
            "length": 230,
            "start": 1210
          }
        ],
        "straights": [
          {
            "end": 240,
            "start": 0
          },
          {
            "end": 980,
            "start": 700
          },
          {
            "end": 1700,
            "start": 1440
          }
        ],
        "slopes": [
          {
            "start": 990,
            "length": 76,
            "slope": -14737.568337609882
          }
        ]
      },
      "10108": {
        "raceTrackId": 10001,
        "name": "ダート2400m",
        "distance": 2400,
        "distanceType": 3,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 11000,
        "finishTimeMin": 149.1,
        "finishTimeMax": 156.0,
        "corners": [
          {
            "length": 230,
            "start": 200
          },
          {
            "length": 230,
            "start": 430
          },
          {
            "length": 230,
            "start": 940
          },
          {
            "length": 230,
            "start": 1170
          },
          {
            "length": 230,
            "start": 1680
          },
          {
            "length": 230,
            "start": 1910
          }
        ],
        "straights": [
          {
            "end": 200,
            "start": 0
          },
          {
            "end": 940,
            "start": 660
          },
          {
            "end": 1680,
            "start": 1408
          },
          {
            "end": 2400,
            "start": 2140
          }
        ],
        "slopes": [
          {
            "start": 88,
            "length": 65,
            "slope": 11252.179456823753
          },
          {
            "start": 213,
            "length": 76,
            "slope": -15695.36457816174
          },
          {
            "start": 1689,
            "length": 77,
            "slope": -15620.212171927884
          }
        ]
      }
    }
  },
  "10002": {
    "name": "函館",
    "courses": {
      "10201": {
        "raceTrackId": 10002,
        "name": "芝1000m",
        "distance": 1000,
        "distanceType": 1,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 14700,
        "finishTimeMin": 54.7,
        "finishTimeMax": 57.0,
        "corners": [
          {
            "length": 220,
            "start": 310
          },
          {
            "length": 220,
            "start": 530
          }
        ],
        "straights": [
          {
            "end": 310,
            "start": 0
          },
          {
            "end": 1000,
            "start": 750
          }
        ],
        "slopes": []
      },
      "10202": {
        "raceTrackId": 10002,
        "name": "芝1200m",
        "distance": 1200,
        "distanceType": 1,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 14700,
        "finishTimeMin": 67.5,
        "finishTimeMax": 71.0,
        "corners": [
          {
            "length": 220,
            "start": 510
          },
          {
            "length": 220,
            "start": 730
          }
        ],
        "straights": [
          {
            "end": 510,
            "start": 0
          },
          {
            "end": 1200,
            "start": 950
          }
        ],
        "slopes": [
          {
            "start": 88,
            "length": 5,
            "slope": 10377.779997982689
          }
        ]
      },
      "10203": {
        "raceTrackId": 10002,
        "name": "芝1800m",
        "distance": 1800,
        "distanceType": 2,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          3
        ],
        "laneMax": 14700,
        "finishTimeMin": 104.4,
        "finishTimeMax": 110.0,
        "corners": [
          {
            "length": 220,
            "start": 320
          },
          {
            "length": 220,
            "start": 540
          },
          {
            "length": 220,
            "start": 1110
          },
          {
            "length": 220,
            "start": 1330
          }
        ],
        "straights": [
          {
            "end": 320,
            "start": 0
          },
          {
            "end": 1110,
            "start": 760
          },
          {
            "end": 1800,
            "start": 1550
          }
        ],
        "slopes": [
          {
            "start": 269,
            "length": 7,
            "slope": -13677.714437123861
          },
          {
            "start": 289,
            "length": 24,
            "slope": -13952.742703510228
          },
          {
            "start": 327,
            "length": 89,
            "slope": -15080.236875794983
          }
        ]
      },
      "10204": {
        "raceTrackId": 10002,
        "name": "芝2000m",
        "distance": 2000,
        "distanceType": 3,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          1
        ],
        "laneMax": 14700,
        "finishTimeMin": 117.1,
        "finishTimeMax": 123.0,
        "corners": [
          {
            "length": 220,
            "start": 520
          },
          {
            "length": 220,
            "start": 740
          },
          {
            "length": 220,
            "start": 1310
          },
          {
            "length": 220,
            "start": 1530
          }
        ],
        "straights": [
          {
            "end": 520,
            "start": 0
          },
          {
            "end": 1310,
            "start": 960
          },
          {
            "end": 2000,
            "start": 1750
          }
        ],
        "slopes": [
          {
            "start": 450,
            "length": 55,
            "slope": -15691.458160530909
          }
        ]
      },
      "10205": {
        "raceTrackId": 10002,
        "name": "芝2600m",
        "distance": 2600,
        "distanceType": 4,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          2
        ],
        "laneMax": 14700,
        "finishTimeMin": 157.6,
        "finishTimeMax": 165.0,
        "corners": [
          {
            "length": 230,
            "start": 240
          },
          {
            "length": 230,
            "start": 470
          },
          {
            "length": 230,
            "start": 1070
          },
          {
            "length": 230,
            "start": 1300
          },
          {
            "length": 230,
            "start": 1890
          },
          {
            "length": 230,
            "start": 2120
          }
        ],
        "straights": [
          {
            "end": 240,
            "start": 0
          },
          {
            "end": 1070,
            "start": 700
          },
          {
            "end": 1890,
            "start": 1530
          },
          {
            "end": 2600,
            "start": 2350
          }
        ],
        "slopes": [
          {
            "start": 1023,
            "length": 42,
            "slope": -15505.457447491166
          }
        ]
      },
      "10206": {
        "raceTrackId": 10002,
        "name": "ダート1000m",
        "distance": 1000,
        "distanceType": 1,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 11000,
        "finishTimeMin": 57.4,
        "finishTimeMax": 63.0,
        "corners": [
          {
            "length": 190,
            "start": 370
          },
          {
            "length": 190,
            "start": 560
          }
        ],
        "straights": [
          {
            "end": 370,
            "start": 0
          },
          {
            "end": 1000,
            "start": 750
          }
        ],
        "slopes": [
          {
            "start": 175,
            "length": 56,
            "slope": 11946.848354586788
          }
        ]
      },
      "10207": {
        "raceTrackId": 10002,
        "name": "ダート1700m",
        "distance": 1700,
        "distanceType": 2,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 11000,
        "finishTimeMin": 101.4,
        "finishTimeMax": 113.0,
        "corners": [
          {
            "length": 190,
            "start": 350
          },
          {
            "length": 190,
            "start": 540
          },
          {
            "length": 190,
            "start": 1070
          },
          {
            "length": 190,
            "start": 1260
          }
        ],
        "straights": [
          {
            "end": 350,
            "start": 0
          },
          {
            "end": 1070,
            "start": 730
          },
          {
            "end": 1700,
            "start": 1450
          }
        ],
        "slopes": [
          {
            "start": 300,
            "length": 35,
            "slope": -14669.526010262345
          },
          {
            "start": 353,
            "length": 7,
            "slope": -17155.535634318738
          }
        ]
      },
      "10208": {
        "raceTrackId": 10002,
        "name": "ダート2400m",
        "distance": 2400,
        "distanceType": 3,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [
          2
        ],
        "laneMax": 11000,
        "finishTimeMin": 149.1,
        "finishTimeMax": 156.0,
        "corners": [
          {
            "length": 190,
            "start": 292
          },
          {
            "length": 190,
            "start": 482
          },
          {
            "length": 190,
            "start": 1040
          },
          {
            "length": 190,
            "start": 1230
          },
          {
            "length": 190,
            "start": 1770
          },
          {
            "length": 190,
            "start": 1960
          }
        ],
        "straights": [
          {
            "end": 292,
            "start": 0
          },
          {
            "end": 1040,
            "start": 672
          },
          {
            "end": 1770,
            "start": 1420
          },
          {
            "end": 2400,
            "start": 2150
          }
        ],
        "slopes": [
          {
            "start": 682,
            "length": 78,
            "slope": -10820.432678147059
          },
          {
            "start": 972,
            "length": 5,
            "slope": -10661.391551836306
          },
          {
            "start": 1132,
            "length": 17,
            "slope": -10217.715231647
          },
          {
            "start": 2157,
            "length": 79,
            "slope": -10809.526250175513
          }
        ]
      }
    }
  },
  "10003": {
    "name": "新潟",
    "courses": {
      "10301": {
        "raceTrackId": 10003,
        "name": "芝1000m",
        "distance": 1000,
        "distanceType": 1,
        "surface": 1,
        "turn": 4,
        "courseSetStatus": [
          3
        ],
        "laneMax": 23500,
        "finishTimeMin": 54.7,
        "finishTimeMax": 57.0,
        "corners": [],
        "straights": [
          {
            "end": 649.9,
            "start": 0
          },
          {
            "end": 1000,
            "start": 650
          }
        ],
        "slopes": []
      },
      "10302": {
        "raceTrackId": 10003,
        "name": "芝1200m(内)",
        "distance": 1200,
        "distanceType": 1,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 13500,
        "finishTimeMin": 67.5,
        "finishTimeMax": 71.0,
        "corners": [
          {
            "length": 200,
            "start": 430
          },
          {
            "length": 210,
            "start": 640
          }
        ],
        "straights": [
          {
            "end": 430,
            "start": 0
          },
          {
            "end": 1200,
            "start": 850
          }
        ],
        "slopes": []
      },
      "10303": {
        "raceTrackId": 10003,
        "name": "芝1400m(内)",
        "distance": 1400,
        "distanceType": 1,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 13500,
        "finishTimeMin": 80.0,
        "finishTimeMax": 84.0,
        "corners": [
          {
            "length": 200,
            "start": 650
          },
          {
            "length": 200,
            "start": 850
          }
        ],
        "straights": [
          {
            "end": 650,
            "start": 0
          },
          {
            "end": 1400,
            "start": 1050
          }
        ],
        "slopes": []
      },
      "10304": {
        "raceTrackId": 10003,
        "name": "芝1600m(外)",
        "distance": 1600,
        "distanceType": 2,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 13500,
        "finishTimeMin": 90.8,
        "finishTimeMax": 95.0,
        "corners": [
          {
            "length": 200,
            "start": 550
          },
          {
            "length": 200,
            "start": 750
          }
        ],
        "straights": [
          {
            "end": 550,
            "start": 0
          },
          {
            "end": 1600,
            "start": 950
          }
        ],
        "slopes": [
          {
            "start": 552,
            "length": 16,
            "slope": 10506.281405337562
          }
        ]
      },
      "10305": {
        "raceTrackId": 10003,
        "name": "芝1800m(外)",
        "distance": 1800,
        "distanceType": 2,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [
          3
        ],
        "laneMax": 13500,
        "finishTimeMin": 104.4,
        "finishTimeMax": 110.0,
        "corners": [
          {
            "length": 200,
            "start": 750
          },
          {
            "length": 200,
            "start": 950
          }
        ],
        "straights": [
          {
            "end": 750,
            "start": 0
          },
          {
            "end": 1800,
            "start": 1150
          }
        ],
        "slopes": [
          {
            "start": 977,
            "length": 17,
            "slope": 10412.324731852608
          },
          {
            "start": 1308,
            "length": 57,
            "slope": -11611.562430774371
          }
        ]
      },
      "10306": {
        "raceTrackId": 10003,
        "name": "芝2000m(内)",
        "distance": 2000,
        "distanceType": 3,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [
          2,
          3
        ],
        "laneMax": 13500,
        "finishTimeMin": 117.1,
        "finishTimeMax": 123.0,
        "corners": [
          {
            "length": 200,
            "start": 420
          },
          {
            "length": 200,
            "start": 620
          },
          {
            "length": 200,
            "start": 1250
          },
          {
            "length": 200,
            "start": 1450
          }
        ],
        "straights": [
          {
            "end": 420,
            "start": 0
          },
          {
            "end": 1250,
            "start": 820
          },
          {
            "end": 2000,
            "start": 1650
          }
        ],
        "slopes": []
      },
      "10307": {
        "raceTrackId": 10003,
        "name": "芝2000m(外)",
        "distance": 2000,
        "distanceType": 3,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [
          2,
          3
        ],
        "laneMax": 13500,
        "finishTimeMin": 117.1,
        "finishTimeMax": 123.0,
        "corners": [
          {
            "length": 200,
            "start": 950
          },
          {
            "length": 200,
            "start": 1150
          }
        ],
        "straights": [
          {
            "end": 950,
            "start": 0
          },
          {
            "end": 2000,
            "start": 1350
          }
        ],
        "slopes": []
      },
      "10308": {
        "raceTrackId": 10003,
        "name": "芝2200m(内)",
        "distance": 2200,
        "distanceType": 3,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [
          1
        ],
        "laneMax": 13500,
        "finishTimeMin": 130.2,
        "finishTimeMax": 135.0,
        "corners": [
          {
            "length": 200,
            "start": 650
          },
          {
            "length": 200,
            "start": 850
          },
          {
            "length": 200,
            "start": 1450
          },
          {
            "length": 200,
            "start": 1650
          }
        ],
        "straights": [
          {
            "end": 650,
            "start": 0
          },
          {
            "end": 1450,
            "start": 1050
          },
          {
            "end": 2200,
            "start": 1850
          }
        ],
        "slopes": [
          {
            "start": 1235,
            "length": 237,
            "slope": 14598.359171359483
          }
        ]
      },
      "10309": {
        "raceTrackId": 10003,
        "name": "芝2400m(内)",
        "distance": 2400,
        "distanceType": 3,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 13500,
        "finishTimeMin": 141.6,
        "finishTimeMax": 149.0,
        "corners": [
          {
            "length": 200,
            "start": 810
          },
          {
            "length": 200,
            "start": 1010
          },
          {
            "length": 200,
            "start": 1650
          },
          {
            "length": 200,
            "start": 1850
          }
        ],
        "straights": [
          {
            "end": 810,
            "start": 0
          },
          {
            "end": 1650,
            "start": 1210
          },
          {
            "end": 2400,
            "start": 2050
          }
        ],
        "slopes": []
      },
      "10310": {
        "raceTrackId": 10003,
        "name": "ダート1200m",
        "distance": 1200,
        "distanceType": 1,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 11000,
        "finishTimeMin": 69.0,
        "finishTimeMax": 77.0,
        "corners": [
          {
            "length": 150,
            "start": 600
          },
          {
            "length": 150,
            "start": 750
          }
        ],
        "straights": [
          {
            "end": 600,
            "start": 0
          },
          {
            "end": 1200,
            "start": 900
          }
        ],
        "slopes": []
      },
      "10311": {
        "raceTrackId": 10003,
        "name": "ダート1800m",
        "distance": 1800,
        "distanceType": 2,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [
          5
        ],
        "laneMax": 11000,
        "finishTimeMin": 108.1,
        "finishTimeMax": 118.0,
        "corners": [
          {
            "length": 160,
            "start": 400
          },
          {
            "length": 160,
            "start": 560
          },
          {
            "length": 160,
            "start": 1140
          },
          {
            "length": 160,
            "start": 1300
          }
        ],
        "straights": [
          {
            "end": 400,
            "start": 0
          },
          {
            "end": 1140,
            "start": 720
          },
          {
            "end": 1800,
            "start": 1460
          }
        ],
        "slopes": [
          {
            "start": 727,
            "length": 5,
            "slope": 13123.952694019863
          },
          {
            "start": 755,
            "length": 31,
            "slope": -11361.85097906242
          },
          {
            "start": 1259,
            "length": 121,
            "slope": 15623.793490356129
          }
        ]
      },
      "10312": {
        "raceTrackId": 10003,
        "name": "ダート2500m",
        "distance": 2500,
        "distanceType": 4,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 11000,
        "finishTimeMin": 159.1,
        "finishTimeMax": 164.0,
        "corners": [
          {
            "length": 160,
            "start": 380
          },
          {
            "length": 160,
            "start": 540
          },
          {
            "length": 160,
            "start": 1120
          },
          {
            "length": 160,
            "start": 1280
          },
          {
            "length": 160,
            "start": 1850
          },
          {
            "length": 160,
            "start": 2010
          }
        ],
        "straights": [
          {
            "end": 380,
            "start": 0
          },
          {
            "end": 1120,
            "start": 700
          },
          {
            "end": 1850,
            "start": 1440
          },
          {
            "end": 2500,
            "start": 2170
          }
        ],
        "slopes": [
          {
            "start": 502,
            "length": 118,
            "slope": 14686.274488490442
          },
          {
            "start": 1968,
            "length": 118,
            "slope": 14729.297297497436
          }
        ]
      }
    }
  },
  "10004": {
    "name": "福島",
    "courses": {
      "10401": {
        "raceTrackId": 10004,
        "name": "芝1200m",
        "distance": 1200,
        "distanceType": 1,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 13000,
        "finishTimeMin": 67.5,
        "finishTimeMax": 71.0,
        "corners": [
          {
            "length": 300,
            "start": 420
          },
          {
            "length": 200,
            "start": 720
          }
        ],
        "straights": [
          {
            "end": 420,
            "start": 0
          },
          {
            "end": 1200,
            "start": 920
          }
        ],
        "slopes": [
          {
            "start": 179,
            "length": 110,
            "slope": 14609.331905840907
          }
        ]
      },
      "10402": {
        "raceTrackId": 10004,
        "name": "芝1800m",
        "distance": 1800,
        "distanceType": 2,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          2
        ],
        "laneMax": 13000,
        "finishTimeMin": 104.4,
        "finishTimeMax": 110.0,
        "corners": [
          {
            "length": 200,
            "start": 330
          },
          {
            "length": 200,
            "start": 530
          },
          {
            "length": 300,
            "start": 1020
          },
          {
            "length": 200,
            "start": 1320
          }
        ],
        "straights": [
          {
            "end": 330,
            "start": 0
          },
          {
            "end": 1020,
            "start": 730
          },
          {
            "end": 1800,
            "start": 1520
          }
        ],
        "slopes": [
          {
            "start": 71,
            "length": 52,
            "slope": 11489.510495665016
          },
          {
            "start": 790,
            "length": 85,
            "slope": 14877.228791094838
          },
          {
            "start": 1656,
            "length": 62,
            "slope": 13596.2834521564
          },
          {
            "start": 1744,
            "length": 26,
            "slope": 11639.332172552295
          }
        ]
      },
      "10403": {
        "raceTrackId": 10004,
        "name": "芝2000m",
        "distance": 2000,
        "distanceType": 3,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          2
        ],
        "laneMax": 13000,
        "finishTimeMin": 117.1,
        "finishTimeMax": 123.0,
        "corners": [
          {
            "length": 200,
            "start": 530
          },
          {
            "length": 200,
            "start": 730
          },
          {
            "length": 300,
            "start": 1220
          },
          {
            "length": 200,
            "start": 1520
          }
        ],
        "straights": [
          {
            "end": 530,
            "start": 0
          },
          {
            "end": 1220,
            "start": 930
          },
          {
            "end": 2000,
            "start": 1720
          }
        ],
        "slopes": [
          {
            "start": 243,
            "length": 7,
            "slope": 10180.232873211338
          },
          {
            "start": 258,
            "length": 10,
            "slope": 11189.921344335184
          },
          {
            "start": 505,
            "length": 34,
            "slope": -10238.790853016375
          },
          {
            "start": 989,
            "length": 85,
            "slope": 16947.568045831576
          },
          {
            "start": 1829,
            "length": 9,
            "slope": 10567.632783605504
          },
          {
            "start": 1939,
            "length": 9,
            "slope": 11232.61768948195
          }
        ]
      },
      "10404": {
        "raceTrackId": 10004,
        "name": "芝2600m",
        "distance": 2600,
        "distanceType": 4,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 13000,
        "finishTimeMin": 157.6,
        "finishTimeMax": 165.0,
        "corners": [
          {
            "length": 300,
            "start": 220
          },
          {
            "length": 200,
            "start": 520
          },
          {
            "length": 200,
            "start": 1130
          },
          {
            "length": 200,
            "start": 1330
          },
          {
            "length": 300,
            "start": 1820
          },
          {
            "length": 200,
            "start": 2120
          }
        ],
        "straights": [
          {
            "end": 220,
            "start": 0
          },
          {
            "end": 1130,
            "start": 720
          },
          {
            "end": 1820,
            "start": 1530
          },
          {
            "end": 2600,
            "start": 2320
          }
        ],
        "slopes": [
          {
            "start": 941,
            "length": 8,
            "slope": 10310.527598657683
          },
          {
            "start": 1604,
            "length": 62,
            "slope": 14203.253242134619
          },
          {
            "start": 1698,
            "length": 32,
            "slope": 11059.696039936845
          },
          {
            "start": 2540,
            "length": 32,
            "slope": 12901.58900524055
          }
        ]
      },
      "10405": {
        "raceTrackId": 10004,
        "name": "ダート1150m",
        "distance": 1150,
        "distanceType": 1,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 11500,
        "finishTimeMin": 66.6,
        "finishTimeMax": 72.0,
        "corners": [
          {
            "length": 210,
            "start": 500
          },
          {
            "length": 160,
            "start": 710
          }
        ],
        "straights": [
          {
            "end": 500,
            "start": 0
          },
          {
            "end": 1150,
            "start": 870
          }
        ],
        "slopes": [
          {
            "start": 220,
            "length": 34,
            "slope": 10306.810108378832
          },
          {
            "start": 899,
            "length": 2,
            "slope": -12164.854440936499
          }
        ]
      },
      "10406": {
        "raceTrackId": 10004,
        "name": "ダート1700m",
        "distance": 1700,
        "distanceType": 2,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [
          3
        ],
        "laneMax": 11500,
        "finishTimeMin": 101.4,
        "finishTimeMax": 113.0,
        "corners": [
          {
            "length": 170,
            "start": 360
          },
          {
            "length": 170,
            "start": 530
          },
          {
            "length": 210,
            "start": 1050
          },
          {
            "length": 160,
            "start": 1260
          }
        ],
        "straights": [
          {
            "end": 360,
            "start": 0
          },
          {
            "end": 1050,
            "start": 700
          },
          {
            "end": 1700,
            "start": 1420
          }
        ],
        "slopes": [
          {
            "start": 1487,
            "length": 37,
            "slope": 14478.120247496146
          },
          {
            "start": 1528,
            "length": 85,
            "slope": 16191.30014249566
          }
        ]
      },
      "10407": {
        "raceTrackId": 10004,
        "name": "ダート2400m",
        "distance": 2400,
        "distanceType": 3,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [
          2
        ],
        "laneMax": 11500,
        "finishTimeMin": 149.1,
        "finishTimeMax": 156.0,
        "corners": [
          {
            "length": 210,
            "start": 310
          },
          {
            "length": 160,
            "start": 520
          },
          {
            "length": 170,
            "start": 1060
          },
          {
            "length": 170,
            "start": 1230
          },
          {
            "length": 210,
            "start": 1750
          },
          {
            "length": 160,
            "start": 1960
          }
        ],
        "straights": [
          {
            "end": 310,
            "start": 0
          },
          {
            "end": 1060,
            "start": 680
          },
          {
            "end": 1750,
            "start": 1400
          },
          {
            "end": 2400,
            "start": 2120
          }
        ],
        "slopes": [
          {
            "start": 665,
            "length": 41,
            "slope": -12477.86502108696
          },
          {
            "start": 715,
            "length": 6,
            "slope": 11548.05815701408
          },
          {
            "start": 1065,
            "length": 76,
            "slope": -10974.069084446937
          },
          {
            "start": 2104,
            "length": 40,
            "slope": -12086.188898846149
          },
          {
            "start": 2153,
            "length": 5,
            "slope": 11312.290014552802
          }
        ]
      }
    }
  },
  "10005": {
    "name": "中山",
    "courses": {
      "10501": {
        "raceTrackId": 10005,
        "name": "芝1200m(外)",
        "distance": 1200,
        "distanceType": 1,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 12000,
        "finishTimeMin": 67.5,
        "finishTimeMax": 71.0,
        "corners": [
          {
            "length": 350,
            "start": 300
          },
          {
            "length": 250,
            "start": 650
          }
        ],
        "straights": [
          {
            "end": 1200,
            "start": 900
          }
        ],
        "slopes": [
          {
            "start": 989,
            "length": 127,
            "slope": 21088.359869318283
          },
          {
            "start": 1136,
            "length": 23,
            "slope": -10863.028289065298
          }
        ]
      },
      "10502": {
        "raceTrackId": 10005,
        "name": "芝1600m(外)",
        "distance": 1600,
        "distanceType": 2,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          3
        ],
        "laneMax": 12000,
        "finishTimeMin": 90.8,
        "finishTimeMax": 95.0,
        "corners": [
          {
            "length": 450,
            "start": 50
          },
          {
            "length": 350,
            "start": 700
          },
          {
            "length": 250,
            "start": 1050
          }
        ],
        "straights": [
          {
            "end": 1600,
            "start": 1300
          }
        ],
        "slopes": [
          {
            "start": 428,
            "length": 40,
            "slope": -10211.174741836965
          },
          {
            "start": 516,
            "length": 120,
            "slope": -10770.051474352502
          },
          {
            "start": 1395,
            "length": 123,
            "slope": 20820.16482922678
          },
          {
            "start": 1538,
            "length": 21,
            "slope": -10661.219913279016
          }
        ]
      },
      "10503": {
        "raceTrackId": 10005,
        "name": "芝1800m(内)",
        "distance": 1800,
        "distanceType": 2,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 12000,
        "finishTimeMin": 104.4,
        "finishTimeMax": 110.0,
        "corners": [
          {
            "length": 250,
            "start": 175
          },
          {
            "length": 250,
            "start": 425
          },
          {
            "length": 250,
            "start": 1000
          },
          {
            "length": 250,
            "start": 1250
          }
        ],
        "straights": [
          {
            "end": 175,
            "start": 0
          },
          {
            "end": 1000,
            "start": 675
          },
          {
            "end": 1800,
            "start": 1500
          }
        ],
        "slopes": [
          {
            "start": 186,
            "length": 153,
            "slope": 17178.162093529507
          },
          {
            "start": 584,
            "length": 113,
            "slope": -13456.321882282167
          },
          {
            "start": 749,
            "length": 61,
            "slope": -12337.192424818626
          },
          {
            "start": 820,
            "length": 29,
            "slope": -11079.98155362739
          },
          {
            "start": 1087,
            "length": 37,
            "slope": -11428.502769869006
          },
          {
            "start": 1594,
            "length": 124,
            "slope": 21005.444829378706
          },
          {
            "start": 1738,
            "length": 21,
            "slope": -10668.27940380635
          }
        ]
      },
      "10504": {
        "raceTrackId": 10005,
        "name": "芝2000m(内)",
        "distance": 2000,
        "distanceType": 3,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          1
        ],
        "laneMax": 12000,
        "finishTimeMin": 117.1,
        "finishTimeMax": 123.0,
        "corners": [
          {
            "length": 250,
            "start": 375
          },
          {
            "length": 250,
            "start": 625
          },
          {
            "length": 250,
            "start": 1200
          },
          {
            "length": 250,
            "start": 1450
          }
        ],
        "straights": [
          {
            "end": 375,
            "start": 0
          },
          {
            "end": 1200,
            "start": 875
          },
          {
            "end": 2000,
            "start": 1700
          }
        ],
        "slopes": [
          {
            "start": 122,
            "length": 102,
            "slope": 24991.80169399902
          },
          {
            "start": 381,
            "length": 154,
            "slope": 17101.57810220412
          },
          {
            "start": 781,
            "length": 113,
            "slope": -13464.950727730758
          },
          {
            "start": 946,
            "length": 62,
            "slope": -12307.298449896116
          },
          {
            "start": 1017,
            "length": 29,
            "slope": -11081.147406275955
          },
          {
            "start": 1284,
            "length": 39,
            "slope": -11698.691455465854
          },
          {
            "start": 1817,
            "length": 100,
            "slope": 25227.82430624795
          },
          {
            "start": 1939,
            "length": 18,
            "slope": -10449.450456666505
          }
        ]
      },
      "10505": {
        "raceTrackId": 10005,
        "name": "芝2200m(外)",
        "distance": 2200,
        "distanceType": 3,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          2,
          4
        ],
        "laneMax": 12000,
        "finishTimeMin": 130.2,
        "finishTimeMax": 135.0,
        "corners": [
          {
            "length": 247,
            "start": 403
          },
          {
            "length": 450,
            "start": 650
          },
          {
            "length": 350,
            "start": 1300
          },
          {
            "length": 250,
            "start": 1650
          }
        ],
        "straights": [
          {
            "end": 403,
            "start": 0
          },
          {
            "end": 2200,
            "start": 1900
          }
        ],
        "slopes": [
          {
            "start": 109,
            "length": 127,
            "slope": 21177.921222631485
          },
          {
            "start": 392,
            "length": 157,
            "slope": 17810.87826031241
          },
          {
            "start": 947,
            "length": 93,
            "slope": -11935.07078681866
          },
          {
            "start": 1992,
            "length": 127,
            "slope": 20939.05549994928
          }
        ]
      },
      "10506": {
        "raceTrackId": 10005,
        "name": "芝2500m(内)",
        "distance": 2500,
        "distanceType": 4,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          2,
          4
        ],
        "laneMax": 12000,
        "finishTimeMin": 148.7,
        "finishTimeMax": 157.0,
        "corners": [
          {
            "length": 146,
            "start": 100
          },
          {
            "length": 250,
            "start": 246
          },
          {
            "length": 250,
            "start": 875
          },
          {
            "length": 250,
            "start": 1125
          },
          {
            "length": 250,
            "start": 1700
          },
          {
            "length": 250,
            "start": 1950
          }
        ],
        "straights": [
          {
            "end": 875,
            "start": 496
          },
          {
            "end": 1700,
            "start": 1375
          },
          {
            "end": 2500,
            "start": 2200
          }
        ],
        "slopes": [
          {
            "start": 592,
            "length": 124,
            "slope": 20789.01714546094
          },
          {
            "start": 874,
            "length": 154,
            "slope": 17178.554916657224
          },
          {
            "start": 1276,
            "length": 113,
            "slope": -13483.84892604748
          },
          {
            "start": 1441,
            "length": 62,
            "slope": -12319.3554708876
          },
          {
            "start": 1513,
            "length": 29,
            "slope": -11084.328284107836
          },
          {
            "start": 1782,
            "length": 37,
            "slope": -11435.820015580415
          },
          {
            "start": 2293,
            "length": 125,
            "slope": 20876.64102975532
          },
          {
            "start": 2436,
            "length": 24,
            "slope": -10877.243568300275
          }
        ]
      },
      "10507": {
        "raceTrackId": 10005,
        "name": "芝3600m(内)",
        "distance": 3600,
        "distanceType": 4,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          2
        ],
        "laneMax": 12000,
        "finishTimeMin": 223.1,
        "finishTimeMax": 227.0,
        "corners": [
          {
            "length": 250,
            "start": 290
          },
          {
            "length": 250,
            "start": 540
          },
          {
            "length": 250,
            "start": 1115
          },
          {
            "length": 250,
            "start": 1365
          },
          {
            "length": 250,
            "start": 1975
          },
          {
            "length": 250,
            "start": 2225
          },
          {
            "length": 250,
            "start": 2800
          },
          {
            "length": 250,
            "start": 3050
          }
        ],
        "straights": [
          {
            "end": 290,
            "start": 0
          },
          {
            "end": 1115,
            "start": 790
          },
          {
            "end": 1975,
            "start": 1615
          },
          {
            "end": 2800,
            "start": 2475
          },
          {
            "end": 3600,
            "start": 3300
          }
        ],
        "slopes": [
          {
            "start": 34,
            "length": 120,
            "slope": 20907.94986661872
          },
          {
            "start": 309,
            "length": 153,
            "slope": 17050.3049029563
          },
          {
            "start": 707,
            "length": 258,
            "slope": -12832.797942614407
          },
          {
            "start": 1208,
            "length": 36,
            "slope": -11407.589618996573
          },
          {
            "start": 1712,
            "length": 124,
            "slope": 21086.575278375927
          },
          {
            "start": 1992,
            "length": 152,
            "slope": 17138.928331958945
          },
          {
            "start": 2389,
            "length": 259,
            "slope": -12814.961913313142
          },
          {
            "start": 2890,
            "length": 36,
            "slope": -11327.3314124099
          },
          {
            "start": 3395,
            "length": 123,
            "slope": 20504.585529266784
          }
        ]
      },
      "10508": {
        "raceTrackId": 10005,
        "name": "ダート1200m",
        "distance": 1200,
        "distanceType": 1,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [
          3
        ],
        "laneMax": 12000,
        "finishTimeMin": 69.0,
        "finishTimeMax": 77.0,
        "corners": [
          {
            "length": 200,
            "start": 500
          },
          {
            "length": 200,
            "start": 700
          }
        ],
        "straights": [
          {
            "end": 500,
            "start": 0
          },
          {
            "end": 1200,
            "start": 900
          }
        ],
        "slopes": [
          {
            "start": 200,
            "length": 188,
            "slope": -16658.741932756773
          },
          {
            "start": 989,
            "length": 178,
            "slope": 13644.799202773916
          }
        ]
      },
      "10509": {
        "raceTrackId": 10005,
        "name": "ダート1800m",
        "distance": 1800,
        "distanceType": 2,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [
          3
        ],
        "laneMax": 12000,
        "finishTimeMin": 108.1,
        "finishTimeMax": 118.0,
        "corners": [
          {
            "length": 200,
            "start": 350
          },
          {
            "length": 200,
            "start": 550
          },
          {
            "length": 200,
            "start": 1100
          },
          {
            "length": 200,
            "start": 1300
          }
        ],
        "straights": [
          {
            "end": 350,
            "start": 0
          },
          {
            "end": 1100,
            "start": 750
          },
          {
            "end": 1800,
            "start": 1500
          }
        ],
        "slopes": [
          {
            "start": 95,
            "length": 182,
            "slope": 13750.522418673829
          },
          {
            "start": 386,
            "length": 141,
            "slope": 13674.023801983383
          },
          {
            "start": 791,
            "length": 173,
            "slope": -17557.069258452273
          },
          {
            "start": 1588,
            "length": 186,
            "slope": 14631.5895166099
          }
        ]
      },
      "10510": {
        "raceTrackId": 10005,
        "name": "ダート2400m",
        "distance": 2400,
        "distanceType": 3,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [
          2
        ],
        "laneMax": 12000,
        "finishTimeMin": 149.1,
        "finishTimeMax": 156.0,
        "corners": [
          {
            "length": 200,
            "start": 200
          },
          {
            "length": 200,
            "start": 400
          },
          {
            "length": 200,
            "start": 950
          },
          {
            "length": 200,
            "start": 1150
          },
          {
            "length": 200,
            "start": 1700
          },
          {
            "length": 200,
            "start": 1900
          }
        ],
        "straights": [
          {
            "end": 200,
            "start": 0
          },
          {
            "end": 950,
            "start": 600
          },
          {
            "end": 1700,
            "start": 1350
          },
          {
            "end": 2400,
            "start": 2100
          }
        ],
        "slopes": [
          {
            "start": 693,
            "length": 160,
            "slope": 12801.460196133356
          },
          {
            "start": 858,
            "length": 20,
            "slope": 14167.694357850134
          },
          {
            "start": 975,
            "length": 149,
            "slope": 13739.296337102467
          },
          {
            "start": 1403,
            "length": 163,
            "slope": -16248.268907197978
          },
          {
            "start": 2193,
            "length": 158,
            "slope": 12616.675797665748
          },
          {
            "start": 2356,
            "length": 19,
            "slope": 15154.224425178587
          }
        ]
      },
      "10511": {
        "raceTrackId": 10005,
        "name": "ダート2500m",
        "distance": 2500,
        "distanceType": 4,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 12000,
        "finishTimeMin": 159.1,
        "finishTimeMax": 164.0,
        "corners": [
          {
            "length": 200,
            "start": 300
          },
          {
            "length": 200,
            "start": 500
          },
          {
            "length": 200,
            "start": 1050
          },
          {
            "length": 200,
            "start": 1250
          },
          {
            "length": 200,
            "start": 1800
          },
          {
            "length": 200,
            "start": 2000
          }
        ],
        "straights": [
          {
            "end": 300,
            "start": 0
          },
          {
            "end": 1050,
            "start": 700
          },
          {
            "end": 1800,
            "start": 1450
          },
          {
            "end": 2500,
            "start": 2200
          }
        ],
        "slopes": [
          {
            "start": 791,
            "length": 38,
            "slope": 14279.710689290103
          },
          {
            "start": 898,
            "length": 53,
            "slope": 10870.23074197992
          },
          {
            "start": 959,
            "length": 14,
            "slope": 13258.41740015674
          },
          {
            "start": 1075,
            "length": 151,
            "slope": 13643.745086074377
          },
          {
            "start": 1502,
            "length": 163,
            "slope": -16335.193325639164
          },
          {
            "start": 2289,
            "length": 39,
            "slope": 14160.295956105125
          },
          {
            "start": 2397,
            "length": 52,
            "slope": 10883.997680788249
          },
          {
            "start": 2456,
            "length": 16,
            "slope": 14207.004656244286
          }
        ]
      }
    }
  },
  "10006": {
    "name": "東京",
    "courses": {
      "10601": {
        "raceTrackId": 10006,
        "name": "芝1400m",
        "distance": 1400,
        "distanceType": 1,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [
          2,
          3
        ],
        "laneMax": 15000,
        "finishTimeMin": 80.0,
        "finishTimeMax": 84.0,
        "corners": [
          {
            "length": 275,
            "start": 350
          },
          {
            "length": 275,
            "start": 625
          }
        ],
        "straights": [
          {
            "end": 350,
            "start": 0
          },
          {
            "end": 1400,
            "start": 900
          }
        ],
        "slopes": [
          {
            "start": 134,
            "length": 78,
            "slope": 16252.76486295302
          },
          {
            "start": 223,
            "length": 4,
            "slope": -11679.321268797421
          },
          {
            "start": 360,
            "length": 19,
            "slope": -10067.625214670014
          },
          {
            "start": 952,
            "length": 37,
            "slope": 11263.329810484904
          },
          {
            "start": 995,
            "length": 99,
            "slope": 16911.94021152291
          }
        ]
      },
      "10602": {
        "raceTrackId": 10006,
        "name": "芝1600m",
        "distance": 1600,
        "distanceType": 2,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [
          2,
          4
        ],
        "laneMax": 15000,
        "finishTimeMin": 90.8,
        "finishTimeMax": 95.0,
        "corners": [
          {
            "length": 275,
            "start": 550
          },
          {
            "length": 275,
            "start": 825
          }
        ],
        "straights": [
          {
            "end": 550,
            "start": 0
          },
          {
            "end": 1600,
            "start": 1100
          }
        ],
        "slopes": [
          {
            "start": 328,
            "length": 73,
            "slope": 17490.441706794456
          },
          {
            "start": 450,
            "length": 122,
            "slope": -11228.133675293982
          },
          {
            "start": 1155,
            "length": 138,
            "slope": 12640.092371723707
          }
        ]
      },
      "10603": {
        "raceTrackId": 10006,
        "name": "芝1800m",
        "distance": 1800,
        "distanceType": 2,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [
          1
        ],
        "laneMax": 15000,
        "finishTimeMin": 104.4,
        "finishTimeMax": 110.0,
        "corners": [
          {
            "length": 250,
            "start": 75
          },
          {
            "length": 275,
            "start": 750
          },
          {
            "length": 275,
            "start": 1025
          }
        ],
        "straights": [
          {
            "end": 750,
            "start": 325
          },
          {
            "end": 1800,
            "start": 1300
          }
        ],
        "slopes": [
          {
            "start": 534,
            "length": 72,
            "slope": 17328.546707114085
          },
          {
            "start": 757,
            "length": 20,
            "slope": -10073.431791128573
          },
          {
            "start": 1350,
            "length": 38,
            "slope": 11417.657312537089
          },
          {
            "start": 1393,
            "length": 100,
            "slope": 16161.971741298941
          }
        ]
      },
      "10604": {
        "raceTrackId": 10006,
        "name": "芝2000m",
        "distance": 2000,
        "distanceType": 3,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 15000,
        "finishTimeMin": 117.1,
        "finishTimeMax": 123.0,
        "corners": [
          {
            "length": 200,
            "start": 200
          },
          {
            "length": 275,
            "start": 950
          },
          {
            "length": 275,
            "start": 1225
          }
        ],
        "straights": [
          {
            "end": 950,
            "start": 400
          },
          {
            "end": 2000,
            "start": 1500
          }
        ],
        "slopes": [
          {
            "start": 747,
            "length": 65,
            "slope": 17956.320511551166
          },
          {
            "start": 861,
            "length": 91,
            "slope": -12077.455152130877
          },
          {
            "start": 968,
            "length": 20,
            "slope": -10074.950449369784
          },
          {
            "start": 1554,
            "length": 38,
            "slope": 11347.966396822732
          },
          {
            "start": 1597,
            "length": 100,
            "slope": 16161.973838060941
          }
        ]
      },
      "10605": {
        "raceTrackId": 10006,
        "name": "芝2300m",
        "distance": 2300,
        "distanceType": 3,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [
          3
        ],
        "laneMax": 15000,
        "finishTimeMin": 139.3,
        "finishTimeMax": 143.0,
        "corners": [
          {
            "length": 250,
            "start": 225
          },
          {
            "length": 325,
            "start": 475
          },
          {
            "length": 275,
            "start": 1250
          },
          {
            "length": 275,
            "start": 1525
          }
        ],
        "straights": [
          {
            "end": 225,
            "start": 0
          },
          {
            "end": 1250,
            "start": 800
          },
          {
            "end": 2300,
            "start": 1800
          }
        ],
        "slopes": [
          {
            "start": 1026,
            "length": 70,
            "slope": 16858.811068660074
          },
          {
            "start": 1251,
            "length": 28,
            "slope": -10111.945422491326
          },
          {
            "start": 1847,
            "length": 39,
            "slope": 11364.982475399444
          },
          {
            "start": 1891,
            "length": 100,
            "slope": 16211.73161974994
          }
        ]
      },
      "10606": {
        "raceTrackId": 10006,
        "name": "芝2400m",
        "distance": 2400,
        "distanceType": 3,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 15000,
        "finishTimeMin": 141.6,
        "finishTimeMax": 149.0,
        "corners": [
          {
            "length": 250,
            "start": 325
          },
          {
            "length": 325,
            "start": 575
          },
          {
            "length": 275,
            "start": 1350
          },
          {
            "length": 275,
            "start": 1625
          }
        ],
        "straights": [
          {
            "end": 325,
            "start": 0
          },
          {
            "end": 1350,
            "start": 900
          },
          {
            "end": 2400,
            "start": 1900
          }
        ],
        "slopes": [
          {
            "start": 1132,
            "length": 15,
            "slope": 14190.653298333791
          },
          {
            "start": 1160,
            "length": 42,
            "slope": 16622.61793061984
          },
          {
            "start": 1337,
            "length": 31,
            "slope": -10124.287377321862
          },
          {
            "start": 1955,
            "length": 37,
            "slope": 11751.8422316221
          },
          {
            "start": 2065,
            "length": 28,
            "slope": 11875.955106549252
          }
        ]
      },
      "10607": {
        "raceTrackId": 10006,
        "name": "芝2500m",
        "distance": 2500,
        "distanceType": 4,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [
          2
        ],
        "laneMax": 15000,
        "finishTimeMin": 148.7,
        "finishTimeMax": 157.0,
        "corners": [
          {
            "length": 250,
            "start": 425
          },
          {
            "length": 325,
            "start": 675
          },
          {
            "length": 275,
            "start": 1450
          },
          {
            "length": 275,
            "start": 1725
          }
        ],
        "straights": [
          {
            "end": 425,
            "start": 0
          },
          {
            "end": 1450,
            "start": 1000
          },
          {
            "end": 2500,
            "start": 2000
          }
        ],
        "slopes": [
          {
            "start": 1216,
            "length": 77,
            "slope": 17393.801142259596
          },
          {
            "start": 1450,
            "length": 19,
            "slope": -10073.908975056796
          },
          {
            "start": 2051,
            "length": 140,
            "slope": 12577.247887061416
          }
        ]
      },
      "10608": {
        "raceTrackId": 10006,
        "name": "芝3400m",
        "distance": 3400,
        "distanceType": 4,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 15000,
        "finishTimeMin": 209.9,
        "finishTimeMax": 214.0,
        "corners": [
          {
            "length": 275,
            "start": 292
          },
          {
            "length": 275,
            "start": 567
          },
          {
            "length": 250,
            "start": 1325
          },
          {
            "length": 325,
            "start": 1575
          },
          {
            "length": 275,
            "start": 2350
          },
          {
            "length": 275,
            "start": 2625
          }
        ],
        "straights": [
          {
            "end": 292,
            "start": 0
          },
          {
            "end": 1325,
            "start": 842
          },
          {
            "end": 2350,
            "start": 1900
          },
          {
            "end": 3400,
            "start": 2900
          }
        ],
        "slopes": [
          {
            "start": 92,
            "length": 72,
            "slope": 17028.727375328952
          },
          {
            "start": 212,
            "length": 121,
            "slope": -11222.218067109237
          },
          {
            "start": 902,
            "length": 36,
            "slope": 11143.65733827984
          },
          {
            "start": 985,
            "length": 58,
            "slope": 12006.668369294142
          },
          {
            "start": 1124,
            "length": 190,
            "slope": -12795.075362310912
          },
          {
            "start": 2150,
            "length": 68,
            "slope": 16553.02391927578
          },
          {
            "start": 2266,
            "length": 91,
            "slope": -11557.651696046563
          },
          {
            "start": 2957,
            "length": 37,
            "slope": 11116.114087213666
          },
          {
            "start": 3040,
            "length": 57,
            "slope": 12037.68552168011
          }
        ]
      },
      "10609": {
        "raceTrackId": 10006,
        "name": "ダート1300m",
        "distance": 1300,
        "distanceType": 1,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [
          1
        ],
        "laneMax": 12500,
        "finishTimeMin": 76.6,
        "finishTimeMax": 82.0,
        "corners": [
          {
            "length": 225,
            "start": 350
          },
          {
            "length": 225,
            "start": 575
          }
        ],
        "straights": [
          {
            "end": 350,
            "start": 0
          },
          {
            "end": 1300,
            "start": 800
          }
        ],
        "slopes": [
          {
            "start": 96,
            "length": 115,
            "slope": 15417.846813735092
          },
          {
            "start": 249,
            "length": 51,
            "slope": -12300.76301477201
          },
          {
            "start": 1028,
            "length": 44,
            "slope": 10727.418215656287
          }
        ]
      },
      "10610": {
        "raceTrackId": 10006,
        "name": "ダート1400m",
        "distance": 1400,
        "distanceType": 1,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [
          2
        ],
        "laneMax": 12500,
        "finishTimeMin": 80.8,
        "finishTimeMax": 94.0,
        "corners": [
          {
            "length": 225,
            "start": 450
          },
          {
            "length": 225,
            "start": 675
          }
        ],
        "straights": [
          {
            "end": 450,
            "start": 0
          },
          {
            "end": 1400,
            "start": 900
          }
        ],
        "slopes": [
          {
            "start": 175,
            "length": 138,
            "slope": 17718.49834324574
          },
          {
            "start": 348,
            "length": 53,
            "slope": -12690.30714185386
          },
          {
            "start": 1128,
            "length": 44,
            "slope": 10728.105987879035
          }
        ]
      },
      "10611": {
        "raceTrackId": 10006,
        "name": "ダート1600m",
        "distance": 1600,
        "distanceType": 2,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [
          1,
          2
        ],
        "laneMax": 12500,
        "finishTimeMin": 94.1,
        "finishTimeMax": 108.0,
        "corners": [
          {
            "length": 225,
            "start": 650
          },
          {
            "length": 225,
            "start": 875
          }
        ],
        "straights": [
          {
            "end": 650,
            "start": 0
          },
          {
            "end": 1600,
            "start": 1100
          }
        ],
        "slopes": [
          {
            "start": 236,
            "length": 3,
            "slope": -10511.785963590699
          },
          {
            "start": 252,
            "length": 49,
            "slope": 15125.233511295446
          },
          {
            "start": 449,
            "length": 64,
            "slope": 12631.783723421648
          },
          {
            "start": 549,
            "length": 56,
            "slope": -13231.896593164298
          },
          {
            "start": 1277,
            "length": 102,
            "slope": 13785.63236277047
          }
        ]
      },
      "10612": {
        "raceTrackId": 10006,
        "name": "ダート2100m",
        "distance": 2100,
        "distanceType": 3,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 12500,
        "finishTimeMin": 127.4,
        "finishTimeMax": 133.0,
        "corners": [
          {
            "length": 250,
            "start": 200
          },
          {
            "length": 250,
            "start": 450
          },
          {
            "length": 225,
            "start": 1150
          },
          {
            "length": 225,
            "start": 1375
          }
        ],
        "straights": [
          {
            "end": 200,
            "start": 0
          },
          {
            "end": 1150,
            "start": 700
          },
          {
            "end": 2100,
            "start": 1600
          }
        ],
        "slopes": [
          {
            "start": 878,
            "length": 138,
            "slope": 13091.241290153857
          },
          {
            "start": 1052,
            "length": 55,
            "slope": -13047.081779551509
          },
          {
            "start": 1752,
            "length": 4,
            "slope": 10004.647923211056
          },
          {
            "start": 1877,
            "length": 7,
            "slope": 12648.028109330962
          }
        ]
      },
      "10613": {
        "raceTrackId": 10006,
        "name": "ダート2400m",
        "distance": 2400,
        "distanceType": 3,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [
          2
        ],
        "laneMax": 12500,
        "finishTimeMin": 149.1,
        "finishTimeMax": 156.0,
        "corners": [
          {
            "length": 250,
            "start": 500
          },
          {
            "length": 250,
            "start": 750
          },
          {
            "length": 225,
            "start": 1450
          },
          {
            "length": 225,
            "start": 1675
          },
          {
            "length": 500,
            "start": 2348
          }
        ],
        "straights": [
          {
            "end": 500,
            "start": 0
          },
          {
            "end": 1450,
            "start": 1000
          },
          {
            "end": 2400,
            "start": 1900
          }
        ],
        "slopes": [
          {
            "start": 57,
            "length": 134,
            "slope": 11963.901152971346
          },
          {
            "start": 214,
            "length": 104,
            "slope": 42775.01098774477
          },
          {
            "start": 362,
            "length": 175,
            "slope": 19727.53718117865
          },
          {
            "start": 1345,
            "length": 43,
            "slope": -27742.670452214283
          },
          {
            "start": 2021,
            "length": 79,
            "slope": 11496.402583043455
          },
          {
            "start": 2193,
            "length": 12,
            "slope": 10085.87972959639
          },
          {
            "start": 2252,
            "length": 97,
            "slope": -17081.25533433974
          }
        ]
      }
    }
  },
  "10007": {
    "name": "中京",
    "courses": {
      "10701": {
        "raceTrackId": 10007,
        "name": "芝1200m",
        "distance": 1200,
        "distanceType": 1,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 14400,
        "finishTimeMin": 67.5,
        "finishTimeMax": 71.0,
        "corners": [
          {
            "length": 250,
            "start": 300
          },
          {
            "length": 250,
            "start": 550
          }
        ],
        "straights": [
          {
            "end": 300,
            "start": 0
          },
          {
            "end": 1200,
            "start": 800
          }
        ],
        "slopes": [
          {
            "start": 851,
            "length": 114,
            "slope": 18967.378896797658
          },
          {
            "start": 1030,
            "length": 74,
            "slope": 11808.204199219508
          }
        ]
      },
      "10702": {
        "raceTrackId": 10007,
        "name": "芝1400m",
        "distance": 1400,
        "distanceType": 1,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 14400,
        "finishTimeMin": 80.0,
        "finishTimeMax": 84.0,
        "corners": [
          {
            "length": 250,
            "start": 500
          },
          {
            "length": 250,
            "start": 750
          }
        ],
        "straights": [
          {
            "end": 500,
            "start": 0
          },
          {
            "end": 1400,
            "start": 1000
          }
        ],
        "slopes": [
          {
            "start": 1062,
            "length": 117,
            "slope": 17747.3211292392
          },
          {
            "start": 1201,
            "length": 3,
            "slope": -10216.939990390934
          }
        ]
      },
      "10703": {
        "raceTrackId": 10007,
        "name": "芝1600m",
        "distance": 1600,
        "distanceType": 2,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [
          1
        ],
        "laneMax": 14400,
        "finishTimeMin": 90.8,
        "finishTimeMax": 95.0,
        "corners": [
          {
            "length": 150,
            "start": 150
          },
          {
            "length": 250,
            "start": 700
          },
          {
            "length": 250,
            "start": 950
          }
        ],
        "straights": [
          {
            "end": 700,
            "start": 300
          },
          {
            "end": 1600,
            "start": 1200
          }
        ],
        "slopes": [
          {
            "start": 1250,
            "length": 126,
            "slope": 18870.494856212194
          },
          {
            "start": 1400,
            "length": 2,
            "slope": -10980.51692662582
          }
        ]
      },
      "10704": {
        "raceTrackId": 10007,
        "name": "芝2000m",
        "distance": 2000,
        "distanceType": 3,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 14400,
        "finishTimeMin": 117.1,
        "finishTimeMax": 123.0,
        "corners": [
          {
            "length": 200,
            "start": 300
          },
          {
            "length": 200,
            "start": 500
          },
          {
            "length": 250,
            "start": 1100
          },
          {
            "length": 250,
            "start": 1350
          }
        ],
        "straights": [
          {
            "end": 300,
            "start": 0
          },
          {
            "end": 1100,
            "start": 700
          },
          {
            "end": 2000,
            "start": 1600
          }
        ],
        "slopes": [
          {
            "start": 95,
            "length": 3,
            "slope": -10769.549305262555
          },
          {
            "start": 138,
            "length": 79,
            "slope": 11627.438552024147
          },
          {
            "start": 1654,
            "length": 123,
            "slope": 17676.625841099984
          }
        ]
      },
      "10705": {
        "raceTrackId": 10007,
        "name": "芝2200m",
        "distance": 2200,
        "distanceType": 3,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [
          2
        ],
        "laneMax": 14400,
        "finishTimeMin": 130.2,
        "finishTimeMax": 135.0,
        "corners": [
          {
            "length": 200,
            "start": 500
          },
          {
            "length": 200,
            "start": 700
          },
          {
            "length": 250,
            "start": 1300
          },
          {
            "length": 250,
            "start": 1550
          }
        ],
        "straights": [
          {
            "end": 500,
            "start": 0
          },
          {
            "end": 1300,
            "start": 900
          },
          {
            "end": 2200,
            "start": 1800
          }
        ],
        "slopes": [
          {
            "start": 160,
            "length": 110,
            "slope": 17500.122390925975
          },
          {
            "start": 1862,
            "length": 108,
            "slope": 17326.651837121168
          }
        ]
      },
      "10706": {
        "raceTrackId": 10007,
        "name": "ダート1200m",
        "distance": 1200,
        "distanceType": 1,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 13000,
        "finishTimeMin": 69.0,
        "finishTimeMax": 77.0,
        "corners": [
          {
            "length": 200,
            "start": 400
          },
          {
            "length": 200,
            "start": 600
          }
        ],
        "straights": [
          {
            "end": 400,
            "start": 0
          },
          {
            "end": 1200,
            "start": 800
          }
        ],
        "slopes": [
          {
            "start": 872,
            "length": 108,
            "slope": 15359.154913731463
          },
          {
            "start": 989,
            "length": 2,
            "slope": 10054.117209159976
          }
        ]
      },
      "10707": {
        "raceTrackId": 10007,
        "name": "ダート1400m",
        "distance": 1400,
        "distanceType": 1,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 13000,
        "finishTimeMin": 80.8,
        "finishTimeMax": 94.0,
        "corners": [
          {
            "length": 200,
            "start": 600
          },
          {
            "length": 200,
            "start": 800
          }
        ],
        "straights": [
          {
            "end": 600,
            "start": 0
          },
          {
            "end": 1400,
            "start": 1000
          }
        ],
        "slopes": [
          {
            "start": 1082,
            "length": 105,
            "slope": 13865.05748983298
          }
        ]
      },
      "10708": {
        "raceTrackId": 10007,
        "name": "ダート1800m",
        "distance": 1800,
        "distanceType": 2,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [
          2
        ],
        "laneMax": 13000,
        "finishTimeMin": 108.1,
        "finishTimeMax": 118.0,
        "corners": [
          {
            "length": 165,
            "start": 270
          },
          {
            "length": 165,
            "start": 435
          },
          {
            "length": 200,
            "start": 1000
          },
          {
            "length": 200,
            "start": 1200
          }
        ],
        "straights": [
          {
            "end": 270,
            "start": 0
          },
          {
            "end": 1000,
            "start": 600
          },
          {
            "end": 1800,
            "start": 1400
          }
        ],
        "slopes": [
          {
            "start": 1481,
            "length": 125,
            "slope": 14447.7197419479
          }
        ]
      },
      "10709": {
        "raceTrackId": 10007,
        "name": "ダート1900m",
        "distance": 1900,
        "distanceType": 3,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 13000,
        "finishTimeMin": 114.2,
        "finishTimeMax": 123.0,
        "corners": [
          {
            "length": 165,
            "start": 370
          },
          {
            "length": 165,
            "start": 535
          },
          {
            "length": 200,
            "start": 1100
          },
          {
            "length": 200,
            "start": 1300
          }
        ],
        "straights": [
          {
            "end": 370,
            "start": 0
          },
          {
            "end": 1100,
            "start": 700
          },
          {
            "end": 1900,
            "start": 1500
          }
        ],
        "slopes": [
          {
            "start": 85,
            "length": 75,
            "slope": 10624.05137586846
          },
          {
            "start": 261,
            "length": 4,
            "slope": 10530.987705161495
          },
          {
            "start": 1571,
            "length": 127,
            "slope": 13501.579261859455
          }
        ]
      }
    }
  },
  "10008": {
    "name": "京都",
    "courses": {
      "10801": {
        "raceTrackId": 10008,
        "name": "芝1200m(内)",
        "distance": 1200,
        "distanceType": 1,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 14100,
        "finishTimeMin": 67.5,
        "finishTimeMax": 71.0,
        "corners": [
          {
            "length": 275,
            "start": 320
          },
          {
            "length": 275,
            "start": 595
          }
        ],
        "straights": [
          {
            "end": 320,
            "start": 0
          },
          {
            "end": 1200,
            "start": 870
          }
        ],
        "slopes": [
          {
            "start": 167,
            "length": 152,
            "slope": 19378.3025352294
          },
          {
            "start": 446,
            "length": 161,
            "slope": -16243.640275019949
          }
        ]
      },
      "10802": {
        "raceTrackId": 10008,
        "name": "芝1400m(内)",
        "distance": 1400,
        "distanceType": 1,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 14100,
        "finishTimeMin": 80.0,
        "finishTimeMax": 84.0,
        "corners": [
          {
            "length": 275,
            "start": 520
          },
          {
            "length": 275,
            "start": 795
          }
        ],
        "straights": [
          {
            "end": 520,
            "start": 0
          },
          {
            "end": 1400,
            "start": 1070
          }
        ],
        "slopes": [
          {
            "start": 386,
            "length": 131,
            "slope": 14922.919527052434
          },
          {
            "start": 645,
            "length": 161,
            "slope": -16245.26741271931
          }
        ]
      },
      "10803": {
        "raceTrackId": 10008,
        "name": "芝1400m(外)",
        "distance": 1400,
        "distanceType": 1,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 14100,
        "finishTimeMin": 80.0,
        "finishTimeMax": 84.0,
        "corners": [
          {
            "length": 250,
            "start": 500
          },
          {
            "length": 250,
            "start": 750
          }
        ],
        "straights": [
          {
            "end": 500,
            "start": 0
          },
          {
            "end": 1400,
            "start": 1000
          }
        ],
        "slopes": [
          {
            "start": 268,
            "length": 142,
            "slope": 15393.521819802356
          },
          {
            "start": 489,
            "length": 6,
            "slope": -10249.801772385132
          },
          {
            "start": 507,
            "length": 39,
            "slope": 22518.486356106492
          },
          {
            "start": 573,
            "length": 168,
            "slope": -23433.120477758912
          }
        ]
      },
      "10804": {
        "raceTrackId": 10008,
        "name": "芝1600m(内)",
        "distance": 1600,
        "distanceType": 2,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          1
        ],
        "laneMax": 14100,
        "finishTimeMin": 90.8,
        "finishTimeMax": 95.0,
        "corners": [
          {
            "length": 275,
            "start": 720
          },
          {
            "length": 275,
            "start": 995
          }
        ],
        "straights": [
          {
            "end": 720,
            "start": 200
          },
          {
            "end": 1600,
            "start": 1270
          }
        ],
        "slopes": [
          {
            "start": 552,
            "length": 128,
            "slope": 14674.391739048284
          },
          {
            "start": 813,
            "length": 168,
            "slope": -16234.227123305245
          }
        ]
      },
      "10805": {
        "raceTrackId": 10008,
        "name": "芝1600m(外)",
        "distance": 1600,
        "distanceType": 2,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          1
        ],
        "laneMax": 14100,
        "finishTimeMin": 90.8,
        "finishTimeMax": 95.0,
        "corners": [
          {
            "length": 250,
            "start": 700
          },
          {
            "length": 250,
            "start": 950
          }
        ],
        "straights": [
          {
            "end": 700,
            "start": 200
          },
          {
            "end": 1600,
            "start": 1200
          }
        ],
        "slopes": [
          {
            "start": 463,
            "length": 182,
            "slope": 16543.713742138785
          },
          {
            "start": 722,
            "length": 4,
            "slope": -10359.025326984814
          },
          {
            "start": 739,
            "length": 38,
            "slope": 22643.04781754876
          },
          {
            "start": 802,
            "length": 162,
            "slope": -23588.982173657412
          }
        ]
      },
      "10806": {
        "raceTrackId": 10008,
        "name": "芝1800m(外)",
        "distance": 1800,
        "distanceType": 2,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 14100,
        "finishTimeMin": 104.4,
        "finishTimeMax": 110.0,
        "corners": [
          {
            "length": 250,
            "start": 900
          },
          {
            "length": 250,
            "start": 1150
          }
        ],
        "straights": [
          {
            "end": 900,
            "start": 400
          },
          {
            "end": 1800,
            "start": 1400
          }
        ],
        "slopes": [
          {
            "start": 646,
            "length": 182,
            "slope": 16919.851977912487
          },
          {
            "start": 923,
            "length": 45,
            "slope": 22187.46904941495
          },
          {
            "start": 990,
            "length": 164,
            "slope": -23542.658605764354
          }
        ]
      },
      "10807": {
        "raceTrackId": 10008,
        "name": "芝2000m(内)",
        "distance": 2000,
        "distanceType": 3,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          3
        ],
        "laneMax": 14100,
        "finishTimeMin": 117.1,
        "finishTimeMax": 123.0,
        "corners": [
          {
            "length": 185,
            "start": 400
          },
          {
            "length": 185,
            "start": 585
          },
          {
            "length": 250,
            "start": 1170
          },
          {
            "length": 250,
            "start": 1420
          }
        ],
        "straights": [
          {
            "end": 400,
            "start": 0
          },
          {
            "end": 1170,
            "start": 770
          },
          {
            "end": 2000,
            "start": 1670
          }
        ],
        "slopes": [
          {
            "start": 1045,
            "length": 114,
            "slope": 14977.787009357296
          },
          {
            "start": 1280,
            "length": 154,
            "slope": -16493.81272702919
          }
        ]
      },
      "10808": {
        "raceTrackId": 10008,
        "name": "芝2200m(外)",
        "distance": 2200,
        "distanceType": 3,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          1
        ],
        "laneMax": 14100,
        "finishTimeMin": 130.2,
        "finishTimeMax": 135.0,
        "corners": [
          {
            "length": 200,
            "start": 400
          },
          {
            "length": 200,
            "start": 600
          },
          {
            "length": 250,
            "start": 1300
          },
          {
            "length": 250,
            "start": 1550
          }
        ],
        "straights": [
          {
            "end": 400,
            "start": 0
          },
          {
            "end": 1300,
            "start": 800
          },
          {
            "end": 2200,
            "start": 1800
          }
        ],
        "slopes": [
          {
            "start": 1038,
            "length": 180,
            "slope": 17169.220114259668
          },
          {
            "start": 1318,
            "length": 47,
            "slope": 20040.646584847855
          },
          {
            "start": 1383,
            "length": 167,
            "slope": -23602.339219520214
          }
        ]
      },
      "10809": {
        "raceTrackId": 10008,
        "name": "芝2400m(外)",
        "distance": 2400,
        "distanceType": 3,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          3
        ],
        "laneMax": 14100,
        "finishTimeMin": 141.6,
        "finishTimeMax": 149.0,
        "corners": [
          {
            "length": 200,
            "start": 600
          },
          {
            "length": 200,
            "start": 800
          },
          {
            "length": 250,
            "start": 1500
          },
          {
            "length": 250,
            "start": 1750
          }
        ],
        "straights": [
          {
            "end": 600,
            "start": 0
          },
          {
            "end": 1500,
            "start": 1000
          },
          {
            "end": 2400,
            "start": 2000
          }
        ],
        "slopes": [
          {
            "start": 1240,
            "length": 182,
            "slope": 16815.62933977
          },
          {
            "start": 1502,
            "length": 7,
            "slope": -10488.591385021755
          },
          {
            "start": 1521,
            "length": 47,
            "slope": 22704.71090978517
          },
          {
            "start": 1585,
            "length": 166,
            "slope": -24025.448472426408
          }
        ]
      },
      "10810": {
        "raceTrackId": 10008,
        "name": "芝3000m(外)",
        "distance": 3000,
        "distanceType": 4,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          3,
          5
        ],
        "laneMax": 14100,
        "finishTimeMin": 181.5,
        "finishTimeMax": 190.0,
        "corners": [
          {
            "length": 250,
            "start": 261
          },
          {
            "length": 250,
            "start": 511
          },
          {
            "length": 200,
            "start": 1250
          },
          {
            "length": 200,
            "start": 1450
          },
          {
            "length": 250,
            "start": 2100
          },
          {
            "length": 250,
            "start": 2350
          }
        ],
        "straights": [
          {
            "end": 261,
            "start": 0
          },
          {
            "end": 1250,
            "start": 761
          },
          {
            "end": 2100,
            "start": 1650
          },
          {
            "end": 3000,
            "start": 2600
          }
        ],
        "slopes": [
          {
            "start": 21,
            "length": 178,
            "slope": 19798.18021261757
          },
          {
            "start": 279,
            "length": 5,
            "slope": -10110.222966701731
          },
          {
            "start": 297,
            "length": 45,
            "slope": 23107.50728706
          },
          {
            "start": 361,
            "length": 162,
            "slope": -23628.24058720927
          },
          {
            "start": 1857,
            "length": 179,
            "slope": 16751.337046764864
          },
          {
            "start": 2117,
            "length": 4,
            "slope": -10128.53395171957
          },
          {
            "start": 2134,
            "length": 45,
            "slope": 22550.316354863815
          },
          {
            "start": 2198,
            "length": 163,
            "slope": -23576.572682858376
          }
        ]
      },
      "10811": {
        "raceTrackId": 10008,
        "name": "芝3200m(外)",
        "distance": 3200,
        "distanceType": 4,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 14100,
        "finishTimeMin": 193.0,
        "finishTimeMax": 204.0,
        "corners": [
          {
            "length": 250,
            "start": 458
          },
          {
            "length": 250,
            "start": 708
          },
          {
            "length": 200,
            "start": 1450
          },
          {
            "length": 200,
            "start": 1650
          },
          {
            "length": 250,
            "start": 2300
          },
          {
            "length": 250,
            "start": 2550
          }
        ],
        "straights": [
          {
            "end": 458,
            "start": 0
          },
          {
            "end": 1450,
            "start": 958
          },
          {
            "end": 2300,
            "start": 1850
          },
          {
            "end": 3200,
            "start": 2800
          }
        ],
        "slopes": [
          {
            "start": 215,
            "length": 181,
            "slope": 16705.24699992756
          },
          {
            "start": 476,
            "length": 3,
            "slope": -10182.787858575715
          },
          {
            "start": 493,
            "length": 36,
            "slope": 23600.98533606718
          },
          {
            "start": 556,
            "length": 164,
            "slope": -23563.194888626876
          },
          {
            "start": 2055,
            "length": 181,
            "slope": 16705.126009114043
          },
          {
            "start": 2316,
            "length": 3,
            "slope": -10184.39321121843
          },
          {
            "start": 2333,
            "length": 36,
            "slope": 23627.51745296099
          },
          {
            "start": 2396,
            "length": 164,
            "slope": -23562.618021432423
          }
        ]
      },
      "10812": {
        "raceTrackId": 10008,
        "name": "ダート1200m",
        "distance": 1200,
        "distanceType": 1,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 13000,
        "finishTimeMin": 69.0,
        "finishTimeMax": 77.0,
        "corners": [
          {
            "length": 225,
            "start": 400
          },
          {
            "length": 225,
            "start": 625
          }
        ],
        "straights": [
          {
            "end": 400,
            "start": 0
          },
          {
            "end": 1200,
            "start": 850
          }
        ],
        "slopes": [
          {
            "start": 245,
            "length": 157,
            "slope": 16863.6865674206
          },
          {
            "start": 471,
            "length": 102,
            "slope": -14780.13549936777
          }
        ]
      },
      "10813": {
        "raceTrackId": 10008,
        "name": "ダート1400m",
        "distance": 1400,
        "distanceType": 1,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 13000,
        "finishTimeMin": 80.8,
        "finishTimeMax": 94.0,
        "corners": [
          {
            "length": 225,
            "start": 600
          },
          {
            "length": 225,
            "start": 825
          }
        ],
        "straights": [
          {
            "end": 600,
            "start": 100
          },
          {
            "end": 1400,
            "start": 1050
          }
        ],
        "slopes": [
          {
            "start": 477,
            "length": 140,
            "slope": 17189.16216130649
          },
          {
            "start": 693,
            "length": 190,
            "slope": -12970.357582265451
          }
        ]
      },
      "10814": {
        "raceTrackId": 10008,
        "name": "ダート1800m",
        "distance": 1800,
        "distanceType": 2,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 13000,
        "finishTimeMin": 108.1,
        "finishTimeMax": 118.0,
        "corners": [
          {
            "length": 150,
            "start": 300
          },
          {
            "length": 150,
            "start": 450
          },
          {
            "length": 225,
            "start": 1000
          },
          {
            "length": 225,
            "start": 1225
          }
        ],
        "straights": [
          {
            "end": 300,
            "start": 0
          },
          {
            "end": 1000,
            "start": 600
          },
          {
            "end": 1800,
            "start": 1450
          }
        ],
        "slopes": [
          {
            "start": 837,
            "length": 168,
            "slope": 19481.409973602193
          },
          {
            "start": 1079,
            "length": 96,
            "slope": -17841.784747871447
          }
        ]
      },
      "10815": {
        "raceTrackId": 10008,
        "name": "ダート1900m",
        "distance": 1900,
        "distanceType": 3,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 13000,
        "finishTimeMin": 114.2,
        "finishTimeMax": 123.0,
        "corners": [
          {
            "length": 150,
            "start": 400
          },
          {
            "length": 150,
            "start": 550
          },
          {
            "length": 225,
            "start": 1100
          },
          {
            "length": 225,
            "start": 1325
          }
        ],
        "straights": [
          {
            "end": 400,
            "start": 0
          },
          {
            "end": 1100,
            "start": 700
          },
          {
            "end": 1900,
            "start": 1550
          }
        ],
        "slopes": [
          {
            "start": 940,
            "length": 168,
            "slope": 18283.781247768184
          },
          {
            "start": 1188,
            "length": 195,
            "slope": -14402.11636525795
          }
        ]
      }
    }
  },
  "10009": {
    "name": "阪神",
    "courses": {
      "10901": {
        "raceTrackId": 10009,
        "name": "芝1200m(内)",
        "distance": 1200,
        "distanceType": 1,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 12500,
        "finishTimeMin": 67.5,
        "finishTimeMax": 71.0,
        "corners": [
          {
            "length": 300,
            "start": 250
          },
          {
            "length": 300,
            "start": 550
          }
        ],
        "straights": [
          {
            "end": 250,
            "start": 0
          },
          {
            "end": 1200,
            "start": 850
          }
        ],
        "slopes": [
          {
            "start": 1012,
            "length": 114,
            "slope": 15108.698657879435
          },
          {
            "start": 1129,
            "length": 11,
            "slope": 12919.742062984498
          }
        ]
      },
      "10902": {
        "raceTrackId": 10009,
        "name": "芝1400m(内)",
        "distance": 1400,
        "distanceType": 1,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 12500,
        "finishTimeMin": 80.0,
        "finishTimeMax": 84.0,
        "corners": [
          {
            "length": 300,
            "start": 450
          },
          {
            "length": 300,
            "start": 750
          }
        ],
        "straights": [
          {
            "end": 450,
            "start": 0
          },
          {
            "end": 1400,
            "start": 1050
          }
        ],
        "slopes": [
          {
            "start": 1212,
            "length": 116,
            "slope": 14976.926550616625
          },
          {
            "start": 1328,
            "length": 12,
            "slope": 12993.502603808056
          }
        ]
      },
      "10903": {
        "raceTrackId": 10009,
        "name": "芝1600m(外)",
        "distance": 1600,
        "distanceType": 2,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          3
        ],
        "laneMax": 12500,
        "finishTimeMin": 90.8,
        "finishTimeMax": 95.0,
        "corners": [
          {
            "length": 350,
            "start": 450
          },
          {
            "length": 350,
            "start": 800
          }
        ],
        "straights": [
          {
            "end": 450,
            "start": 0
          },
          {
            "end": 1600,
            "start": 1150
          }
        ],
        "slopes": [
          {
            "start": 363,
            "length": 22,
            "slope": 11141.063686653439
          },
          {
            "start": 1411,
            "length": 114,
            "slope": 15251.135124038405
          },
          {
            "start": 1528,
            "length": 12,
            "slope": 12509.843450900318
          }
        ]
      },
      "10904": {
        "raceTrackId": 10009,
        "name": "芝1800m(外)",
        "distance": 1800,
        "distanceType": 2,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          3
        ],
        "laneMax": 12500,
        "finishTimeMin": 104.4,
        "finishTimeMax": 110.0,
        "corners": [
          {
            "length": 350,
            "start": 650
          },
          {
            "length": 350,
            "start": 1000
          }
        ],
        "straights": [
          {
            "end": 650,
            "start": 0
          },
          {
            "end": 1800,
            "start": 1350
          }
        ],
        "slopes": [
          {
            "start": 569,
            "length": 22,
            "slope": 11121.157347994003
          },
          {
            "start": 1611,
            "length": 129,
            "slope": 14727.337771174274
          }
        ]
      },
      "10905": {
        "raceTrackId": 10009,
        "name": "芝2000m(内)",
        "distance": 2000,
        "distanceType": 3,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          4
        ],
        "laneMax": 12500,
        "finishTimeMin": 117.1,
        "finishTimeMax": 123.0,
        "corners": [
          {
            "length": 190,
            "start": 370
          },
          {
            "length": 190,
            "start": 560
          },
          {
            "length": 300,
            "start": 1050
          },
          {
            "length": 300,
            "start": 1350
          }
        ],
        "straights": [
          {
            "end": 370,
            "start": 0
          },
          {
            "end": 1050,
            "start": 750
          },
          {
            "end": 2000,
            "start": 1650
          }
        ],
        "slopes": [
          {
            "start": 163,
            "length": 113,
            "slope": 15220.414823767574
          },
          {
            "start": 279,
            "length": 11,
            "slope": 13126.63971671884
          },
          {
            "start": 1813,
            "length": 113,
            "slope": 15141.473855088745
          },
          {
            "start": 1929,
            "length": 12,
            "slope": 12552.182074656168
          }
        ]
      },
      "10906": {
        "raceTrackId": 10009,
        "name": "芝2200m(内)",
        "distance": 2200,
        "distanceType": 3,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          1
        ],
        "laneMax": 12500,
        "finishTimeMin": 130.2,
        "finishTimeMax": 135.0,
        "corners": [
          {
            "length": 190,
            "start": 520
          },
          {
            "length": 190,
            "start": 710
          },
          {
            "length": 300,
            "start": 1250
          },
          {
            "length": 300,
            "start": 1550
          }
        ],
        "straights": [
          {
            "end": 520,
            "start": 0
          },
          {
            "end": 1250,
            "start": 900
          },
          {
            "end": 2200,
            "start": 1850
          }
        ],
        "slopes": [
          {
            "start": 310,
            "length": 116,
            "slope": 15230.47201687792
          },
          {
            "start": 430,
            "length": 11,
            "slope": 13141.7643011536
          },
          {
            "start": 2007,
            "length": 116,
            "slope": 15142.497852776145
          },
          {
            "start": 2127,
            "length": 12,
            "slope": 12738.6653432378
          }
        ]
      },
      "10907": {
        "raceTrackId": 10009,
        "name": "芝2400m(外)",
        "distance": 2400,
        "distanceType": 3,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          3
        ],
        "laneMax": 12500,
        "finishTimeMin": 141.6,
        "finishTimeMax": 149.0,
        "corners": [
          {
            "length": 190,
            "start": 382
          },
          {
            "length": 190,
            "start": 558
          },
          {
            "length": 350,
            "start": 1250
          },
          {
            "length": 350,
            "start": 1600
          }
        ],
        "straights": [
          {
            "end": 1250,
            "start": 750
          },
          {
            "end": 2400,
            "start": 1950
          }
        ],
        "slopes": [
          {
            "start": 163,
            "length": 114,
            "slope": 15190.960209841982
          },
          {
            "start": 280,
            "length": 11,
            "slope": 13356.610788921129
          },
          {
            "start": 1172,
            "length": 22,
            "slope": 11098.928959352259
          },
          {
            "start": 2212,
            "length": 113,
            "slope": 15250.197111588011
          },
          {
            "start": 2329,
            "length": 11,
            "slope": 12516.421074555561
          }
        ]
      },
      "10908": {
        "raceTrackId": 10009,
        "name": "芝2600m(外)",
        "distance": 2600,
        "distanceType": 4,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 12500,
        "finishTimeMin": 157.6,
        "finishTimeMax": 165.0,
        "corners": [
          {
            "length": 190,
            "start": 570
          },
          {
            "length": 190,
            "start": 760
          },
          {
            "length": 350,
            "start": 1450
          },
          {
            "length": 350,
            "start": 1800
          }
        ],
        "straights": [
          {
            "end": 570,
            "start": 0
          },
          {
            "end": 1450,
            "start": 950
          },
          {
            "end": 2600,
            "start": 2150
          }
        ],
        "slopes": [
          {
            "start": 360,
            "length": 114,
            "slope": 15190.391311808322
          },
          {
            "start": 477,
            "length": 11,
            "slope": 13113.58549313965
          },
          {
            "start": 1370,
            "length": 22,
            "slope": 11081.529696479987
          },
          {
            "start": 2412,
            "length": 113,
            "slope": 15258.73896602605
          },
          {
            "start": 2529,
            "length": 11,
            "slope": 12955.840000889535
          }
        ]
      },
      "10909": {
        "raceTrackId": 10009,
        "name": "芝3000m(内)",
        "distance": 3000,
        "distanceType": 4,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          3
        ],
        "laneMax": 12500,
        "finishTimeMin": 181.5,
        "finishTimeMax": 190.0,
        "corners": [
          {
            "length": 300,
            "start": 348
          },
          {
            "length": 300,
            "start": 648
          },
          {
            "length": 190,
            "start": 1320
          },
          {
            "length": 190,
            "start": 1510
          },
          {
            "length": 300,
            "start": 2050
          },
          {
            "length": 300,
            "start": 2350
          }
        ],
        "straights": [
          {
            "end": 348,
            "start": 0
          },
          {
            "end": 1320,
            "start": 948
          },
          {
            "end": 2050,
            "start": 1700
          },
          {
            "end": 3000,
            "start": 2650
          }
        ],
        "slopes": [
          {
            "start": 1107,
            "length": 116,
            "slope": 15149.838653967885
          },
          {
            "start": 1226,
            "length": 13,
            "slope": 12709.6703317389
          },
          {
            "start": 2807,
            "length": 116,
            "slope": 15148.460436499508
          },
          {
            "start": 2926,
            "length": 13,
            "slope": 12436.067874714365
          }
        ]
      },
      "10910": {
        "raceTrackId": 10009,
        "name": "ダート1200m",
        "distance": 1200,
        "distanceType": 1,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 12000,
        "finishTimeMin": 69.0,
        "finishTimeMax": 77.0,
        "corners": [
          {
            "length": 250,
            "start": 350
          },
          {
            "length": 250,
            "start": 600
          }
        ],
        "straights": [
          {
            "end": 350,
            "start": 0
          },
          {
            "end": 1200,
            "start": 850
          }
        ],
        "slopes": [
          {
            "start": 1110,
            "length": 59,
            "slope": 12347.434135345244
          }
        ]
      },
      "10911": {
        "raceTrackId": 10009,
        "name": "ダート1400m",
        "distance": 1400,
        "distanceType": 1,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 12000,
        "finishTimeMin": 80.8,
        "finishTimeMax": 94.0,
        "corners": [
          {
            "length": 250,
            "start": 550
          },
          {
            "length": 250,
            "start": 800
          }
        ],
        "straights": [
          {
            "end": 550,
            "start": 0
          },
          {
            "end": 1400,
            "start": 1050
          }
        ],
        "slopes": [
          {
            "start": 441,
            "length": 56,
            "slope": -11899.53010640554
          },
          {
            "start": 1310,
            "length": 59,
            "slope": 12346.801747018537
          }
        ]
      },
      "10912": {
        "raceTrackId": 10009,
        "name": "ダート1800m",
        "distance": 1800,
        "distanceType": 2,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 12000,
        "finishTimeMin": 108.1,
        "finishTimeMax": 118.0,
        "corners": [
          {
            "length": 150,
            "start": 330
          },
          {
            "length": 150,
            "start": 480
          },
          {
            "length": 250,
            "start": 950
          },
          {
            "length": 250,
            "start": 1200
          }
        ],
        "straights": [
          {
            "end": 330,
            "start": 0
          },
          {
            "end": 950,
            "start": 630
          },
          {
            "end": 1800,
            "start": 1449
          }
        ],
        "slopes": [
          {
            "start": 221,
            "length": 54,
            "slope": 12119.429477668806
          },
          {
            "start": 1710,
            "length": 59,
            "slope": 12340.655078339623
          }
        ]
      },
      "10913": {
        "raceTrackId": 10009,
        "name": "ダート2000m",
        "distance": 2000,
        "distanceType": 3,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [
          2,
          3
        ],
        "laneMax": 12000,
        "finishTimeMin": 121.9,
        "finishTimeMax": 129.0,
        "corners": [
          {
            "length": 150,
            "start": 500
          },
          {
            "length": 150,
            "start": 650
          },
          {
            "length": 250,
            "start": 1150
          },
          {
            "length": 250,
            "start": 1400
          }
        ],
        "straights": [
          {
            "end": 500,
            "start": 0
          },
          {
            "end": 1150,
            "start": 800
          },
          {
            "end": 2000,
            "start": 1650
          }
        ],
        "slopes": [
          {
            "start": 373,
            "length": 47,
            "slope": 10791.623402670139
          },
          {
            "start": 517,
            "length": 112,
            "slope": 18091.521927762085
          },
          {
            "start": 1907,
            "length": 61,
            "slope": 12312.279266997792
          }
        ]
      },
      "10914": {
        "raceTrackId": 10009,
        "name": "芝3200m(外→内)",
        "distance": 3200,
        "distanceType": 4,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 12500,
        "finishTimeMin": 193.0,
        "finishTimeMax": 204.0,
        "corners": [
          {
            "length": 350,
            "start": 370
          },
          {
            "length": 350,
            "start": 720
          },
          {
            "length": 190,
            "start": 1520
          },
          {
            "length": 190,
            "start": 1710
          },
          {
            "length": 300,
            "start": 2250
          },
          {
            "length": 300,
            "start": 2550
          }
        ],
        "straights": [
          {
            "end": 370,
            "start": 0
          },
          {
            "end": 1520,
            "start": 1070
          },
          {
            "end": 2250,
            "start": 1900
          },
          {
            "end": 3200,
            "start": 2850
          }
        ],
        "slopes": [
          {
            "start": 298,
            "length": 24,
            "slope": 10983.052656874046
          },
          {
            "start": 1344,
            "length": 114,
            "slope": 15323.662947570821
          },
          {
            "start": 1461,
            "length": 11,
            "slope": 13226.775713577295
          },
          {
            "start": 1695,
            "length": 43,
            "slope": 10068.848419855183
          },
          {
            "start": 3011,
            "length": 114,
            "slope": 15230.71411911918
          },
          {
            "start": 3128,
            "length": 10,
            "slope": 12726.102814786685
          }
        ]
      }
    }
  },
  "10010": {
    "name": "小倉",
    "courses": {
      "11001": {
        "raceTrackId": 10010,
        "name": "芝1200m",
        "distance": 1200,
        "distanceType": 1,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          1
        ],
        "laneMax": 14500,
        "finishTimeMin": 67.5,
        "finishTimeMax": 71.0,
        "corners": [
          {
            "length": 205,
            "start": 500
          },
          {
            "length": 205,
            "start": 705
          }
        ],
        "straights": [
          {
            "end": 500,
            "start": 0
          },
          {
            "end": 1200,
            "start": 910
          }
        ],
        "slopes": [
          {
            "start": 20,
            "length": 27,
            "slope": -10299.886379843994
          }
        ]
      },
      "11002": {
        "raceTrackId": 10010,
        "name": "芝1800m",
        "distance": 1800,
        "distanceType": 2,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 14500,
        "finishTimeMin": 104.4,
        "finishTimeMax": 110.0,
        "corners": [
          {
            "length": 205,
            "start": 290
          },
          {
            "length": 205,
            "start": 495
          },
          {
            "length": 205,
            "start": 1100
          },
          {
            "length": 205,
            "start": 1305
          }
        ],
        "straights": [
          {
            "end": 290,
            "start": 0
          },
          {
            "end": 1100,
            "start": 700
          },
          {
            "end": 1800,
            "start": 1510
          }
        ],
        "slopes": [
          {
            "start": 275,
            "length": 11,
            "slope": 10956.67588099179
          },
          {
            "start": 437,
            "length": 59,
            "slope": 12204.441594237847
          },
          {
            "start": 511,
            "length": 15,
            "slope": 14419.750198352393
          }
        ]
      },
      "11003": {
        "raceTrackId": 10010,
        "name": "芝2000m",
        "distance": 2000,
        "distanceType": 3,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          3
        ],
        "laneMax": 14500,
        "finishTimeMin": 117.1,
        "finishTimeMax": 123.0,
        "corners": [
          {
            "length": 205,
            "start": 490
          },
          {
            "length": 205,
            "start": 695
          },
          {
            "length": 205,
            "start": 1300
          },
          {
            "length": 205,
            "start": 1505
          }
        ],
        "straights": [
          {
            "end": 490,
            "start": 0
          },
          {
            "end": 1300,
            "start": 900
          },
          {
            "end": 2000,
            "start": 1710
          }
        ],
        "slopes": [
          {
            "start": 485,
            "length": 97,
            "slope": 10897.74533524032
          },
          {
            "start": 640,
            "length": 60,
            "slope": 12093.110581296105
          },
          {
            "start": 716,
            "length": 15,
            "slope": 14484.093713570945
          }
        ]
      },
      "11004": {
        "raceTrackId": 10010,
        "name": "芝2600m",
        "distance": 2600,
        "distanceType": 4,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          2
        ],
        "laneMax": 14500,
        "finishTimeMin": 157.6,
        "finishTimeMax": 165.0,
        "corners": [
          {
            "length": 205,
            "start": 309
          },
          {
            "length": 205,
            "start": 514
          },
          {
            "length": 205,
            "start": 1110
          },
          {
            "length": 205,
            "start": 1315
          },
          {
            "length": 205,
            "start": 1900
          },
          {
            "length": 205,
            "start": 2105
          }
        ],
        "straights": [
          {
            "end": 309,
            "start": 0
          },
          {
            "end": 1110,
            "start": 719
          },
          {
            "end": 1900,
            "start": 1520
          },
          {
            "end": 2600,
            "start": 2310
          }
        ],
        "slopes": [
          {
            "start": 1101,
            "length": 218,
            "slope": 30217.5880531938
          },
          {
            "start": 1332,
            "length": 43,
            "slope": 29875.391406280432
          }
        ]
      },
      "11005": {
        "raceTrackId": 10010,
        "name": "ダート1000m",
        "distance": 1000,
        "distanceType": 1,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [
          1
        ],
        "laneMax": 12000,
        "finishTimeMin": 57.4,
        "finishTimeMax": 63.0,
        "corners": [
          {
            "length": 180,
            "start": 360
          },
          {
            "length": 180,
            "start": 540
          }
        ],
        "straights": [
          {
            "end": 360,
            "start": 0
          },
          {
            "end": 1000,
            "start": 720
          }
        ],
        "slopes": [
          {
            "start": 373,
            "length": 81,
            "slope": -14127.566664722284
          }
        ]
      },
      "11006": {
        "raceTrackId": 10010,
        "name": "ダート1700m",
        "distance": 1700,
        "distanceType": 2,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 12000,
        "finishTimeMin": 101.4,
        "finishTimeMax": 113.0,
        "corners": [
          {
            "length": 180,
            "start": 340
          },
          {
            "length": 180,
            "start": 520
          },
          {
            "length": 180,
            "start": 1060
          },
          {
            "length": 180,
            "start": 1240
          }
        ],
        "straights": [
          {
            "end": 340,
            "start": 0
          },
          {
            "end": 1060,
            "start": 700
          },
          {
            "end": 1700,
            "start": 1420
          }
        ],
        "slopes": [
          {
            "start": 293,
            "length": 179,
            "slope": 18951.986973981617
          },
          {
            "start": 561,
            "length": 156,
            "slope": -18899.514516704316
          },
          {
            "start": 1060,
            "length": 103,
            "slope": -19541.02838433876
          }
        ]
      },
      "11007": {
        "raceTrackId": 10010,
        "name": "ダート2400m",
        "distance": 2400,
        "distanceType": 3,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [],
        "laneMax": 12000,
        "finishTimeMin": 149.1,
        "finishTimeMax": 156.0,
        "corners": [
          {
            "length": 180,
            "start": 312
          },
          {
            "length": 180,
            "start": 492
          },
          {
            "length": 180,
            "start": 1040
          },
          {
            "length": 180,
            "start": 1220
          },
          {
            "length": 180,
            "start": 1760
          },
          {
            "length": 180,
            "start": 1940
          }
        ],
        "straights": [
          {
            "end": 312,
            "start": 0
          },
          {
            "end": 1040,
            "start": 672
          },
          {
            "end": 1760,
            "start": 1400
          },
          {
            "end": 2400,
            "start": 2120
          }
        ],
        "slopes": [
          {
            "start": 328,
            "length": 47,
            "slope": -10607.196867004299
          },
          {
            "start": 1102,
            "length": 79,
            "slope": 14214.418158135502
          },
          {
            "start": 1774,
            "length": 47,
            "slope": -10606.238880939414
          }
        ]
      }
    }
  },
  "10101": {
    "name": "大井",
    "courses": {
      "11101": {
        "raceTrackId": 10101,
        "name": "ダート1200m",
        "distance": 1200,
        "distanceType": 1,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [
          4,
          5
        ],
        "laneMax": 12000,
        "finishTimeMin": 69.0,
        "finishTimeMax": 77.0,
        "corners": [
          {
            "length": 150,
            "start": 500
          },
          {
            "length": 150,
            "start": 650
          }
        ],
        "straights": [
          {
            "end": 500,
            "start": 0
          },
          {
            "end": 1200,
            "start": 812
          }
        ],
        "slopes": []
      },
      "11102": {
        "raceTrackId": 10101,
        "name": "ダート1800m",
        "distance": 1800,
        "distanceType": 2,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [
          3
        ],
        "laneMax": 12000,
        "finishTimeMin": 108.1,
        "finishTimeMax": 118.0,
        "corners": [
          {
            "length": 150,
            "start": 300
          },
          {
            "length": 150,
            "start": 500
          },
          {
            "length": 150,
            "start": 1100
          },
          {
            "length": 150,
            "start": 1250
          }
        ],
        "straights": [
          {
            "end": 301,
            "start": 0
          },
          {
            "end": 1100.23,
            "start": 600
          },
          {
            "end": 1800,
            "start": 1400
          }
        ],
        "slopes": []
      },
      "11103": {
        "raceTrackId": 10101,
        "name": "ダート2000m",
        "distance": 2000,
        "distanceType": 3,
        "surface": 2,
        "turn": 1,
        "courseSetStatus": [
          2
        ],
        "laneMax": 12000,
        "finishTimeMin": 121.9,
        "finishTimeMax": 129.0,
        "corners": [
          {
            "length": 150,
            "start": 500
          },
          {
            "length": 150,
            "start": 650
          },
          {
            "length": 150,
            "start": 1300
          },
          {
            "length": 150,
            "start": 1450
          }
        ],
        "straights": [
          {
            "end": 500,
            "start": 0
          },
          {
            "end": 1300,
            "start": 800
          },
          {
            "end": 2000,
            "start": 1600
          }
        ],
        "slopes": []
      }
    }
  },
  "10201": {
    "name": "ロンシャン",
    "courses": {
      "11201": {
        "raceTrackId": 10201,
        "name": "芝1000m",
        "distance": 1000,
        "distanceType": 1,
        "surface": 1,
        "turn": 4,
        "courseSetStatus": [],
        "laneMax": 12000,
        "finishTimeMin": 54.7,
        "finishTimeMax": 57.0,
        "corners": [
          {
            "start": 200.0,
            "length": 200.0
          },
          {
            "start": 400.0,
            "length": 200.0
          }
        ],
        "straights": [],
        "slopes": []
      },
      "11203": {
        "raceTrackId": 10201,
        "name": "芝2400m",
        "distance": 2400,
        "distanceType": 3,
        "surface": 1,
        "turn": 1,
        "courseSetStatus": [
          2,
          3
        ],
        "laneMax": 12000,
        "finishTimeMin": 145.0,
        "finishTimeMax": 165.0,
        "corners": [
          {
            "start": 1000.0,
            "length": 417.0
          },
          {
            "start": 1417.0,
            "length": 200.0
          }
        ],
        "straights": [
          {
            "start": 0.0,
            "end": 1000.0
          },
          {
            "start": 1617.0,
            "end": 1866.0
          },
          {
            "start": 1867.0,
            "end": 2400.0
          }
        ],
        "slopes": [
          {
            "start": 400.0,
            "length": 600.0,
            "slope": 20000.0
          },
          {
            "start": 1017.0,
            "length": 383.0,
            "slope": -20000.0
          },
          {
            "start": 1400.0,
            "length": 217.0,
            "slope": -15000.0
          }
        ]
      }
    }
  },
  "10103": {
    "name": "川崎",
    "courses": {
      "11301": {
        "raceTrackId": 10103,
        "name": "ダート1400m",
        "distance": 1400,
        "distanceType": 1,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [
          5
        ],
        "laneMax": 13500,
        "finishTimeMin": 87.0,
        "finishTimeMax": 94.0,
        "corners": [
          {
            "start": 300.0,
            "length": 100.0
          },
          {
            "start": 400.0,
            "length": 100.0
          },
          {
            "start": 900.0,
            "length": 100.0
          },
          {
            "start": 1000.0,
            "length": 100.0
          }
        ],
        "straights": [
          {
            "start": 0.0,
            "end": 300.0
          },
          {
            "start": 500.0,
            "end": 900.0
          },
          {
            "start": 1100.0,
            "end": 1400.0
          }
        ],
        "slopes": []
      },
      "11302": {
        "raceTrackId": 10103,
        "name": "ダート1600m",
        "distance": 1600,
        "distanceType": 2,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [
          5
        ],
        "laneMax": 13500,
        "finishTimeMin": 98.0,
        "finishTimeMax": 108.0,
        "corners": [
          {
            "start": 500.0,
            "length": 100.0
          },
          {
            "start": 600.0,
            "length": 100.0
          },
          {
            "start": 1100.0,
            "length": 100.0
          },
          {
            "start": 1200.0,
            "length": 100.0
          }
        ],
        "straights": [
          {
            "start": 100.0,
            "end": 500.0
          },
          {
            "start": 700.0,
            "end": 1100.0
          },
          {
            "start": 1300.0,
            "end": 1600.0
          }
        ],
        "slopes": []
      },
      "11303": {
        "raceTrackId": 10103,
        "name": "ダート2100m",
        "distance": 2100,
        "distanceType": 3,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [
          2,
          5
        ],
        "laneMax": 13500,
        "finishTimeMin": 131.0,
        "finishTimeMax": 140.0,
        "corners": [
          {
            "start": 400.0,
            "length": 100.0
          },
          {
            "start": 500.0,
            "length": 100.0
          },
          {
            "start": 1000.0,
            "length": 100.0
          },
          {
            "start": 1100.0,
            "length": 100.0
          },
          {
            "start": 1600.0,
            "length": 100.0
          },
          {
            "start": 1700.0,
            "length": 100.0
          }
        ],
        "straights": [
          {
            "start": 0.0,
            "end": 400.0
          },
          {
            "start": 600.0,
            "end": 1000.0
          },
          {
            "start": 1200.0,
            "end": 1600.0
          },
          {
            "start": 1800.0,
            "end": 2100.0
          }
        ],
        "slopes": []
      }
    }
  },
  "10104": {
    "name": "船橋",
    "courses": {
      "11401": {
        "raceTrackId": 10104,
        "name": "ダート1000m",
        "distance": 1000,
        "distanceType": 1,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [
          1
        ],
        "laneMax": 13500,
        "finishTimeMin": 58.0,
        "finishTimeMax": 63.0,
        "corners": [
          {
            "start": 370.0,
            "length": 170.0
          },
          {
            "start": 540.0,
            "length": 152.0
          }
        ],
        "straights": [
          {
            "start": 0.0,
            "end": 370.0
          },
          {
            "start": 692.0,
            "end": 1000.0
          }
        ],
        "slopes": []
      },
      "11402": {
        "raceTrackId": 10104,
        "name": "ダート1600m",
        "distance": 1600,
        "distanceType": 2,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 13500,
        "finishTimeMin": 96.0,
        "finishTimeMax": 108.0,
        "corners": [
          {
            "start": 260.0,
            "length": 180.0
          },
          {
            "start": 440.0,
            "length": 160.0
          },
          {
            "start": 970.0,
            "length": 170.0
          },
          {
            "start": 1140.0,
            "length": 152.0
          }
        ],
        "straights": [
          {
            "start": 0.0,
            "end": 260.0
          },
          {
            "start": 600.0,
            "end": 970.0
          },
          {
            "start": 1292.0,
            "end": 1600.0
          }
        ],
        "slopes": []
      },
      "11403": {
        "raceTrackId": 10104,
        "name": "ダート1800m",
        "distance": 1800,
        "distanceType": 2,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 13500,
        "finishTimeMin": 108.0,
        "finishTimeMax": 118.0,
        "corners": [
          {
            "start": 460.0,
            "length": 180.0
          },
          {
            "start": 640.0,
            "length": 160.0
          },
          {
            "start": 1170.0,
            "length": 170.0
          },
          {
            "start": 1340.0,
            "length": 152.0
          }
        ],
        "straights": [
          {
            "start": 90.0,
            "end": 460.0
          },
          {
            "start": 800.0,
            "end": 1170.0
          },
          {
            "start": 1492.0,
            "end": 1800.0
          }
        ],
        "slopes": []
      },
      "11404": {
        "raceTrackId": 10104,
        "name": "ダート2400m",
        "distance": 2400,
        "distanceType": 3,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [
          2
        ],
        "laneMax": 13500,
        "finishTimeMin": 150.0,
        "finishTimeMax": 156.0,
        "corners": [
          {
            "start": 370.0,
            "length": 170.0
          },
          {
            "start": 540.0,
            "length": 150.0
          },
          {
            "start": 1060.0,
            "length": 180.0
          },
          {
            "start": 1240.0,
            "length": 160.0
          },
          {
            "start": 1770.0,
            "length": 170.0
          },
          {
            "start": 1940.0,
            "length": 152.0
          }
        ],
        "straights": [
          {
            "start": 0.0,
            "end": 370.0
          },
          {
            "start": 690.0,
            "end": 1060.0
          },
          {
            "start": 1400.0,
            "end": 1770.0
          },
          {
            "start": 2092.0,
            "end": 2400.0
          }
        ],
        "slopes": []
      }
    }
  },
  "10105": {
    "name": "盛岡",
    "courses": {
      "11501": {
        "raceTrackId": 10105,
        "name": "ダート1200m",
        "distance": 1200,
        "distanceType": 1,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [
          2
        ],
        "laneMax": 13500,
        "finishTimeMin": 69.0,
        "finishTimeMax": 77.0,
        "corners": [
          {
            "start": 500.0,
            "length": 200.0
          },
          {
            "start": 700.0,
            "length": 200.0
          }
        ],
        "straights": [
          {
            "start": 100.0,
            "end": 500.0
          },
          {
            "start": 900.0,
            "end": 1200.0
          }
        ],
        "slopes": [
          {
            "start": 100.0,
            "length": 375.0,
            "slope": 10000.0
          },
          {
            "start": 475.0,
            "length": 450.0,
            "slope": -15000.0
          },
          {
            "start": 975.0,
            "length": 175.0,
            "slope": 10000.0
          }
        ]
      },
      "11502": {
        "raceTrackId": 10105,
        "name": "ダート1600m",
        "distance": 1600,
        "distanceType": 2,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [
          2,
          5
        ],
        "laneMax": 13500,
        "finishTimeMin": 93.0,
        "finishTimeMax": 108.0,
        "corners": [
          {
            "start": 900.0,
            "length": 200.0
          },
          {
            "start": 1100.0,
            "length": 200.0
          }
        ],
        "straights": [
          {
            "start": 500.0,
            "end": 900.0
          },
          {
            "start": 1300.0,
            "end": 1600.0
          }
        ],
        "slopes": [
          {
            "start": 500.0,
            "length": 375.0,
            "slope": 10000.0
          },
          {
            "start": 875.0,
            "length": 450.0,
            "slope": -15000.0
          },
          {
            "start": 1375.0,
            "length": 175.0,
            "slope": 10000.0
          }
        ]
      },
      "11503": {
        "raceTrackId": 10105,
        "name": "ダート1800m",
        "distance": 1800,
        "distanceType": 2,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [
          2,
          5
        ],
        "laneMax": 13500,
        "finishTimeMin": 110.0,
        "finishTimeMax": 118.0,
        "corners": [
          {
            "start": 300.0,
            "length": 200.0
          },
          {
            "start": 500.0,
            "length": 200.0
          },
          {
            "start": 1100.0,
            "length": 200.0
          },
          {
            "start": 1300.0,
            "length": 200.0
          }
        ],
        "straights": [
          {
            "start": 0.0,
            "end": 300.0
          },
          {
            "start": 700.0,
            "end": 1100.0
          },
          {
            "start": 1500.0,
            "end": 1800.0
          }
        ],
        "slopes": [
          {
            "start": 0.0,
            "length": 150.0,
            "slope": 10000.0
          },
          {
            "start": 700.0,
            "length": 450.0,
            "slope": -15000.0
          },
          {
            "start": 1575.0,
            "length": 175.0,
            "slope": 10000.0
          }
        ]
      },
      "11504": {
        "raceTrackId": 10105,
        "name": "ダート2000m",
        "distance": 2000,
        "distanceType": 3,
        "surface": 2,
        "turn": 2,
        "courseSetStatus": [
          2
        ],
        "laneMax": 13500,
        "finishTimeMin": 121.0,
        "finishTimeMax": 129.0,
        "corners": [
          {
            "start": 500.0,
            "length": 200.0
          },
          {
            "start": 700.0,
            "length": 200.0
          },
          {
            "start": 1300.0,
            "length": 200.0
          },
          {
            "start": 1500.0,
            "length": 200.0
          }
        ],
        "straights": [
          {
            "start": 100.0,
            "end": 500.0
          },
          {
            "start": 900.0,
            "end": 1300.0
          },
          {
            "start": 1700.0,
            "end": 2000.0
          }
        ],
        "slopes": [
          {
            "start": 175.0,
            "length": 175.0,
            "slope": 10000.0
          },
          {
            "start": 900.0,
            "length": 375.0,
            "slope": 10000.0
          },
          {
            "start": 1275.0,
            "length": 450.0,
            "slope": -15000.0
          },
          {
            "start": 1775.0,
            "length": 175.0,
            "slope": 10000.0
          }
        ]
      }
    }
  },
  "10202": {
    "name": "サンタアニタパーク",
    "courses": {
      "11605": {
        "raceTrackId": 10202,
        "name": "芝2000m",
        "distance": 2000,
        "distanceType": 3,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [],
        "laneMax": 12000,
        "finishTimeMin": 117.2,
        "finishTimeMax": 123.2,
        "corners": [
          {
            "start": 700.0,
            "length": 150.0
          },
          {
            "start": 850.0,
            "length": 150.0
          },
          {
            "start": 1400.0,
            "length": 150.0
          },
          {
            "start": 1550.0,
            "length": 150.0
          }
        ],
        "straights": [
          {
            "start": 300.0,
            "end": 700.0
          },
          {
            "start": 1000.0,
            "end": 1400.0
          },
          {
            "start": 1700.0,
            "end": 2000.0
          }
        ],
        "slopes": [
          {
            "start": 0.0,
            "length": 150.0,
            "slope": -20000.0
          }
        ]
      },
      "11612": {
        "raceTrackId": 10202,
        "name": "芝2000m",
        "distance": 2000,
        "distanceType": 3,
        "surface": 1,
        "turn": 2,
        "courseSetStatus": [
          2
        ],
        "laneMax": 135000,
        "finishTimeMin": 121.0,
        "finishTimeMax": 129.0,
        "corners": [
          {
            "start": 500.0,
            "length": 200.0
          },
          {
            "start": 700.0,
            "length": 200.0
          },
          {
            "start": 1300.0,
            "length": 200.0
          },
          {
            "start": 1500.0,
            "length": 200.0
          }
        ],
        "straights": [
          {
            "start": 100.0,
            "end": 500.0
          },
          {
            "start": 900.0,
            "end": 1300.0
          },
          {
            "start": 1700.0,
            "end": 2000.0
          }
        ],
        "slopes": [
          {
            "start": 175.0,
            "length": 175.0,
            "slope": 10000.0
          },
          {
            "start": 900.0,
            "length": 375.0,
            "slope": 10000.0
          },
          {
            "start": 1275.0,
            "length": 450.0,
            "slope": -15000.0
          },
          {
            "start": 1775.0,
            "length": 175.0,
            "slope": 10000.0
          }
        ]
      }
    }
  }
}
""".trimIndent()
