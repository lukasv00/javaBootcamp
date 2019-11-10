package com.kodilla.good.patterns.challenges.Flights;


import java.util.List;
import java.util.Map;

public class FlightFinder {
    FlightDatabase flightDatabase = new FlightDatabase();
    Map<Flight, List<String>> flightPreparated = flightDatabase.flightDatabasePreparation();

    public void searchFlightByDparture(CustomerSearchData customerSearchData){
        boolean flightDepartue = flightPreparated.entrySet().stream()
                .map(m -> m.getKey())
                .allMatch(m -> m.getDeparture().equals(customerSearchData.getFlight().getDeparture()));

        if(flightDepartue){
            System.out.println("Flight available");
        }else{
            System.out.println("Nope");
        }
    }

    public void searchFlightByArrival(CustomerSearchData customerSearchData){
        boolean flightArrival= flightPreparated.entrySet().stream()
                .map(m -> m.getKey())
                .allMatch(m -> m.getArrival().equals(customerSearchData.getFlight().getArrival()));

        if(flightArrival){
            System.out.println("Flight available");
        }else{
            System.out.println("Nope");
        }

    }

    public void searchFlightByStation(CustomerSearchData customerSearchData){
        boolean flightStation = flightPreparated.entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .allMatch(m -> m.equals(customerSearchData.getStations()));

        if(flightStation){
            System.out.println("Flight available");
        }else{
            System.out.println("Nope");
        }

    }
}
