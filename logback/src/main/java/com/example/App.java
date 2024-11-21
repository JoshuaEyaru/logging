package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    

    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("My first INFO log");
        logger.trace("My first TRACE log");
        logger.debug("My first DEBUG log");
        logger.warn("My first WARNING log");
        logger.error("My first ERROR log");

        /*logging oan exception */
        try {
            throw new Exception();
        } catch (Exception e) {
            logger.error("Exception Occured", e);
        }
    }
}
