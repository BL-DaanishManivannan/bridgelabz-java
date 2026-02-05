package com.bl_java_rfp.ExceptionJava.MoodAnalyser;

/**
 * UC1–UC4 - Mood Analysis
 * Supports mood analysis using constructor input.
 */
public class MoodAnalyser {

    private String message;

    // UC4: Constructor to accept mood message
    public MoodAnalyser(String message) {
        this.message = message;
    }

    // Default constructor (optional but safe)
    public MoodAnalyser() {
    }

    public String analyseMood() throws MoodAnalysisException {

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
