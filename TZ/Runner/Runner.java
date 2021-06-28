package com.tms.TZ.Runner;

import com.tms.TZ.Metods.FindingTheMostSuitableTransport;
import com.tms.TZ.Metods.WriteAPI;
import com.tms.TZ.transportEntity.TransportCharacteristics;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        WriteAPI writeAPI = new WriteAPI();
        FindingTheMostSuitableTransport test = new FindingTheMostSuitableTransport();

        writeAPI.writerMessage("___________________________________________________________________________");
        writeAPI.writerMessage("Введите количество пассажиров: ");
        writeAPI.writerMessage("___________________________________________________________________________");
        int numberOfPassengers = writeAPI.writerInt();
        writeAPI.writerMessage("___________________________________________________________________________");
        writeAPI.writerMessage("Введите массу груза: ");
        int weightOfCargo = writeAPI.writerInt();
        writeAPI.writerMessage("___________________________________________________________________________");
        writeAPI.writerMessage("Введите  город , из которого  желаете произвести доставку.");
        String cityFrom = writeAPI.writerStr();
        writeAPI.writerMessage("___________________________________________________________________________");
        writeAPI.writerMessage("Введите город ,в который желаете произвести доставку.");
        String cityWhereTo = writeAPI.writerStr();
        writeAPI.writerMessage("___________________________________________________________________________");





        List<TransportCharacteristics> idealTransport = test.bestTypeTransport(cityFrom, cityWhereTo, numberOfPassengers, weightOfCargo);
        int distance = test.distanceCalculate(cityFrom, cityWhereTo);
        String time = "Время в пути - "+test.calculationOfDeliveryTimeInHours(idealTransport.get(0).getSpeed(), distance)+"(часoв) "+test.calculationOfDeliveryTimeInMinutes(idealTransport.get(0).getSpeed(), distance)+"(минуты)";
        int price=idealTransport.get(0).getPricePerKilometer();
        String name=idealTransport.get(0).getName();
        writeAPI.writerMessage("Самый быстрый транспорт для доставки "+numberOfPassengers+"(человек) и "+weightOfCargo+"(т) груза из "+cityFrom+" в "+cityWhereTo+" это-"+name+".\n"+time+". Cтоимость: "+price*distance+"($)");
    }
}
