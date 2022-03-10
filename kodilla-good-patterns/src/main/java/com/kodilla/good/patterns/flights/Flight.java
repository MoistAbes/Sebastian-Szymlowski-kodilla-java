package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.Objects;

public class Flight {
    private String from;
    private String to;
    private List<String> changeList;

    public Flight(String from, String to, List<String> changeList) {
        this.from = from;
        this.to = to;
        this.changeList = changeList;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public List<String> getChangeList() {
        return changeList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!from.equals(flight.from)) return false;
        if (!to.equals(flight.to)) return false;
        return Objects.equals(changeList, flight.changeList);
    }

    @Override
    public int hashCode() {
        int result = from.hashCode();
        result = 31 * result + to.hashCode();
        result = 31 * result + (changeList != null ? changeList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", przez=" + changeList +
                '}';
    }
}
