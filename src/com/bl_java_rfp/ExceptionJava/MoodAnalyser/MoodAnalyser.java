package com.bl_java_rfp.ExceptionJava.MoodAnalyser;

/**
 * UC1–UC6 - Mood Analysis
 * Validates mood input at object creation time.
 */
public class MoodAnalyser {

    private String message;

    // UC6: Constructor throws exception for invalid input
    public MoodAnalyser(String message) throws MoodAnalysisException {

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

        this.message = message;
    }

    public String analyseMood() {

        if (message.contains("Sad")) {
            return "SAD";
        }

        return "HAPPY";
    }
}
