package com.java;

import com.java.singleton.WeatherProvider;

public class Main {
    public static void main(String[] args) {
        WeatherProvider weatherProvider = WeatherProvider.getInstance();
        String a = weatherProvider.getCurrentWeather(new Coordinates(1,2,3));
        System.out.println(a);
    }
}