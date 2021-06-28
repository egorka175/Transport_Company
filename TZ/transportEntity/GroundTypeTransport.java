package com.tms.TZ.transportEntity;

import java.util.List;

public class GroundTypeTransport {
    private String Ground;

    public GroundTypeTransport(String ground) {
        Ground = ground;
    }

    public String getGround() {
        return Ground;
    }

    public void setGround(String ground) {
        Ground = ground;
    }

    @Override
    public String toString() {
        return "GroundTypeTransport{" +
                "Ground='" + Ground + '\'' +
                '}';
    }
}
