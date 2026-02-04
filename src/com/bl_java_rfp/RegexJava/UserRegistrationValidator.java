package com.bl_java_rfp.RegexJava;

import java.util.regex.Pattern;

/**
 * UC1–UC4 - User Registration Validation
 * Validates first name, last name, email, and mobile number using regex rules.
 */
public class UserRegistrationValidator {

    private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME_REGEX  = "^[A-Z][a-z]{2,}$";

    // UC3: Email validation
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

    // UC4: Mobile number validation (country code + space + 10 digits)
    private static final String MOBILE_REGEX = "^[0-9]{2}\\s[0-9]{10}$";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(FIRST_NAME_REGEX, firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches(LAST_NAME_REGEX, lastName);
    }

    public boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    // UC4: Mobile number validation
    public boolean validateMobileNumber(String mobileNumber) {
        return Pattern.matches(MOBILE_REGEX, mobileNumber);
    }
}
