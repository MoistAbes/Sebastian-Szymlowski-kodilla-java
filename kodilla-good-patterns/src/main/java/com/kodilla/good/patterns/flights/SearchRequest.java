package com.kodilla.good.patterns.flights;

public class SearchRequest {
    private String city;
    private String searchType;

    public SearchRequest(String city, String searchType) {
        this.city = city;
        this.searchType = searchType;
    }

    public String getCity() {
        return city;
    }

    public String getSearchType() {
        return searchType;
    }
}
