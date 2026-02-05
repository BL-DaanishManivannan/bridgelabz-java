package com.bl_java_rfp.ExceptionJava.MoodAnalyser;

/**
 * UC1 - Mood Analysis
 * Determines mood based on the input message.
 */
public class MoodAnalyser {

    public String analyseMood(String message) {

        if (message.contains("Sad")) {
            return "SAD";
        }

        return "HAPPY";
    }
}
