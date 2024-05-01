package com.java.aircraft;

import com.java.Coordinates;
import com.java.aircraft.models.Baloon;
import com.java.aircraft.models.Helicopter;
import com.java.aircraft.models.JetPlane;
import com.java.flyable.Flyable;
import com.java.singleton.WeatherProvider;

public class AircraftFactory {

    private long id;

    private AircraftFactory() {}

    private static AircraftFactory instance;

    public static AircraftFactory getInstance() {
        if (instance == null) {
            instance = new AircraftFactory();
            instance.id = -1;
        }
        return instance;
    }

    public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
        this.id += 1;
        return switch (p_type) {
            case "Baloon" -> new Baloon(id, p_name, p_coordinates);
            case "Helicopter" -> new Helicopter(id, p_name, p_coordinates);
            case "JetPlane" -> new JetPlane(id, p_name, p_coordinates);
            default -> null;
        };

    }

}
