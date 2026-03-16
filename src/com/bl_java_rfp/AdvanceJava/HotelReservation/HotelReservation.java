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

        try {
            // UC11 — Rewards Customer
            String rewardsInput = "Rewards: 11Sep2020(Fri), 12Sep2020(Sat)";
            String[] rewardsDates = hotelService.parseInput(rewardsInput);

            long rewardsWeekdays = hotelService.countWeekdays(rewardsDates);
            long rewardsWeekends = hotelService.countWeekends(rewardsDates);

            Hotel cheapestRewards = hotelService
                    .findCheapestBestRatedHotelForRewards(rewardsWeekdays, rewardsWeekends);
            int rewardsTotal = hotelService
                    .calculateRewardsTotalRate(cheapestRewards, rewardsWeekdays, rewardsWeekends);

            System.out.println("Rewards Customer:");
            System.out.println("Cheapest Best Rated Hotel: " + cheapestRewards.getName()
                    + " | Rating: " + cheapestRewards.getRating()
                    + " | Total Rates: $" + rewardsTotal);

            // UC12 — Regular Customer
            String regularInput = "Regular: 11Sep2020(Fri), 12Sep2020(Sat)";
            String[] regularDates = hotelService.parseInput(regularInput);

            long regularWeekdays = hotelService.countWeekdays(regularDates);
            long regularWeekends = hotelService.countWeekends(regularDates);

            Hotel cheapestRegular = hotelService
                    .findCheapestBestRatedHotelForRegular(regularWeekdays, regularWeekends);
            int regularTotal = hotelService
                    .calculateTotalRate(cheapestRegular, regularWeekdays, regularWeekends);

            System.out.println("\nRegular Customer:");
            System.out.println("Cheapest Best Rated Hotel: " + cheapestRegular.getName()
                    + " | Rating: " + cheapestRegular.getRating()
                    + " | Total Rates: $" + regularTotal);

        } catch (HotelReservationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}