package com.kodilla.good.patterns.challenges.Flights;

import java.util.Objects;

public class StartFlight {
    private final String departure;
    private final String arrival;


    public StartFlight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StartFlight that = (StartFlight) o;
        return Objects.equals(start, that.start);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start);
    }
}


