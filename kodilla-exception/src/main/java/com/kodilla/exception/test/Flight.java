package com.kodilla.exception.test;

public class Flight {
    private String departueAirport;
    private String arrivalAirport;

    public Flight(String departueAirport, String arrivalAirport) {
        this.departueAirport = departueAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartueAirport() {
        return departueAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
