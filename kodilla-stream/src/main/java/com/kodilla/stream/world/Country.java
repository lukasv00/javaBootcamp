package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final BigDecimal peopleQuantity;

    public Country(String peopleQuantity) {
        this.peopleQuantity = new BigDecimal(peopleQuantity);
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

}
