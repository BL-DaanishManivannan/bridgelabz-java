package com.bl_java_rfp.ExceptionJava.MoodAnalyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

/**
 * UC7–UC9 - Reflection utilities for MoodAnalyser
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

        } catch (NoSuchMethodException e) {
            // UC9: Method not found
            throw new MoodAnalysisException(
                    MoodAnalysisExceptionType.EMPTY_MOOD,
                    "Method analyseMood not found"
            );
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new MoodAnalysisException(
                    MoodAnalysisExceptionType.EMPTY_MOOD,
                    "Unable to invoke analyseMood method"
            );
        }
    }
}
