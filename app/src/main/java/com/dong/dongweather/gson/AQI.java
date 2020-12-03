package com.dong.dongweather.gson;

/**
 * Created by Administrator on 2017/4/18.
 */

public class AQI {

    /**
     * city : {"aqi":"15","qlty":"优","pm25":"6","pm10":"15","no2":"11","so2":"5","co":"0.4","o3":"47"}
     */
    public class City{
        public String aqi;
        public String pm25;
        public String qlty;
    }
    public City city;
//    "aqi": {
//        "city": {
//            "aqi": "60",
//                    "co": "0",
//                    "no2": "14",
//                    "o3": "95",
//                    "pm10": "67",
//                    "pm25": "15",
//                    "qlty": "良",  //共六个级别，分别：优，良，轻度污染，中度污染，重度污染，严重污染
//                    "so2": "10"
//        }
//    },
}
