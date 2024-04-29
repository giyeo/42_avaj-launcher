package com.java.singleton;


import com.java.Coordinates;

public class WeatherProvider {

    private static WeatherProvider instance;
    private final String[] weather;

    private WeatherProvider() {
        weather = new String[] {"RAIN", "FOG", "SUN", "SNOW"};
    }

    public static WeatherProvider getInstance() {
        if (instance == null) {
            instance = new WeatherProvider();
        }
        return instance;
    }

    public String getCurrentWeather(Coordinates p_coordinates) {
        int randomNumber = (int) (Math.random() * 100);
        return weather[randomNumber % 4];
    }

}
