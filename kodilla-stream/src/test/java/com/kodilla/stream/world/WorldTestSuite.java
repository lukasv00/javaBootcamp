package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Countries declaration
        Country poland = new Country("40000000");
        Country england = new Country("56000000");
        Country murrica = new Country("123000212");
        Country australia = new Country("1233132");
        Country arabia = new Country("9271230");

        //Continents declaration
        Continent europe = new Continent();
        Continent america = new Continent();
        Continent australiaAndOceania = new Continent();
        Continent africa = new Continent();

        //Countries add
        europe.addCountry(poland);
        europe.addCountry(england);
        america.addCountry(murrica);
        australiaAndOceania.addCountry(australia);
        africa.addCountry(arabia);

        //World declaration
        World earth = new World();

        //Continents add
        earth.addContinent(europe);
        earth.addContinent(america);
        earth.addContinent(australiaAndOceania);
        earth.addContinent(africa);

        earth.getPeopleQuantity();

        BigDecimal expectedPeople = new BigDecimal("229504574");
        Assert.assertEquals(expectedPeople, earth.getPeopleQuantity());
    }

}
