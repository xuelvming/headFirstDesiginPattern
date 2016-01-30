package com.hunter.desiginpattern.headfirst.observerpattern1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by phoenix on 16-1-29.
 */
public class WeatherStation {
    private static final Logger logger = LoggerFactory.getLogger(WeatherStation.class);
    public static void main(String args[])
    {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        ThirdPartyDisplay thirdPartyDisplay =
                new ThirdPartyDisplay(weatherData);



        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(thirdPartyDisplay);
//        weatherData.registerObserver(()->{logger.info("lambadaObserver");});

        weatherData.setMeasurements("temp1","humidity1","preesure1");
        weatherData.setMeasurements("temp2","humidity2","preesure2");
        weatherData.setMeasurements("temp3","humidity3","preesure3");
        weatherData.setMeasurements("temp4","humidity4","preesure4");
    }
}
