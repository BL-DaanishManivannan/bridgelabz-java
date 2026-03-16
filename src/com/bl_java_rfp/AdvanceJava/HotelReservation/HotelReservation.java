package com.bl_java_rfp.AdvanceJava.HotelReservation;

import java.util.Arrays;
import java.util.List;

public class HotelReservation {

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");

        Hotel lakewood   = new Hotel("Lakewood", 110, 90);
        Hotel bridgewood = new Hotel("Bridgewood", 160, 60);
        Hotel ridgewood  = new Hotel("Ridgewood", 220, 150);

        List<Hotel> hotelList = Arrays.asList(lakewood, bridgewood, ridgewood);
        HotelService hotelService = new HotelService(hotelList);

        // I/P: 10Sep2020, 11Sep2020 — 2 weekdays
        int numberOfDays = 2;
        Hotel cheapest = hotelService.findCheapestHotel(numberOfDays);
        int totalRate = hotelService.calculateTotalRate(cheapest, numberOfDays);

        System.out.println("Cheapest Hotel: " + cheapest.getName()
                + ", Total Rates: $" + totalRate);
    }
}