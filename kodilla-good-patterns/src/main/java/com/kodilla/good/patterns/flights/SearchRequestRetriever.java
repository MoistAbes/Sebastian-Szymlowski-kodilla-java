package com.kodilla.good.patterns.flights;

public class SearchRequestRetriever {
    public SearchRequest retrieveSearchFrom(){
        String city = "Warszawa";
        String searchType = "from";

        return new SearchRequest(city,searchType);
    }
    public SearchRequest retrieveSearchTo(){
        String city = "Gdansk";
        String searchType = "to";

        return new SearchRequest(city,searchType);
    }
    public SearchRequest retrieveSearchVia(){
        String city = "Olsztyn";
        String searchType = "via";

        return new SearchRequest(city,searchType);
    }
}
