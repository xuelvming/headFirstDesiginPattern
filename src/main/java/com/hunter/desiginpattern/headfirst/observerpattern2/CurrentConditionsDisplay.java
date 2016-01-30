package com.hunter.desiginpattern.headfirst.observerpattern2;

import com.hunter.desiginpattern.headfirst.observerpattern1.DisplayElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by phoenix on 16-1-30.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private static final String TAG = CurrentConditionsDisplay.class.getSimpleName();
    private static final Logger logger = LoggerFactory.getLogger(TAG);
    private Observable observable;
    private String temperature;
    private String humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs,Object arg){
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemprature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display(){
        logger.info("Current conditions: "+temperature+"   Degress annd humdity:"+
        this.humidity);
    }
}
