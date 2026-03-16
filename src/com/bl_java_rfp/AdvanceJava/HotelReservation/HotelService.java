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

    public Hotel findBestRatedHotel() {
        Hotel bestRated = null;
        int highestRating = Integer.MIN_VALUE;

        for (Hotel hotel : hotels) {
            if (hotel.getRating() > highestRating) {
                highestRating = hotel.getRating();
                bestRated = hotel;
            }
        }
        return bestRated;
    }

    public String[] parseInput(String input) {
        // Validate and split input: "Rewards: 11Sep2020(Fri), 12Sep2020(Sat)"
        if (input == null || input.isEmpty()) {
            throw new HotelReservationException(
                    HotelReservationException.ExceptionType.INVALID_DATE_FORMAT,
                    "Input cannot be null or empty");
        }

        String[] parts = input.split(":");
        String customerType = parts[0].trim();

        if (!customerType.equalsIgnoreCase("Regular")
                && !customerType.equalsIgnoreCase("Rewards")) {
            throw new HotelReservationException(
                    HotelReservationException.ExceptionType.INVALID_CUSTOMER_TYPE,
                    "Invalid customer type: " + customerType);
        }

        String[] dates = parts[1].trim().split(",");
        for (String date : dates) {
            if (!date.trim().matches("[0-9]{2}[A-Za-z]{3}[0-9]{4}\\([A-Za-z]{3}\\)")) {
                throw new HotelReservationException(
                        HotelReservationException.ExceptionType.INVALID_DATE_FORMAT,
                        "Invalid date format: " + date.trim());
            }
        }
        return dates;
    }

    public Hotel findCheapestBestRatedHotelForRewards(int weekdays, int weekends) {
        Hotel bestHotel = null;
        int lowestTotal = Integer.MAX_VALUE;

        for (Hotel hotel : hotels) {
            int totalRate = calculateRewardsTotalRate(hotel, weekdays, weekends);

            if (totalRate < lowestTotal) {
                lowestTotal = totalRate;
                bestHotel = hotel;
            } else if (totalRate == lowestTotal) {
                if (hotel.getRating() > bestHotel.getRating()) {
                    bestHotel = hotel;
                }
            }
        }
        return bestHotel;
    }

    public int calculateRewardsTotalRate(Hotel hotel, int weekdays, int weekends) {
        return (hotel.getRewardsWeekdayRate() * weekdays)
                + (hotel.getRewardsWeekendRate() * weekends);
    }
}

