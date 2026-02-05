package com.bl_java_rfp.ExceptionJava.MoodAnalyser;

/**
 * UC1–UC5 - Mood Analysis
 * Handles null mood input using constructor.
 */
public class MoodAnalyser {

    private String message;

    // UC5: Constructor handles null safely
    public MoodAnalyser(String message) {
        if (message == null) {
            this.message = "";
        } else {
            this.message = message;
        }
    }

    public MoodAnalyser() {
    }

    public String analyseMood() throws MoodAnalysisException {

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
