package com.bl_java_rfp.RegexJava;

import java.util.regex.Pattern;

/**
 * UC1–UC7 - User Registration Validation
 * Adds password rule 3 validation (at least one numeric digit).
 */
public class UserRegistrationValidator {

    private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME_REGEX  = "^[A-Z][a-z]{2,}$";

    // UC3: Email validation
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

    // UC4: Mobile number validation
    private static final String MOBILE_REGEX = "^[0-9]{2}\\s[0-9]{10}$";

    // UC5: Password rule 1 (minimum 8 characters)
    private static final String PASSWORD_RULE1_REGEX = "^.{8,}$";

    // UC6: Password rule 2 (at least one uppercase letter)
    private static final String PASSWORD_RULE2_REGEX = ".*[A-Z].*";

    // UC7: Password rule 3 (at least one numeric digit)
    private static final String PASSWORD_RULE3_REGEX = ".*[0-9].*";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(FIRST_NAME_REGEX, firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches(LAST_NAME_REGEX, lastName);
    }

    public boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    public boolean validateMobileNumber(String mobileNumber) {
        return Pattern.matches(MOBILE_REGEX, mobileNumber);
    }

    public boolean validatePasswordRule1(String password) {
        return Pattern.matches(PASSWORD_RULE1_REGEX, password);
    }

    public boolean validatePasswordRule2(String password) {
        return Pattern.matches(PASSWORD_RULE2_REGEX, password);
    }

    // UC7: Password rule 3 validation
    public boolean validatePasswordRule3(String password) {
        return Pattern.matches(PASSWORD_RULE3_REGEX, password);
    }
}
