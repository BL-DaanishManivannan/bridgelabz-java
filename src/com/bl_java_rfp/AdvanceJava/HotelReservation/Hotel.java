package com.bl_java_rfp.AdvanceJava.HotelReservation;

public class Hotel {

    private String name;
    private int regularWeekdayRate;
    private int regularWeekendRate;
    private int rewardsWeekdayRate;
    private int rewardsWeekendRate;
    private int rating;

    public Hotel(String name, int regularWeekdayRate, int regularWeekendRate,
                 int rewardsWeekdayRate, int rewardsWeekendRate, int rating) {
        this.name = name;
        this.regularWeekdayRate = regularWeekdayRate;
        this.regularWeekendRate = regularWeekendRate;
        this.rewardsWeekdayRate = rewardsWeekdayRate;
        this.rewardsWeekendRate = rewardsWeekendRate;
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

    public int getRewardsWeekdayRate() {
        return rewardsWeekdayRate;
    }

    public int getRewardsWeekendRate() {
        return rewardsWeekendRate;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Hotel: " + name
                + " | Regular Weekday: $" + regularWeekdayRate
                + " | Regular Weekend: $" + regularWeekendRate
                + " | Rewards Weekday: $" + rewardsWeekdayRate
                + " | Rewards Weekend: $" + rewardsWeekendRate
                + " | Rating: " + rating;
    }
}