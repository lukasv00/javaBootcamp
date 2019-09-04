package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightFInder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<Flight,Boolean> flightsMap = new HashMap<>();
        flightsMap.put(new Flight("Brno","Amsterdam"),true);
        flightsMap.put(new Flight("Amsterdam","Brono"),false);
        flightsMap.put(new Flight("York","Amsterdam"),true);
        flightsMap.put(new Flight("Warsaw","Moscow"),true);
        flightsMap.put(new Flight("Moscow","Berlin"),false);
        flightsMap.put(new Flight("Moscow","Amsterdam"),true);

        List<Flight> flightStream = flightsMap.entrySet().stream()
                .filter(Map.Entry::getValue)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        boolean flightsCountDepartures = flightStream.stream()
                .anyMatch(f -> f.getDepartueAirport().equals(flight.getDepartueAirport()));

        boolean flightsCountArrivals = flightStream.stream()
                .anyMatch(f -> f.getArrivalAirport().equals(flight.getArrivalAirport()));

        if(flightsCountArrivals && flightsCountDepartures){
            System.out.println("Flight is available");

        }else{
            throw new RouteNotFoundException("No flights in this direction");
        }
    }
}
