package com.hunter.desiginpattern.headfirst.observerpattern2;
import java.util.Observable;
import java.util.Observer;
import com.hunter.desiginpattern.headfirst.observerpattern1.DisplayElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by phoenix on 16-1-30.
 */
public class ForecastDisplay implements Observer,DisplayElement {
    private String currentPressure = "curent pressure";
    private String lastPressure = "last Pressure";
    private static final String TAG = ForecastDisplay.class.getSimpleName();
    private static final Logger logger = LoggerFactory.getLogger(TAG);


    public ForecastDisplay(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void display() {
        //display code here
        logger.info("display currentPressure={},lastPressure={}",currentPressure,lastPressure);
    }

    public void update(Observable observable,Object arg){
        if(observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData)observable;
            lastPressure = this.currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

}
