package com.kodilla.good.patterns.flights;

public class FlightsSearchProcessor {
    private SearchService searchService;


    public FlightsSearchProcessor(SearchService searchService) {
        this.searchService = searchService;
    }

    public boolean processSearchFlightsFrom(SearchRequest searchRequest){

        return searchService.searchFlightsFrom(searchRequest.getCity());

    }
    public boolean processSearchFlightsTo(SearchRequest searchRequest){
        return searchService.searchFlightsTo(searchRequest.getCity());
    }
    public boolean processSearchFlightsVia(SearchRequest searchRequest){
        return searchService.searchFlightsVia(searchRequest.getCity());
    }
}
