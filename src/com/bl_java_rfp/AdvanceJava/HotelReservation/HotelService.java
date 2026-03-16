package com.bl_java_rfp.AdvanceJava.HotelReservation;

import java.util.List;

public class HotelService {

    private List<Hotel> hotels;

    public HotelService(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public int countWeekdays(String[] dates) {
        int count = 0;
        for (String date : dates) {
            String day = extractDay(date).toLowerCase();
            if (!day.equals("sat") && !day.equals("sun")) {
                count++;
            }
        }
        return count;
    }

    public int countWeekends(String[] dates) {
        int count = 0;
        for (String date : dates) {
            String day = extractDay(date).toLowerCase();
            if (day.equals("sat") || day.equals("sun")) {
                count++;
            }
        }
        return count;
    }

    private String extractDay(String date) {
        return date.substring(date.indexOf("(") + 1, date.indexOf(")"));
    }

    public Hotel findCheapestBestRatedHotel(int weekdays, int weekends) {
        Hotel bestHotel = null;
        int lowestTotal = Integer.MAX_VALUE;

        for (Hotel hotel : hotels) {
            int totalRate = calculateTotalRate(hotel, weekdays, weekends);

            if (totalRate < lowestTotal) {
                lowestTotal = totalRate;
                bestHotel = hotel;
            } else if (totalRate == lowestTotal) {
                // Tie-breaker: pick hotel with higher rating
                if (hotel.getRating() > bestHotel.getRating()) {
                    bestHotel = hotel;
                }
            }
        }
        return bestHotel;
    }

    public int calculateTotalRate(Hotel hotel, int weekdays, int weekends) {
        return (hotel.getRegularWeekdayRate() * weekdays)
                + (hotel.getRegularWeekendRate() * weekends);
    }
}