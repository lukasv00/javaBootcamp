package com.kodilla.patterns.builder.bigmac;


import com.kodilla.patterns.builder.bigmac.bigMacEnums.Bun;
import com.kodilla.patterns.builder.bigmac.bigMacEnums.Meat;
import com.kodilla.patterns.builder.bigmac.bigMacEnums.Sauce;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final Bun bun;
    private final Meat meat;
    private final int burgers;
    private final Sauce sauce;
    private List<String> ingredients;

    public static class BigMacBuilder {
        private Bun bun;
        private Meat meat;
        private int burgers;
        private Sauce sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder meat(Meat meat) {
            this.meat = meat;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, meat, burgers, sauce, ingredients);
        }

    }

    private Bigmac(Bun bun, Meat meat,  int burgers, Sauce sauce, List<String> ingredients) {
        this.bun = bun;
        this.meat = meat;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);

    }

    public Bun getBun() {
        return bun;
    }

    public Meat getMeat() {
        return meat;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
