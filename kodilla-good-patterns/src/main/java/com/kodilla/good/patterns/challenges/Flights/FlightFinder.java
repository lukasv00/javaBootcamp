package com.kodilla.good.patterns.challenges.Flights;


public class FlightFinder {
    FlightDatabase flightDatabase = new FlightDatabase();

    public void departueSearcher(CustomerSearchData customerSearchData){
        boolean flightDepartue = flightDatabase.flightDatabasePreparation().entrySet().stream()
                .map(m -> m.getKey())
                .allMatch(m -> m.getDeparture().equals(customerSearchData.getFlight().getDeparture()));

        if(flightDepartue){
            System.out.println("Flight available");
        }else{
            System.out.println("Nope");
        }
    }

    public void arrivalSearcher(CustomerSearchData customerSearchData){
        boolean flightArrival= flightDatabase.flightDatabasePreparation().entrySet().stream()
                .map(m -> m.getKey())
                .allMatch(m -> m.getArrival().equals(customerSearchData.getFlight().getArrival()));

        if(flightArrival){
            System.out.println("Flight available");
        }else{
            System.out.println("Nope");
        }

    }

    public void stationSearcher(CustomerSearchData customerSearchData){
        boolean flightStation = flightDatabase.flightDatabasePreparation().entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .allMatch(m -> m.equals(customerSearchData.getStations()));

        if(flightStation){
            System.out.println("Flight available");
        }else{
            System.out.println("Nope");
        }

    }
}
