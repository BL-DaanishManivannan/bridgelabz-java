package com.bl_java_rfp.RegexJava;

import java.util.regex.Pattern;

/**
 * UC1–UC3 - User Registration Validation
 * Validates first name, last name, and email using regex rules.
 */
public class UserRegistrationValidator {

    private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME_REGEX  = "^[A-Z][a-z]{2,}$";

    // UC3: Email validation regex
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(FIRST_NAME_REGEX, firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches(LAST_NAME_REGEX, lastName);
    }

    // UC3: Email validation
    public boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }
}
