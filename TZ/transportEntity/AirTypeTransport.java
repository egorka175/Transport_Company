package com.tms.TZ.transportEntity;

import java.util.List;

public class AirTypeTransport {
    private String Air;

    public AirTypeTransport(String air) {
        Air = air;
    }

    public String getAir() {
        return Air;
    }

    public void setAir(String air) {
        Air = air;
    }

    @Override
    public String toString() {
        return "AirTypeTransport{" +
                "Air='" + Air + '\'' +
                '}';
    }
}
