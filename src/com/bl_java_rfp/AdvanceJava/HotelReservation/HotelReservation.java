package com.bl_java_rfp.AdvanceJava.HotelReservation;

import java.util.Arrays;
import java.util.List;

public class HotelReservation {

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");

        Hotel lakewood   = new Hotel("Lakewood",   110, 90,  80,  80,  3);
        Hotel bridgewood = new Hotel("Bridgewood", 160, 60,  110, 50,  4);
        Hotel ridgewood  = new Hotel("Ridgewood",  220, 150, 100, 40,  5);

        List<Hotel> hotelList = Arrays.asList(lakewood, bridgewood, ridgewood);
        HotelService hotelService = new HotelService(hotelList);

        // I/P: 11Sep2020(Fri), 12Sep2020(Sat)
        String[] dates = {"11Sep2020(Fri)", "12Sep2020(Sat)"};

        int weekdays = hotelService.countWeekdays(dates);
        int weekends = hotelService.countWeekends(dates);

        // UC6 — Cheapest Best Rated Regular
        Hotel cheapestBestRated = hotelService.findCheapestBestRatedHotel(weekdays, weekends);
        int cheapestTotal = hotelService.calculateTotalRate(cheapestBestRated, weekdays, weekends);
        System.out.println("Cheapest Best Rated Hotel: " + cheapestBestRated.getName()
                + " | Rating: " + cheapestBestRated.getRating()
                + " | Total Rates: $" + cheapestTotal);

        // UC7 — Best Rated
        Hotel bestRated = hotelService.findBestRatedHotel();
        int bestRatedTotal = hotelService.calculateTotalRate(bestRated, weekdays, weekends);
        System.out.println("Best Rated Hotel: " + bestRated.getName()
                + " | Rating: " + bestRated.getRating()
                + " | Total Rates: $" + bestRatedTotal);

        // UC9 — Print all hotels with rewards rates
        System.out.println("\n--- Hotels with Rewards Rates ---");
        for (Hotel hotel : hotelList) {
            System.out.println(hotel);
        }
    }
}