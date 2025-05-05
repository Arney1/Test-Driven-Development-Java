package com.mycompany.app;

import com.mycompany.app.flights.BusinessFlight;
import com.mycompany.app.flights.EconomyFlight;
import java.util.logging.Logger;

public class Airport {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Airport.class.getName());
        Flight economyFlight = new EconomyFlight("1");
        Flight businessFlight = new BusinessFlight("2");

        Passenger james = new Passenger("James", true);
        Passenger mike = new Passenger("Mike", false);

        businessFlight.addPassenger(james);
        businessFlight.removePassenger(james);

        businessFlight.addPassenger(mike);
        economyFlight.addPassenger(mike);

        logger.info("Business flight passengers list: ");
        for (Passenger passenger : businessFlight.getPassengersList()) {
            logger.info(passenger.getName());
        }
        logger.info("Economy flight passengers list: ");
        for (Passenger passenger : economyFlight.getPassengersList()) {
            logger.info(passenger.getName());
        }
    }
}
