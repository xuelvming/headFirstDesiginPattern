package com.hunter.desiginpattern.headfirst.observerpattern2;
import java.util.Observable;
import java.util.Random;


/**
 * Created by phoenix on 16-1-29.
 */
public class WeatherData extends Observable {
    private String temperature;
    private String humidity;
    private String pressure;


    public WeatherData() {
    }

    public String getTemprature(){
        return this.temperature;
    }

    public String getHumidity(){
        return this.humidity;
    }

    public String getPressure(){
        return this.pressure;
    }


    public void setMeasurements(String temp, String humidity,String presure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = presure;
        if(new Random().nextBoolean())
        {
            this.setChanged();
            this.notifyObservers();
        }
    }
}
