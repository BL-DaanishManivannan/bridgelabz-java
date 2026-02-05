package com.bl_java_rfp.ExceptionJava.MoodAnalyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * UC7 & UC8 - Reflection utilities for MoodAnalyser
 */
public class MoodAnalyserFactory {

    public static MoodAnalyser createMoodAnalyser(String message)
            throws MoodAnalysisException {

        try {
            Class<?> moodClass =
                    Class.forName("com.bl_java_rfp.ExceptionJava.MoodAnalyser.MoodAnalyser");

            Constructor<?> constructor =
                    moodClass.getConstructor(String.class);

            return (MoodAnalyser) constructor.newInstance(message);

        } catch (Exception e) {
            throw new MoodAnalysisException(
                    MoodAnalysisExceptionType.NULL_MOOD,
                    "Failed to create MoodAnalyser object using reflection"
            );
        }
    }

    // UC8: Invoke analyseMood() using reflection
    public static String invokeAnalyseMood(MoodAnalyser analyser)
            throws MoodAnalysisException {

        try {
            Method method =
                    analyser.getClass().getMethod("analyseMood");

            return (String) method.invoke(analyser);

        } catch (Exception e) {
            throw new MoodAnalysisException(
                    MoodAnalysisExceptionType.NULL_MOOD,
                    "Failed to invoke analyseMood() using reflection"
            );
        }
    }
}
