package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Lotnisko Balice", "Katowice Airport");
        Flight flight2 = new Flight("Lotnisko Balice", "Lotnisko Rybnik");
        Flight flight3 = new Flight("Nowy Targ Airport", "Nieistniejace lotnisko");

        FlightFinder flightFinder = new FlightFinder();

        try {
            System.out.println(flightFinder.findFlight(flight1));
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Program is continued");
        }

        try {
            System.out.println(flightFinder.findFlight(flight2));
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Program is continued");
        }

        try {
            System.out.println(flightFinder.findFlight(flight3));
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Program is continued");
        }
    }
}
