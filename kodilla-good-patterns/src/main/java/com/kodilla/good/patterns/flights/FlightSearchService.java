package com.kodilla.good.patterns.flights;

import java.util.List;

public class FlightSearchService implements SearchService {
    private List<Flight> flights;

    public FlightSearchService(final List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public boolean searchFlightsFrom(String from) {
        System.out.println("Searching for all flights from: " + from);
        flights.stream()
                .filter(flight -> flight.getFrom().equals(from))
                .forEach(System.out::println);

        return true;
    }

    @Override
    public boolean searchFlightsTo(String to) {
        System.out.println("Searching for all flights to: " + to);
        flights.stream()
                .filter(flight -> flight.getTo().equals(to))
                .forEach(System.out::println);

        return true;
    }

    @Override
    public boolean searchFlightsVia(String via) {
        System.out.println("Searching for all flights via: " + via);
        flights.stream()
                .filter(flight -> flight.getChangeList().contains(via))
                .forEach(System.out::println);
        return true;
    }
}
