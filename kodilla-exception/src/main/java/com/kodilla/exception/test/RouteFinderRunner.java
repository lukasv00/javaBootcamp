package com.kodilla.exception.test;

public class RouteFinderRunner {
    public static void main(String[] args) {

        FlightFInder flightFInder = new FlightFInder();

        try {
            flightFInder.findFlight(new Flight("Brnoooo", "Amsterdam"));
        }catch (RouteNotFoundException e){
            System.out.println("Not available - find another one");
        }
    }
}
