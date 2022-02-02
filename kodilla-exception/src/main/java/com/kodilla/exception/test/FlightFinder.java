package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public String findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> airportMap = new HashMap<>();

        airportMap.put("Lotnisko Balice", true);
        airportMap.put("Katowice Airport", true);
        airportMap.put("Lotnisko Zator", false);
        airportMap.put("Nowy Targ Airport", true);
        airportMap.put("Lotnisko Rybnik", false);

        boolean isArrivalAirportAvailable = false;
        boolean isDepartureAirportAvailable = false;

        if (!airportMap.containsKey(flight.getArrivalAirport()) || !airportMap.containsKey(flight.getDepartureAirport())){
            throw new RouteNotFoundException("Error! There is no such airport.");
        }


        for (Map.Entry<String, Boolean> airport : airportMap.entrySet()){
            if (airport.getKey().equals(flight.getArrivalAirport()) && airport.getValue())
                isArrivalAirportAvailable = true;
            if (airport.getKey().equals(flight.getDepartureAirport()) && airport.getValue())
                isDepartureAirportAvailable = true;

            if (isArrivalAirportAvailable && isDepartureAirportAvailable)
                return "Flight found!";

        }

        return "Flight not found";



    }
}
