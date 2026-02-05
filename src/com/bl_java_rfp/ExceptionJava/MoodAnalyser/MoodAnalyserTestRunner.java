package com.bl_java_rfp.ExceptionJava.MoodAnalyser;

/**
 * Manual Test Runner for Mood Analyser Assessment
 * This is NOT a JUnit test.
 * Used to validate all UCs via normal Java execution.
 */
public class MoodAnalyserTestRunner {

    public static void main(String[] args) {

        System.out.println("===== Mood Analyser Manual Test Runner =====");

        testHappyMood();
        testSadMood();
        testNullMood();
        testEmptyMood();
        testReflectionCreation();
        testReflectionMethodInvocation();

        System.out.println("===== Manual Testing Completed =====");
    }

    private static void testHappyMood() {
        try {
            MoodAnalyser analyser = new MoodAnalyser("I am in Happy Mood");
            System.out.println("Happy Mood Test : " + analyser.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println("Happy Mood Test Failed : " + e.type);
        }
    }

    private static void testSadMood() {
        try {
            MoodAnalyser analyser = new MoodAnalyser("I am in Sad Mood");
            System.out.println("Sad Mood Test : " + analyser.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println("Sad Mood Test Failed : " + e.type);
        }
    }

    private static void testNullMood() {
        try {
            MoodAnalyser analyser = new MoodAnalyser(null);
            System.out.println("Null Mood Test : " + analyser.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println("Null Mood Test Caught : " + e.type + " - " + e.getMessage());
        }
    }

    private static void testEmptyMood() {
        try {
            MoodAnalyser analyser = new MoodAnalyser("");
            System.out.println("Empty Mood Test : " + analyser.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println("Empty Mood Test Caught : " + e.type + " - " + e.getMessage());
        }
    }

    private static void testReflectionCreation() {
        try {
            MoodAnalyser analyser =
                    MoodAnalyserFactory.createMoodAnalyser("I am in Happy Mood");
            System.out.println("Reflection Object Creation Test : SUCCESS");
        } catch (MoodAnalysisException e) {
            System.out.println("Reflection Object Creation Test Failed : " + e.type);
        }
    }

    private static void testReflectionMethodInvocation() {
        try {
            MoodAnalyser analyser =
                    MoodAnalyserFactory.createMoodAnalyser("I am in Sad Mood");

            String mood =
                    MoodAnalyserFactory.invokeAnalyseMood(analyser);

            System.out.println("Reflection Method Invocation Test : " + mood);

        } catch (MoodAnalysisException e) {
            System.out.println("Reflection Method Invocation Test Failed : " + e.type);
        }
    }
}
