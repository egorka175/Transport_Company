package com.tms.TZ.Metods;

import com.tms.TZ.cityEntity.City;
import com.tms.TZ.transportEntity.TransportCharacteristics;

import java.util.List;
import java.util.stream.Collectors;

public class ValidationCheck {
    public String checkForCityPresence(List<City> cityCollection, String city) {
        int i = 0;
        for (City item : cityCollection) {
            if (item.getName().contains(city)) {
                i++;
            }
            if (i == 0) {
                System.out.println("Такого города не существует попробуйте ввести другой город.");
                break;
            }
        }
        return city;
    }

    public List<TransportCharacteristics> checkingTransportCollection(List<TransportCharacteristics> transportCollection) {
        int i = 0;
        for (TransportCharacteristics item : transportCollection) {
            if (transportCollection.size() == 0) {
                i++;
            }
            if (i == 0) {
                System.out.println("Нет подходящего транспорта.");
                break;
            }
        }
        return transportCollection;
    }
}
