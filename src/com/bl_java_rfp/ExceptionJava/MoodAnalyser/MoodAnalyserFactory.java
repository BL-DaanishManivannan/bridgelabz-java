package com.bl_java_rfp.ExceptionJava.MoodAnalyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

/**
 * UC7–UC11 - Reflection utilities for MoodAnalyser
 */
public class MoodAnalyserFactory {

    public static MoodAnalyser createMoodAnalyser(String message)
            throws MoodAnalysisException {

        try {
            // UC11: Class loading
            Class<?> moodClass =
                    Class.forName("com.bl_java_rfp.ExceptionJava.MoodAnalyser.MoodAnalyser");

            Constructor<?> constructor =
                    moodClass.getConstructor(String.class);

            return (MoodAnalyser) constructor.newInstance(message);

        } catch (ClassNotFoundException e) {
            // UC11: Class not found
            throw new MoodAnalysisException(
                    MoodAnalysisExceptionType.NULL_MOOD,
                    "MoodAnalyser class not found"
            );

        } catch (NoSuchMethodException e) {
            throw new MoodAnalysisException(
                    MoodAnalysisExceptionType.EMPTY_MOOD,
                    "Required constructor not found"
            );

        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new MoodAnalysisException(
                    MoodAnalysisExceptionType.EMPTY_MOOD,
                    "Unable to create MoodAnalyser object"
            );
        }
    }

    public static String invokeAnalyseMood(MoodAnalyser analyser)
            throws MoodAnalysisException {

        try {
            Method method =
                    analyser.getClass().getMethod("analyseMood");

            return (String) method.invoke(analyser);

        } catch (NoSuchMethodException e) {
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
