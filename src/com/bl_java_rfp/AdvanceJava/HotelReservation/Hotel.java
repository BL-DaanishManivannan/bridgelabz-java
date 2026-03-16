package com.bl_java_rfp.AdvanceJava.HotelReservation;

public class Hotel {

    private String name;
    private int regularWeekdayRate;
    private int regularWeekendRate;

    public Hotel(String name, int regularWeekdayRate, int regularWeekendRate) {
        this.name = name;
        this.regularWeekdayRate = regularWeekdayRate;
        this.regularWeekendRate = regularWeekendRate;
    }

    public String getName() {
        return name;
    }

    public int getRegularWeekdayRate() {
        return regularWeekdayRate;
    }

    public int getRegularWeekendRate() {
        return regularWeekendRate;
    }

    @Override
    public String toString() {
        return "Hotel: " + name
                + " | Weekday Rate: $" + regularWeekdayRate
                + " | Weekend Rate: $" + regularWeekendRate;
    }
}