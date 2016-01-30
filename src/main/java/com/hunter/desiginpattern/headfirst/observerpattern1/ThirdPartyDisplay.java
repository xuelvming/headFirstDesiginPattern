package com.hunter.desiginpattern.headfirst.observerpattern1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThirdPartyDisplay  implements  Observer,DisplayElement{
    private static final String TAG = ThirdPartyDisplay.class.getSimpleName();
    private static final Logger logger = LoggerFactory.getLogger(TAG);
    private Subject subject;
    public void update() {
        logger.info("update");
        this.display();
    }

    public ThirdPartyDisplay(Subject subject){
        this.subject = subject;
    }

    public void display() {
        logger.info("display");
    }
}
