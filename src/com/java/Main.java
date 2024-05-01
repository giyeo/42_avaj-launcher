package com.java;

import com.java.aircraft.AircraftFactory;
import com.java.aircraft.models.Helicopter;
import com.java.singleton.WeatherProvider;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WeatherProvider weatherProvider = WeatherProvider.getInstance();
        String a = weatherProvider.getCurrentWeather(new Coordinates(1,2,3));
        System.out.println(a);

        AircraftFactory factory = AircraftFactory.getInstance();

        List<Helicopter> helicopters = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            Helicopter helicopter = (Helicopter)factory.newAircraft("Helicopter", "Boby", new Coordinates(1,1,1));
            helicopters.add(helicopter);
        }

        for(Helicopter h : helicopters) {
            h.updateConditions();
        }

    }
}