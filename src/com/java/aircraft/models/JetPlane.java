package com.java.aircraft.models;

import com.java.Coordinates;
import com.java.aircraft.Aircraft;

public class JetPlane extends Aircraft {

    public JetPlane(long p_id, String p_name, Coordinates p_coordinates) {
        super(p_id, p_name, p_coordinates);
    }

    @Override
    public void updateConditions() {

        System.out.println(this.getClass().getName());
        this.coordinates = null;
    }

}
