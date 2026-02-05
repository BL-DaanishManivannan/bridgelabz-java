package com.bl_java_rfp.ExceptionJava.MoodAnalyser;

/**
 * UC0 + Reflection execution
 */
public class MoodAnalyserMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Mood Analyser Program");

        try {
            MoodAnalyser analyser =
                    MoodAnalyserFactory.createMoodAnalyser("I am in Sad Mood");

            String mood =
                    MoodAnalyserFactory.invokeAnalyseMood(analyser);

            System.out.println("Mood: " + mood);

        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.type + " - " + e.getMessage());
        }
    }
}
