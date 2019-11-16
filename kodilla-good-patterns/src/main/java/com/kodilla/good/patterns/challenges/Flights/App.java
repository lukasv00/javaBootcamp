package com.kodilla.good.patterns.challenges.Flights;

public class App {
    public static void main(String[] args) {

        CustomerRetriver customerRetriver = new CustomerRetriver();
        CustomerSearchData customerSearchData = customerRetriver.retrive();

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.searchFlightByArrival(customerSearchData);
        flightFinder.searchFlightByDparture(customerSearchData);
        flightFinder.searchFlightByStation(customerSearchData);

    }
}
