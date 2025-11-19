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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1200,
            "frontType": 1,
            "start": 950
          }
        ],
        "slopes": []
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
            "frontType": 2,
            "start": 425
          },
          {
            "end": 1500,
            "frontType": 1,
            "start": 1250
          }
        ],
        "slopes": []
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1000,
            "frontType": 2,
            "start": 725
          },
          {
            "end": 1800,
            "frontType": 1,
            "start": 1550
          }
        ],
        "slopes": []
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1200,
            "frontType": 2,
            "start": 925
          },
          {
            "end": 2000,
            "frontType": 1,
            "start": 1750
          }
        ],
        "slopes": []
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 975,
            "frontType": 1,
            "start": 725
          },
          {
            "end": 1800,
            "frontType": 2,
            "start": 1525
          },
          {
            "end": 2600,
            "frontType": 1,
            "start": 2350
          }
        ],
        "slopes": []
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1000,
            "frontType": 1,
            "start": 740
          }
        ],
        "slopes": []
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 980,
            "frontType": 2,
            "start": 700
          },
          {
            "end": 1700,
            "frontType": 1,
            "start": 1440
          }
        ],
        "slopes": []
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 940,
            "frontType": 1,
            "start": 660
          },
          {
            "end": 1680,
            "frontType": 2,
            "start": 1408
          },
          {
            "end": 2400,
            "frontType": 1,
            "start": 2140
          }
        ],
        "slopes": []
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1000,
            "frontType": 1,
            "start": 750
          }
        ],
        "slopes": [
          {
            "length": 555,
            "slope": 10000,
            "start": 0
          }
        ]
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1200,
            "frontType": 1,
            "start": 950
          }
        ],
        "slopes": [
          {
            "length": 755,
            "slope": 10000,
            "start": 0
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1110,
            "frontType": 2,
            "start": 760
          },
          {
            "end": 1800,
            "frontType": 1,
            "start": 1550
          }
        ],
        "slopes": [
          {
            "length": 200,
            "slope": -10000,
            "start": 220
          },
          {
            "length": 720,
            "slope": 10000,
            "start": 665
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1310,
            "frontType": 2,
            "start": 960
          },
          {
            "end": 2000,
            "frontType": 1,
            "start": 1750
          }
        ],
        "slopes": [
          {
            "length": 200,
            "slope": -10000,
            "start": 420
          },
          {
            "length": 720,
            "slope": 10000,
            "start": 865
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1070,
            "frontType": 1,
            "start": 700
          },
          {
            "end": 1890,
            "frontType": 2,
            "start": 1530
          },
          {
            "end": 2600,
            "frontType": 1,
            "start": 2350
          }
        ],
        "slopes": [
          {
            "length": 495,
            "slope": 10000,
            "start": 0
          },
          {
            "length": 200,
            "slope": -10000,
            "start": 970
          },
          {
            "length": 720,
            "slope": 10000,
            "start": 1425
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1000,
            "frontType": 1,
            "start": 750
          }
        ],
        "slopes": []
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1070,
            "frontType": 2,
            "start": 730
          },
          {
            "end": 1700,
            "frontType": 1,
            "start": 1450
          }
        ],
        "slopes": [
          {
            "length": 340,
            "slope": -10000,
            "start": 275
          },
          {
            "length": 670,
            "slope": 10000,
            "start": 615
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1040,
            "frontType": 1,
            "start": 672
          },
          {
            "end": 1770,
            "frontType": 2,
            "start": 1420
          },
          {
            "end": 2400,
            "frontType": 1,
            "start": 2150
          }
        ],
        "slopes": []
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
            "end": 649.900024414062,
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1000,
            "frontType": 1,
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1200,
            "frontType": 1,
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1400,
            "frontType": 1,
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1600,
            "frontType": 1,
            "start": 950
          }
        ],
        "slopes": [
          {
            "length": 350,
            "slope": 10000,
            "start": 250
          },
          {
            "length": 300,
            "slope": -15000,
            "start": 600
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1800,
            "frontType": 1,
            "start": 1150
          }
        ],
        "slopes": [
          {
            "length": 350,
            "slope": 10000,
            "start": 450
          },
          {
            "length": 300,
            "slope": -15000,
            "start": 800
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1250,
            "frontType": 2,
            "start": 820
          },
          {
            "end": 2000,
            "frontType": 1,
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 2000,
            "frontType": 1,
            "start": 1350
          }
        ],
        "slopes": [
          {
            "length": 350,
            "slope": 10000,
            "start": 650
          },
          {
            "length": 300,
            "slope": -15000,
            "start": 1000
          }
        ]
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1450,
            "frontType": 2,
            "start": 1050
          },
          {
            "end": 2200,
            "frontType": 1,
            "start": 1850
          }
        ],
        "slopes": []
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1650,
            "frontType": 2,
            "start": 1210
          },
          {
            "end": 2400,
            "frontType": 1,
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1200,
            "frontType": 1,
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1140,
            "frontType": 2,
            "start": 720
          },
          {
            "end": 1800,
            "frontType": 1,
            "start": 1460
          }
        ],
        "slopes": []
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1120,
            "frontType": 1,
            "start": 700
          },
          {
            "end": 1850,
            "frontType": 2,
            "start": 1440
          },
          {
            "end": 2500,
            "frontType": 1,
            "start": 2170
          }
        ],
        "slopes": []
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1200,
            "frontType": 1,
            "start": 920
          }
        ],
        "slopes": [
          {
            "length": 100,
            "slope": 15000,
            "start": 180
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1020,
            "frontType": 2,
            "start": 730
          },
          {
            "end": 1800,
            "frontType": 1,
            "start": 1520
          }
        ],
        "slopes": [
          {
            "length": 100,
            "slope": 15000,
            "start": 780
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1220,
            "frontType": 2,
            "start": 930
          },
          {
            "end": 2000,
            "frontType": 1,
            "start": 1720
          }
        ],
        "slopes": [
          {
            "length": 100,
            "slope": 15000,
            "start": 980
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1130,
            "frontType": 1,
            "start": 720
          },
          {
            "end": 1820,
            "frontType": 2,
            "start": 1530
          },
          {
            "end": 2600,
            "frontType": 1,
            "start": 2320
          }
        ],
        "slopes": [
          {
            "length": 80,
            "slope": 15000,
            "start": 0
          },
          {
            "length": 100,
            "slope": 15000,
            "start": 1580
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1150,
            "frontType": 1,
            "start": 870
          }
        ],
        "slopes": []
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1050,
            "frontType": 2,
            "start": 700
          },
          {
            "end": 1700,
            "frontType": 1,
            "start": 1420
          }
        ],
        "slopes": [
          {
            "length": 320,
            "slope": -10000,
            "start": 285
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1060,
            "frontType": 1,
            "start": 680
          },
          {
            "end": 1750,
            "frontType": 2,
            "start": 1400
          },
          {
            "end": 2400,
            "frontType": 1,
            "start": 2120
          }
        ],
        "slopes": []
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
            "frontType": 1,
            "start": 900
          }
        ],
        "slopes": [
          {
            "length": 200,
            "slope": -15000,
            "start": 0
          },
          {
            "length": 110,
            "slope": 20000,
            "start": 1025
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
            "frontType": 1,
            "start": 1300
          }
        ],
        "slopes": [
          {
            "length": 300,
            "slope": -15000,
            "start": 300
          },
          {
            "length": 110,
            "slope": 20000,
            "start": 1425
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1000,
            "frontType": 2,
            "start": 675
          },
          {
            "end": 1800,
            "frontType": 1,
            "start": 1500
          }
        ],
        "slopes": [
          {
            "length": 35,
            "slope": 20000,
            "start": 1
          },
          {
            "length": 200,
            "slope": 15000,
            "start": 125
          },
          {
            "length": 400,
            "slope": -15000,
            "start": 425
          },
          {
            "length": 110,
            "slope": 20000,
            "start": 1625
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1200,
            "frontType": 2,
            "start": 875
          },
          {
            "end": 2000,
            "frontType": 1,
            "start": 1700
          }
        ],
        "slopes": [
          {
            "length": 110,
            "slope": 20000,
            "start": 125
          },
          {
            "length": 200,
            "slope": 15000,
            "start": 325
          },
          {
            "length": 400,
            "slope": -15000,
            "start": 625
          },
          {
            "length": 110,
            "slope": 20000,
            "start": 1825
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 2200,
            "frontType": 1,
            "start": 1900
          }
        ],
        "slopes": [
          {
            "length": 110,
            "slope": 20000,
            "start": 153
          },
          {
            "length": 200,
            "slope": 15000,
            "start": 353
          },
          {
            "length": 300,
            "slope": -15000,
            "start": 900
          },
          {
            "length": 110,
            "slope": 20000,
            "start": 2025
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
            "frontType": 1,
            "start": 496
          },
          {
            "end": 1700,
            "frontType": 2,
            "start": 1375
          },
          {
            "end": 2500,
            "frontType": 1,
            "start": 2200
          }
        ],
        "slopes": [
          {
            "length": 110,
            "slope": 20000,
            "start": 621
          },
          {
            "length": 200,
            "slope": 15000,
            "start": 825
          },
          {
            "length": 400,
            "slope": -15000,
            "start": 1125
          },
          {
            "length": 110,
            "slope": 20000,
            "start": 2325
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1115,
            "frontType": 2,
            "start": 790
          },
          {
            "end": 1975,
            "frontType": 1,
            "start": 1615
          },
          {
            "end": 2800,
            "frontType": 2,
            "start": 2475
          },
          {
            "end": 3600,
            "frontType": 1,
            "start": 3300
          }
        ],
        "slopes": [
          {
            "length": 110,
            "slope": 20000,
            "start": 40
          },
          {
            "length": 200,
            "slope": 15000,
            "start": 240
          },
          {
            "length": 400,
            "slope": -15000,
            "start": 540
          },
          {
            "length": 110,
            "slope": 20000,
            "start": 1740
          },
          {
            "length": 200,
            "slope": 15000,
            "start": 1925
          },
          {
            "length": 400,
            "slope": -15000,
            "start": 2225
          },
          {
            "length": 110,
            "slope": 20000,
            "start": 3425
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1200,
            "frontType": 1,
            "start": 900
          }
        ],
        "slopes": [
          {
            "length": 175,
            "slope": -15000,
            "start": 175
          },
          {
            "length": 175,
            "slope": 15000,
            "start": 1000
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1100,
            "frontType": 1,
            "start": 750
          },
          {
            "end": 1800,
            "frontType": 1,
            "start": 1500
          }
        ],
        "slopes": [
          {
            "length": 175,
            "slope": 15000,
            "start": 100
          },
          {
            "length": 175,
            "slope": 10000,
            "start": 350
          },
          {
            "length": 175,
            "slope": -15000,
            "start": 775
          },
          {
            "length": 175,
            "slope": 15000,
            "start": 1600
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 950,
            "frontType": 1,
            "start": 600
          },
          {
            "end": 1700,
            "frontType": 2,
            "start": 1350
          },
          {
            "end": 2400,
            "frontType": 1,
            "start": 2100
          }
        ],
        "slopes": []
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1050,
            "frontType": 1,
            "start": 700
          },
          {
            "end": 1800,
            "frontType": 2,
            "start": 1450
          },
          {
            "end": 2500,
            "frontType": 1,
            "start": 2200
          }
        ],
        "slopes": []
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1400,
            "frontType": 1,
            "start": 900
          }
        ],
        "slopes": [
          {
            "length": 75,
            "slope": 20000,
            "start": 125
          },
          {
            "length": 250,
            "slope": -15000,
            "start": 250
          },
          {
            "length": 150,
            "slope": 15000,
            "start": 950
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1600,
            "frontType": 1,
            "start": 1100
          }
        ],
        "slopes": [
          {
            "length": 75,
            "slope": 20000,
            "start": 325
          },
          {
            "length": 250,
            "slope": -15000,
            "start": 450
          },
          {
            "length": 150,
            "slope": 15000,
            "start": 1150
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
            "frontType": 2,
            "start": 325
          },
          {
            "end": 1800,
            "frontType": 1,
            "start": 1300
          }
        ],
        "slopes": [
          {
            "length": 75,
            "slope": 20000,
            "start": 525
          },
          {
            "length": 250,
            "slope": -15000,
            "start": 650
          },
          {
            "length": 150,
            "slope": 15000,
            "start": 1350
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
            "frontType": 2,
            "start": 400
          },
          {
            "end": 2000,
            "frontType": 1,
            "start": 1500
          }
        ],
        "slopes": [
          {
            "length": 75,
            "slope": 20000,
            "start": 725
          },
          {
            "length": 250,
            "slope": -15000,
            "start": 850
          },
          {
            "length": 150,
            "slope": 15000,
            "start": 1550
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1250,
            "frontType": 2,
            "start": 800
          },
          {
            "end": 2300,
            "frontType": 1,
            "start": 1800
          }
        ],
        "slopes": [
          {
            "length": 75,
            "slope": 20000,
            "start": 1025
          },
          {
            "length": 250,
            "slope": -15000,
            "start": 1150
          },
          {
            "length": 150,
            "slope": 15000,
            "start": 1850
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1350,
            "frontType": 2,
            "start": 900
          },
          {
            "end": 2400,
            "frontType": 1,
            "start": 1900
          }
        ],
        "slopes": [
          {
            "length": 40,
            "slope": 15000,
            "start": 0
          },
          {
            "length": 75,
            "slope": 20000,
            "start": 1125
          },
          {
            "length": 250,
            "slope": -15000,
            "start": 1250
          },
          {
            "length": 150,
            "slope": 15000,
            "start": 1950
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1450,
            "frontType": 2,
            "start": 1000
          },
          {
            "end": 2500,
            "frontType": 1,
            "start": 2000
          }
        ],
        "slopes": [
          {
            "length": 140,
            "slope": 15000,
            "start": 0
          },
          {
            "length": 75,
            "slope": 20000,
            "start": 1225
          },
          {
            "length": 250,
            "slope": -15000,
            "start": 1350
          },
          {
            "length": 150,
            "slope": 15000,
            "start": 2050
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1325,
            "frontType": 1,
            "start": 842
          },
          {
            "end": 2350,
            "frontType": 2,
            "start": 1900
          },
          {
            "end": 3400,
            "frontType": 1,
            "start": 2900
          }
        ],
        "slopes": [
          {
            "length": 75,
            "slope": 20000,
            "start": 67
          },
          {
            "length": 250,
            "slope": -15000,
            "start": 192
          },
          {
            "length": 150,
            "slope": 15000,
            "start": 892
          },
          {
            "length": 75,
            "slope": 20000,
            "start": 2125
          },
          {
            "length": 250,
            "slope": -15000,
            "start": 2250
          },
          {
            "length": 150,
            "slope": 15000,
            "start": 2950
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1300,
            "frontType": 1,
            "start": 800
          }
        ],
        "slopes": [
          {
            "length": 200,
            "slope": -10000,
            "start": 275
          },
          {
            "length": 250,
            "slope": 15000,
            "start": 800
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1400,
            "frontType": 1,
            "start": 900
          }
        ],
        "slopes": [
          {
            "length": 200,
            "slope": -10000,
            "start": 375
          },
          {
            "length": 250,
            "slope": 15000,
            "start": 900
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1600,
            "frontType": 1,
            "start": 1100
          }
        ],
        "slopes": [
          {
            "length": 200,
            "slope": -10000,
            "start": 575
          },
          {
            "length": 250,
            "slope": 15000,
            "start": 1100
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1150,
            "frontType": 2,
            "start": 700
          },
          {
            "end": 2100,
            "frontType": 1,
            "start": 1600
          }
        ],
        "slopes": [
          {
            "length": 200,
            "slope": -10000,
            "start": 1075
          },
          {
            "length": 250,
            "slope": 15000,
            "start": 1600
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1450,
            "frontType": 2,
            "start": 1000
          },
          {
            "end": 2400,
            "frontType": 1,
            "start": 1900
          }
        ],
        "slopes": []
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1200,
            "frontType": 1,
            "start": 800
          }
        ],
        "slopes": [
          {
            "length": 775,
            "slope": -10000,
            "start": 100
          },
          {
            "length": 100,
            "slope": 20000,
            "start": 875
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1400,
            "frontType": 1,
            "start": 1000
          }
        ],
        "slopes": [
          {
            "length": 775,
            "slope": -10000,
            "start": 300
          },
          {
            "length": 100,
            "slope": 20000,
            "start": 1075
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
            "frontType": 2,
            "start": 300
          },
          {
            "end": 1600,
            "frontType": 1,
            "start": 1200
          }
        ],
        "slopes": [
          {
            "length": 775,
            "slope": -10000,
            "start": 500
          },
          {
            "length": 100,
            "slope": 20000,
            "start": 1275
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1100,
            "frontType": 2,
            "start": 700
          },
          {
            "end": 2000,
            "frontType": 1,
            "start": 1600
          }
        ],
        "slopes": [
          {
            "length": 50,
            "slope": 20000,
            "start": 0
          },
          {
            "length": 775,
            "slope": -10000,
            "start": 900
          },
          {
            "length": 100,
            "slope": 20000,
            "start": 1675
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1300,
            "frontType": 2,
            "start": 900
          },
          {
            "end": 2200,
            "frontType": 1,
            "start": 1800
          }
        ],
        "slopes": [
          {
            "length": 150,
            "slope": -10000,
            "start": 0
          },
          {
            "length": 100,
            "slope": 20000,
            "start": 150
          },
          {
            "length": 775,
            "slope": -10000,
            "start": 1100
          },
          {
            "length": 100,
            "slope": 20000,
            "start": 1875
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1200,
            "frontType": 1,
            "start": 800
          }
        ],
        "slopes": []
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1400,
            "frontType": 1,
            "start": 1000
          }
        ],
        "slopes": [
          {
            "length": 600,
            "slope": -15000,
            "start": 425
          },
          {
            "length": 150,
            "slope": 15000,
            "start": 1025
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1000,
            "frontType": 2,
            "start": 600
          },
          {
            "end": 1800,
            "frontType": 1,
            "start": 1400
          }
        ],
        "slopes": [
          {
            "length": 50,
            "slope": 15000,
            "start": 0
          },
          {
            "length": 600,
            "slope": -15000,
            "start": 825
          },
          {
            "length": 150,
            "slope": 15000,
            "start": 1425
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1100,
            "frontType": 2,
            "start": 700
          },
          {
            "end": 1900,
            "frontType": 1,
            "start": 1500
          }
        ],
        "slopes": []
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1200,
            "frontType": 1,
            "start": 870
          }
        ],
        "slopes": [
          {
            "length": 175,
            "slope": 15000,
            "start": 120
          },
          {
            "length": 150,
            "slope": -15000,
            "start": 420
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1400,
            "frontType": 1,
            "start": 1070
          }
        ],
        "slopes": [
          {
            "length": 175,
            "slope": 15000,
            "start": 320
          },
          {
            "length": 150,
            "slope": -15000,
            "start": 620
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1400,
            "frontType": 1,
            "start": 1000
          }
        ],
        "slopes": [
          {
            "length": 100,
            "slope": 20000,
            "start": 250
          },
          {
            "length": 225,
            "slope": 10000,
            "start": 350
          },
          {
            "length": 150,
            "slope": -20000,
            "start": 575
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
            "frontType": 2,
            "start": 200
          },
          {
            "end": 1600,
            "frontType": 1,
            "start": 1270
          }
        ],
        "slopes": [
          {
            "length": 175,
            "slope": 15000,
            "start": 520
          },
          {
            "length": 150,
            "slope": -15000,
            "start": 820
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
            "frontType": 2,
            "start": 200
          },
          {
            "end": 1600,
            "frontType": 1,
            "start": 1200
          }
        ],
        "slopes": [
          {
            "length": 100,
            "slope": 20000,
            "start": 450
          },
          {
            "length": 225,
            "slope": 10000,
            "start": 550
          },
          {
            "length": 150,
            "slope": -20000,
            "start": 775
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
            "frontType": 2,
            "start": 400
          },
          {
            "end": 1800,
            "frontType": 1,
            "start": 1400
          }
        ],
        "slopes": [
          {
            "length": 100,
            "slope": 20000,
            "start": 650
          },
          {
            "length": 225,
            "slope": 10000,
            "start": 750
          },
          {
            "length": 150,
            "slope": -20000,
            "start": 975
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1170,
            "frontType": 2,
            "start": 770
          },
          {
            "end": 2000,
            "frontType": 1,
            "start": 1670
          }
        ],
        "slopes": [
          {
            "length": 175,
            "slope": 15000,
            "start": 970
          },
          {
            "length": 150,
            "slope": -15000,
            "start": 1270
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1300,
            "frontType": 2,
            "start": 800
          },
          {
            "end": 2200,
            "frontType": 1,
            "start": 1800
          }
        ],
        "slopes": [
          {
            "length": 100,
            "slope": 20000,
            "start": 1050
          },
          {
            "length": 225,
            "slope": 10000,
            "start": 1150
          },
          {
            "length": 150,
            "slope": -20000,
            "start": 1375
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1500,
            "frontType": 2,
            "start": 1000
          },
          {
            "end": 2400,
            "frontType": 1,
            "start": 2000
          }
        ],
        "slopes": [
          {
            "length": 100,
            "slope": 20000,
            "start": 1250
          },
          {
            "length": 225,
            "slope": 10000,
            "start": 1350
          },
          {
            "length": 150,
            "slope": -20000,
            "start": 1575
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1250,
            "frontType": 1,
            "start": 761
          },
          {
            "end": 2100,
            "frontType": 2,
            "start": 1650
          },
          {
            "end": 3000,
            "frontType": 1,
            "start": 2600
          }
        ],
        "slopes": [
          {
            "length": 100,
            "slope": 20000,
            "start": 11
          },
          {
            "length": 225,
            "slope": 10000,
            "start": 111
          },
          {
            "length": 150,
            "slope": -20000,
            "start": 336
          },
          {
            "length": 100,
            "slope": 20000,
            "start": 1850
          },
          {
            "length": 225,
            "slope": 10000,
            "start": 1950
          },
          {
            "length": 150,
            "slope": -20000,
            "start": 2175
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1450,
            "frontType": 1,
            "start": 958
          },
          {
            "end": 2300,
            "frontType": 2,
            "start": 1850
          },
          {
            "end": 3200,
            "frontType": 1,
            "start": 2800
          }
        ],
        "slopes": [
          {
            "length": 100,
            "slope": 20000,
            "start": 208
          },
          {
            "length": 225,
            "slope": 10000,
            "start": 308
          },
          {
            "length": 150,
            "slope": -20000,
            "start": 533
          },
          {
            "length": 100,
            "slope": 20000,
            "start": 2050
          },
          {
            "length": 225,
            "slope": 10000,
            "start": 2150
          },
          {
            "length": 150,
            "slope": -20000,
            "start": 2375
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1200,
            "frontType": 1,
            "start": 850
          }
        ],
        "slopes": [
          {
            "length": 200,
            "slope": 15000,
            "start": 175
          },
          {
            "length": 200,
            "slope": -15000,
            "start": 475
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
            "frontType": 2,
            "start": 100
          },
          {
            "end": 1400,
            "frontType": 1,
            "start": 1050
          }
        ],
        "slopes": [
          {
            "length": 200,
            "slope": 15000,
            "start": 375
          },
          {
            "length": 200,
            "slope": -15000,
            "start": 675
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1000,
            "frontType": 2,
            "start": 600
          },
          {
            "end": 1800,
            "frontType": 1,
            "start": 1450
          }
        ],
        "slopes": [
          {
            "length": 200,
            "slope": 15000,
            "start": 775
          },
          {
            "length": 200,
            "slope": -15000,
            "start": 1075
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1100,
            "frontType": 2,
            "start": 700
          },
          {
            "end": 1900,
            "frontType": 1,
            "start": 1550
          }
        ],
        "slopes": [
          {
            "length": 200,
            "slope": 15000,
            "start": 875
          },
          {
            "length": 200,
            "slope": -15000,
            "start": 1175
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1200,
            "frontType": 1,
            "start": 850
          }
        ],
        "slopes": [
          {
            "length": 595,
            "slope": -10000,
            "start": 400
          },
          {
            "length": 125,
            "slope": 20000,
            "start": 1000
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1400,
            "frontType": 1,
            "start": 1050
          }
        ],
        "slopes": [
          {
            "length": 595,
            "slope": -10000,
            "start": 600
          },
          {
            "length": 125,
            "slope": 20000,
            "start": 1200
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1600,
            "frontType": 1,
            "start": 1150
          }
        ],
        "slopes": [
          {
            "length": 400,
            "slope": -10000,
            "start": 950
          },
          {
            "length": 120,
            "slope": 20000,
            "start": 1405
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1800,
            "frontType": 1,
            "start": 1350
          }
        ],
        "slopes": [
          {
            "length": 400,
            "slope": -10000,
            "start": 1150
          },
          {
            "length": 120,
            "slope": 20000,
            "start": 1605
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1050,
            "frontType": 2,
            "start": 750
          },
          {
            "end": 2000,
            "frontType": 1,
            "start": 1650
          }
        ],
        "slopes": [
          {
            "length": 140,
            "slope": -10000,
            "start": 0
          },
          {
            "length": 125,
            "slope": 20000,
            "start": 145
          },
          {
            "length": 595,
            "slope": -10000,
            "start": 1200
          },
          {
            "length": 125,
            "slope": 20000,
            "start": 1800
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1250,
            "frontType": 2,
            "start": 900
          },
          {
            "end": 2200,
            "frontType": 1,
            "start": 1850
          }
        ],
        "slopes": [
          {
            "length": 290,
            "slope": -10000,
            "start": 0
          },
          {
            "length": 125,
            "slope": 20000,
            "start": 295
          },
          {
            "length": 595,
            "slope": -10000,
            "start": 1400
          },
          {
            "length": 125,
            "slope": 20000,
            "start": 2000
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
            "frontType": 2,
            "start": 750
          },
          {
            "end": 2400,
            "frontType": 1,
            "start": 1950
          }
        ],
        "slopes": [
          {
            "length": 132,
            "slope": -10000,
            "start": 0
          },
          {
            "length": 120,
            "slope": 20000,
            "start": 187
          },
          {
            "length": 400,
            "slope": -10000,
            "start": 1750
          },
          {
            "length": 120,
            "slope": 20000,
            "start": 2205
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1450,
            "frontType": 2,
            "start": 950
          },
          {
            "end": 2600,
            "frontType": 1,
            "start": 2150
          }
        ],
        "slopes": [
          {
            "length": 315,
            "slope": -10000,
            "start": 0
          },
          {
            "length": 120,
            "slope": 20000,
            "start": 370
          },
          {
            "length": 400,
            "slope": -10000,
            "start": 1950
          },
          {
            "length": 120,
            "slope": 20000,
            "start": 2405
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1320,
            "frontType": 1,
            "start": 948
          },
          {
            "end": 2050,
            "frontType": 2,
            "start": 1700
          },
          {
            "end": 3000,
            "frontType": 1,
            "start": 2650
          }
        ],
        "slopes": [
          {
            "length": 595,
            "slope": -10000,
            "start": 498
          },
          {
            "length": 125,
            "slope": 20000,
            "start": 1095
          },
          {
            "length": 595,
            "slope": -10000,
            "start": 2200
          },
          {
            "length": 125,
            "slope": 20000,
            "start": 2800
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1200,
            "frontType": 1,
            "start": 850
          }
        ],
        "slopes": []
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1400,
            "frontType": 1,
            "start": 1050
          }
        ],
        "slopes": [
          {
            "length": 125,
            "slope": 15000,
            "start": 1200
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 950,
            "frontType": 2,
            "start": 630
          },
          {
            "end": 1800,
            "frontType": 1,
            "start": 1449
          }
        ],
        "slopes": [
          {
            "length": 125,
            "slope": 15000,
            "start": 105
          },
          {
            "length": 125,
            "slope": 15000,
            "start": 1599
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1150,
            "frontType": 2,
            "start": 800
          },
          {
            "end": 2000,
            "frontType": 1,
            "start": 1650
          }
        ],
        "slopes": [
          {
            "length": 125,
            "slope": 15000,
            "start": 275
          },
          {
            "length": 125,
            "slope": 15000,
            "start": 1800
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1520,
            "frontType": 1,
            "start": 1070
          },
          {
            "end": 2250,
            "frontType": 2,
            "start": 1900
          },
          {
            "end": 3200,
            "frontType": 1,
            "start": 2850
          }
        ],
        "slopes": [
          {
            "length": 400,
            "slope": -10000,
            "start": 870
          },
          {
            "length": 120,
            "slope": 20000,
            "start": 1325
          },
          {
            "length": 595,
            "slope": -10000,
            "start": 2400
          },
          {
            "length": 125,
            "slope": 20000,
            "start": 3000
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1200,
            "frontType": 1,
            "start": 910
          }
        ],
        "slopes": [
          {
            "length": 60,
            "slope": -15000,
            "start": 0
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1100,
            "frontType": 2,
            "start": 700
          },
          {
            "end": 1800,
            "frontType": 1,
            "start": 1510
          }
        ],
        "slopes": [
          {
            "length": 255,
            "slope": 15000,
            "start": 280
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1300,
            "frontType": 2,
            "start": 900
          },
          {
            "end": 2000,
            "frontType": 1,
            "start": 1710
          }
        ],
        "slopes": [
          {
            "length": 255,
            "slope": 15000,
            "start": 480
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1110,
            "frontType": 1,
            "start": 719
          },
          {
            "end": 1900,
            "frontType": 2,
            "start": 1520
          },
          {
            "end": 2600,
            "frontType": 1,
            "start": 2310
          }
        ],
        "slopes": [
          {
            "length": 255,
            "slope": 15000,
            "start": 1100
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1000,
            "frontType": 1,
            "start": 720
          }
        ],
        "slopes": []
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1060,
            "frontType": 2,
            "start": 700
          },
          {
            "end": 1700,
            "frontType": 1,
            "start": 1420
          }
        ],
        "slopes": [
          {
            "length": 150,
            "slope": 15000,
            "start": 370
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1040,
            "frontType": 1,
            "start": 672
          },
          {
            "end": 1760,
            "frontType": 2,
            "start": 1400
          },
          {
            "end": 2400,
            "frontType": 1,
            "start": 2120
          }
        ],
        "slopes": []
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
            "frontType": 2,
            "start": 0
          },
          {
            "end": 1200,
            "frontType": 1,
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1100.22998046875,
            "frontType": 2,
            "start": 600
          },
          {
            "end": 1800,
            "frontType": 1,
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
            "frontType": 1,
            "start": 0
          },
          {
            "end": 1300,
            "frontType": 2,
            "start": 800
          },
          {
            "end": 2000,
            "frontType": 1,
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
