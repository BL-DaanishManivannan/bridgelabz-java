package com.bl_java_rfp.AdvanceJava.HotelReservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class HotelService {

    private List<Hotel> hotels;
    private static final String DATE_REGEX = "[0-9]{2}[A-Za-z]{3}[0-9]{4}\\([A-Za-z]{3}\\)";
    private static final DateTimeFormatter DATE_FORMATTER =
            DateTimeFormatter.ofPattern("ddMMMuuuu", Locale.ENGLISH);

    public HotelService(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    // Parse and validate full input string
    public String[] parseInput(String input) {
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
        Arrays.stream(dates)
                .map(String::trim)
                .filter(date -> !date.matches(DATE_REGEX))
                .findAny()
                .ifPresent(invalid -> {
                    throw new HotelReservationException(
                            HotelReservationException.ExceptionType.INVALID_DATE_FORMAT,
                            "Invalid date format: " + invalid);
                });

        return dates;
    }

    // Extract date string without day abbreviation: 11Sep2020(Fri) -> 11Sep2020
    private String extractDatePart(String date) {
        return date.trim().substring(0, date.indexOf("(")).trim();
    }

    // Use Java 8 LocalDate to determine if date is weekend
    private boolean isWeekend(String date) {
        LocalDate localDate = LocalDate.parse(extractDatePart(date), DATE_FORMATTER);
        return localDate.getDayOfWeek().getValue() == 6
                || localDate.getDayOfWeek().getValue() == 7;
    }

    public long countWeekdays(String[] dates) {
        return Arrays.stream(dates)
                .filter(date -> !isWeekend(date))
                .count();
    }

    public long countWeekends(String[] dates) {
        return Arrays.stream(dates)
                .filter(this::isWeekend)
                .count();
    }

    // Stream-based cheapest best-rated for rewards customer
    public Hotel findCheapestBestRatedHotelForRewards(long weekdays, long weekends) {
        return hotels.stream()
                .sorted(Comparator
                        .comparingInt((Hotel h) ->
                                calculateRewardsTotalRate(h, weekdays, weekends))
                        .thenComparingInt(h -> -h.getRating()))
                .findFirst()
                .orElse(null);
    }

    public int calculateRewardsTotalRate(Hotel hotel, long weekdays, long weekends) {
        return (int) ((hotel.getRewardsWeekdayRate() * weekdays)
                + (hotel.getRewardsWeekendRate() * weekends));
    }

    public int calculateTotalRate(Hotel hotel, long weekdays, long weekends) {
        return (int) ((hotel.getRegularWeekdayRate() * weekdays)
                + (hotel.getRegularWeekendRate() * weekends));
    }

    public Hotel findBestRatedHotel() {
        return hotels.stream()
                .max(Comparator.comparingInt(Hotel::getRating))
                .orElse(null);
    }
}