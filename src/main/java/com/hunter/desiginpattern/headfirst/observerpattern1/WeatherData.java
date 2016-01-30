package com.hunter.desiginpattern.headfirst.observerpattern1;

import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by phoenix on 16-1-29.
 */
public class WeatherData implements Subject {
    private ConcurrentLinkedQueue<Observer> observers;
    private String temperature;
    private String humidity;
    private String pressure;


    public WeatherData() {
        observers = new ConcurrentLinkedQueue<Observer>();
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


    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }

    public void setMeasurements(String temp, String humidity,String presure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = presure;
        if(new Random().nextBoolean())
        {
            this.notifyObservers();
        }
    }
}
