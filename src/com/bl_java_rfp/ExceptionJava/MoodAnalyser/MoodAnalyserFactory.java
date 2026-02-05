package com.bl_java_rfp.ExceptionJava.MoodAnalyser;

import java.lang.reflect.Constructor;

/**
 * UC7 - Create MoodAnalyser object using Reflection
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
}
