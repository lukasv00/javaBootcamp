package com.kodilla.good.patterns.challenges.Flights;

public class CustomerRetriver {
    FlightDatabase flightDatabase = new FlightDatabase();

    public CustomerSearchData retrive() {

        CustomerSearchData customerSearch = new CustomerSearchData(new Flight("Kraków","Gdańsk"),flightDatabase.listOfStations3().get(1));

        return customerSearch;
    }
}
