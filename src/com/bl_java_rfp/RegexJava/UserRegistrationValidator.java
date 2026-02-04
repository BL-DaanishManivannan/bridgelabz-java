package com.bl_java_rfp.RegexJava;

import java.util.regex.Pattern;

/**
 * UC1 & UC2 - Name Validation
 * Validates first name and last name using regex rules.
 */
public class UserRegistrationValidator {

    private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME_REGEX  = "^[A-Z][a-z]{2,}$";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(FIRST_NAME_REGEX, firstName);
    }

    // UC2: Last name validation
    public boolean validateLastName(String lastName) {
        return Pattern.matches(LAST_NAME_REGEX, lastName);
    }
}
