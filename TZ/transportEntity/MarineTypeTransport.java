package com.tms.TZ.transportEntity;

import java.util.List;

public class MarineTypeTransport {
    private String Marine;

    public MarineTypeTransport(String marine) {
        Marine = marine;
    }

    public String getMarine() {
        return Marine;
    }

    public void setMarine(String marine) {
        Marine = marine;
    }

    @Override
    public String toString() {
        return "MarineTypeTransport{" +
                "Marine='" + Marine + '\'' +
                '}';
    }
}
