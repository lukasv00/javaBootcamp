package com.kodilla.testing.weather.stub;

import org.junit.*;

public class WeahterForecastTestSuite {

    @Test
    public void testCalculatorForecastWithStub(){
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        int quantityOfSensors = weatherForecast.calculateForecast().size();

        Assert.assertEquals(5, quantityOfSensors);
    }
}
