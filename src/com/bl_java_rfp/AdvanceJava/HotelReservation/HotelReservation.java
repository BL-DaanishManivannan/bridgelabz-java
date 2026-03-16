package com.bl_java_rfp.AdvanceJava.HotelReservation;

import java.util.Arrays;
import java.util.List;

public class HotelReservation {

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");

        Hotel lakewood   = new Hotel("Lakewood",   110, 90,  3);
        Hotel bridgewood = new Hotel("Bridgewood", 160, 60,  4);
        Hotel ridgewood  = new Hotel("Ridgewood",  220, 150, 5);

        List<Hotel> hotelList = Arrays.asList(lakewood, bridgewood, ridgewood);
        HotelService hotelService = new HotelService(hotelList);

        // I/P: 11Sep2020(Fri), 12Sep2020(Sat)
        String[] dates = {"11Sep2020(Fri)", "12Sep2020(Sat)"};

        int weekdays = hotelService.countWeekdays(dates);
        int weekends = hotelService.countWeekends(dates);

        Hotel cheapestBestRated = hotelService.findCheapestBestRatedHotel(weekdays, weekends);
        int totalRate = hotelService.calculateTotalRate(cheapestBestRated, weekdays, weekends);

        System.out.println("Cheapest Best Rated Hotel: " + cheapestBestRated.getName()
                + " | Rating: " + cheapestBestRated.getRating()
                + " | Total Rates: $" + totalRate);
    }
}