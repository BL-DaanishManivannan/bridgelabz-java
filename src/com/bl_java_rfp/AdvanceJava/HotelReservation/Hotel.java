package com.bl_java_rfp.AdvanceJava.HotelReservation;

public class Hotel {

    private String name;
    private int regularWeekdayRate;
    private int regularWeekendRate;
    private int rating;

    public Hotel(String name, int regularWeekdayRate, int regularWeekendRate, int rating) {
        this.name = name;
        this.regularWeekdayRate = regularWeekdayRate;
        this.regularWeekendRate = regularWeekendRate;
        this.rating = rating;
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

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Hotel: " + name
                + " | Weekday Rate: $" + regularWeekdayRate
                + " | Weekend Rate: $" + regularWeekendRate
                + " | Rating: " + rating;
    }
}