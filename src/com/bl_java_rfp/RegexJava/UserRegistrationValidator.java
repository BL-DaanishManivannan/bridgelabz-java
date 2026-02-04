package com.bl_java_rfp.RegexJava;

import java.util.regex.Pattern;

/**
 * UC1 - First Name Validation
 * Validates first name using regex rules.
 */
public class UserRegistrationValidator {

    private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}$";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(FIRST_NAME_REGEX, firstName);
    }
}
