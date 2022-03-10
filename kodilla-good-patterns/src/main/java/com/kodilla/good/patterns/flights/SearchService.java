package com.kodilla.good.patterns.flights;

import java.util.List;

public interface SearchService {
    boolean searchFlightsFrom(String from);

    boolean searchFlightsTo(String to);

    boolean searchFlightsVia(String via);
}
