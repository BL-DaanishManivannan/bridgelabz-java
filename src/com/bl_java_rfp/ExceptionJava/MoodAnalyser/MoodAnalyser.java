package com.bl_java_rfp.ExceptionJava.MoodAnalyser;

/**
 * UC1 & UC2 - Mood Analysis
 * Handles mood analysis and null input using try-catch.
 */
public class MoodAnalyser {

    public String analyseMood(String message) {

        try {
            if (message.contains("Sad")) {
                return "SAD";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }

        return "HAPPY";
    }
}
