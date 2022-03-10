package com.kodilla.good.patterns.flights;

import java.util.List;

public class FlightsDatabase {
    private List<Flight> flightList;

    public FlightsDatabase(List<Flight> flightList) {
        this.flightList = flightList;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }
}
