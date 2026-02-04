package com.bl_java_rfp.RegexJava;

/**
 * UC9 - Email Sample Validation
 * Validates multiple email samples using existing email regex.
 */
public class EmailSampleValidator {

    public static void main(String[] args) {

        UserRegistrationValidator validator = new UserRegistrationValidator();

        String[] validEmails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com"
        };

        String[] invalidEmails = {
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"
        };

        System.out.println("Valid Email Samples:");
        for (String email : validEmails) {
            System.out.println(email + " -> " + validator.validateEmail(email));
        }

        System.out.println("\nInvalid Email Samples:");
        for (String email : invalidEmails) {
            System.out.println(email + " -> " + validator.validateEmail(email));
        }
    }
}
