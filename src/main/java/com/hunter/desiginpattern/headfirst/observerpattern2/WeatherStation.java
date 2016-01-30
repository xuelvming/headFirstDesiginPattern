package com.hunter.desiginpattern.headfirst.observerpattern2;

/**
 * Created by phoenix on 16-1-29.
 */
public class WeatherStation {
    public static void main(String args[])
    {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherData);

        weatherData.setMeasurements("temp1","humidity1","preesure1");
        weatherData.setMeasurements("temp2","humidity2","preesure2");
        weatherData.setMeasurements("temp3","humidity3","preesure3");
        weatherData.setMeasurements("temp4","humidity4","preesure4");
    }
}
