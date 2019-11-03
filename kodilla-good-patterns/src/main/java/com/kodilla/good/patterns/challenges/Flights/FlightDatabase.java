package com.kodilla.good.patterns.challenges.Flights;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FlightDatabase {
    private Map<Flight, List<String>> flightDatabase = new HashMap<>();

    private List<String> cityList1 = new LinkedList<>();
    private List<String> cityList2 = new LinkedList<>();
    private List<String> cityList3 = new LinkedList<>();


    public List<String> listOfStations1() {

        cityList1.add("Warszawa");
        cityList1.add("Rzeszów");

        return cityList1;
    }
    public List<String> listOfStations2() {

        cityList2.add("Rzeszów");

        return cityList2;
    }
    public List<String> listOfStations3() {

        cityList3.add("Szczecin");
        cityList3.add("Wrocław");

        return cityList3;
    }

    public Map<Flight, List<String>> flightDatabasePreparation(){

        flightDatabase.put(new Flight("Gdańsk", "Kraków"),cityList1);
        flightDatabase.put(new Flight("Kraków", "Gdańsk"),cityList2);
        flightDatabase.put(new Flight("Kraków", "Gdańsk"),cityList3);

        return flightDatabase;
    }

}
