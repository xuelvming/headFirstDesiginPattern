package com.hunter.desiginpattern.headfirst.observerpattern1;


public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

    String getTemprature();

    String getHumidity();

    String getPressure();

}
