package com.kodilla.good.patterns.challenges.Flights;

public class App {
    public static void main(String[] args) {

        CustomerRetriver customerRetriver = new CustomerRetriver();
        CustomerSearchData customerSearchData = customerRetriver.retrive();

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.arrivalSearcher(customerSearchData);
        flightFinder.departueSearcher(customerSearchData);
        flightFinder.stationSearcher(customerSearchData);

    }
}
