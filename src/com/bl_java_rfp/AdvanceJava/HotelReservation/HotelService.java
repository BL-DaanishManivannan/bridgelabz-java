package com.bl_java_rfp.AdvanceJava.HotelReservation;

import java.util.List;

public class HotelService {

    private List<Hotel> hotels;

    public HotelService(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public Hotel findCheapestHotel(int weekdays, int weekends) {
        Hotel cheapestHotel = null;
        int lowestTotal = Integer.MAX_VALUE;

        for (Hotel hotel : hotels) {
            int totalRate = calculateTotalRate(hotel, weekdays, weekends);
            if (totalRate < lowestTotal) {
                lowestTotal = totalRate;
                cheapestHotel = hotel;
            }
        }
        return cheapestHotel;
    }

    public int calculateTotalRate(Hotel hotel, int weekdays, int weekends) {
        return (hotel.getRegularWeekdayRate() * weekdays)
                + (hotel.getRegularWeekendRate() * weekends);
    }
}