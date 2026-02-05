package com.bl_java_rfp.ExceptionJava.MoodAnalyser;

/**
 * UC1–UC3 - Mood Analysis
 * Analyses mood and throws custom exceptions for invalid input.
 */
public class MoodAnalyser {

    public String analyseMood(String message) throws MoodAnalysisException {

        if (message == null) {
            throw new MoodAnalysisException(
                    MoodAnalysisExceptionType.NULL_MOOD,
                    "Mood message is null"
            );
        }

        if (message.isEmpty()) {
            throw new MoodAnalysisException(
                    MoodAnalysisExceptionType.EMPTY_MOOD,
                    "Mood message is empty"
            );
        }

        if (message.contains("Sad")) {
            return "SAD";
        }

        return "HAPPY";
    }
}
