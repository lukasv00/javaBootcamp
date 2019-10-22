package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
