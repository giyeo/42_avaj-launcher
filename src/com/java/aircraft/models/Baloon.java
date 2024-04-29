package com.java.aircraft.models;

import com.java.aircraft.Aircraft;
import com.java.Coordinates;

public class Baloon extends Aircraft {

    public Baloon(long p_id, String p_name, Coordinates p_coordinates) {
        super(p_id, p_name, p_coordinates);
    }

    @Override
    public void updateConditions() {
        this.coordinates = null;
    }

}
