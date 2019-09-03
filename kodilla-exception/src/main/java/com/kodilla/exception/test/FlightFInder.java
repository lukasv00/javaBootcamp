package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFInder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<Flight,Boolean> flightsMap = new HashMap<>();
        flightsMap.put(new Flight("Brno","Amsterdam"),true);
        flightsMap.put(new Flight("Amsterdam","Brono"),false);
        flightsMap.put(new Flight("York","Amsterdam"),true);
        flightsMap.put(new Flight("Warsaw","Moscow"),true);
        flightsMap.put(new Flight("Moscow","Berlin"),false);
        flightsMap.put(new Flight("Moscow","Amsterdam"),true);

        long flightsCount = flightsMap.entrySet().stream()
                .map(f -> f.getKey())
                .filter(f -> f.getArrivalAirport() == flight.getArrivalAirport())
                .filter(f -> f.getDepartueAirport() == flight.getDepartueAirport())
                .count();

        if(flightsCount != 0){
            System.out.println("Flight is available");

        }else{
            throw new RouteNotFoundException("No flights in this direction");
        }
    }
}
