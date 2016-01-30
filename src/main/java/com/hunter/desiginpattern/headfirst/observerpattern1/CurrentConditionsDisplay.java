package com.hunter.desiginpattern.headfirst.observerpattern1;

import ch.qos.logback.core.util.TimeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by phoenix on 16-1-29.
 */
public class CurrentConditionsDisplay  implements  Observer,DisplayElement{
    private static final String TAG = CurrentConditionsDisplay.class.getSimpleName();
    private static final Logger logger = LoggerFactory.getLogger(TAG);
    private Subject subject;
    public CurrentConditionsDisplay(Subject subject){
        this.subject = subject;
    }
    public void update() {
        logger.info("update");
        this.display();
    }

    public void display() {
        logger.info("display");
        logger.info("CurrentCondition=>humidity:"+this.subject.getHumidity()+"\n"
        +"preasure:"+this.subject.getPressure());
    }
}
