package com.bl_java_rfp.ExceptionJava.MoodAnalyser;

/**
 * Custom exception for Mood Analyser.
 */
public class MoodAnalysisException extends Exception {

    public MoodAnalysisExceptionType type;

    public MoodAnalysisException(MoodAnalysisExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
