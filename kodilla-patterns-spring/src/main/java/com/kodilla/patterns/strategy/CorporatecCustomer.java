package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.BalancedPredictor;

public class CorporatecCustomer extends Customer {

    public CorporatecCustomer(String name){
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}
