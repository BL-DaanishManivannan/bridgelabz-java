package com.bl_java_rfp.basic_core_funtional_programs;

public class WindChill {
    public static void main(String[] args) {

        // Command-line arguments
        double t = Double.parseDouble(args[0]); // temperature (F)
        double v = Double.parseDouble(args[1]); // wind speed (mph)

        // Constraint check
        if (Math.abs(t) > 50 || v < 3 || v > 120) {
            System.out.println("Values out of valid range");
            return;
        }

        // Wind chill formula
        double windChill = 35.74 + 0.6215 * t
                + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        System.out.println("Wind Chill: " + windChill);
    }
}