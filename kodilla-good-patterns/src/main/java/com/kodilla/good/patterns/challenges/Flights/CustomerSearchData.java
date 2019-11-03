package com.kodilla.good.patterns.challenges.Flights;


public class CustomerSearchData {
    private Flight flight;
    private String station;

    public CustomerSearchData(Flight flight, String station) {
        this.flight = flight;
        this.station = station;
    }

    public Flight getFlight() {
        return flight;
    }

    public String getStations() {
        return station;
    }
}
