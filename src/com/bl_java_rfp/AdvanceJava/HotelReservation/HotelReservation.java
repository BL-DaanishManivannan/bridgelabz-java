package com.bl_java_rfp.AdvanceJava.HotelReservation;

public class HotelReservation {

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");

        Hotel lakewood    = new Hotel("Lakewood", 110, 90);
        Hotel bridgewood  = new Hotel("Bridgewood", 160, 60);
        Hotel ridgewood   = new Hotel("Ridgewood", 220, 150);

        System.out.println(lakewood);
        System.out.println(bridgewood);
        System.out.println(ridgewood);
    }
}
