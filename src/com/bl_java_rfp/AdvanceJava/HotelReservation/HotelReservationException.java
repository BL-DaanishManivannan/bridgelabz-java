package com.bl_java_rfp.AdvanceJava.HotelReservation;

public class HotelReservationException extends RuntimeException {

    public enum ExceptionType {
        INVALID_CUSTOMER_TYPE,
        INVALID_DATE_FORMAT
    }

    private ExceptionType exceptionType;

    public HotelReservationException(ExceptionType exceptionType, String message) {
        super(message);
        this.exceptionType = exceptionType;
    }

    public ExceptionType getExceptionType() {
        return exceptionType;
    }
}