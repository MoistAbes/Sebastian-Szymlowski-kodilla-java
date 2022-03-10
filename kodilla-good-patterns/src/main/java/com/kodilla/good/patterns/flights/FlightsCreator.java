package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsCreator {

    private List<Flight> flightsList;

    public FlightsCreator() {
        flightsList = new ArrayList<>();
    }

    public List<Flight> createFlights(){
        List<String> tempChangeList = new ArrayList<>();
        tempChangeList.add("Wroclaw");
        flightsList.add(new Flight("Krakow", "Warszawa", tempChangeList));
        tempChangeList = new ArrayList<>();

        tempChangeList.add("Olsztyn");
        flightsList.add(new Flight("Warszawa", "Gdansk", tempChangeList));
        tempChangeList = new ArrayList<>();


        flightsList.add(new Flight("Oswiecim", "Katowice", tempChangeList));
        flightsList.add(new Flight("Wadowice", "Lublin", tempChangeList));
        flightsList.add(new Flight("Wadowice", "Kaprzyk", tempChangeList));
        flightsList.add(new Flight("Warszawa", "Kaprzyk", tempChangeList));

        return flightsList;


    }
}
