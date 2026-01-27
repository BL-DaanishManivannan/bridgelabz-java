package com.bl_java_rfp.logical_programs;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Press Enter to start the Stopwatch");
        sc.nextLine();

        long startTime = System.currentTimeMillis();

        System.out.println("Press Enter to stop the Stopwatch");
        sc.nextLine();

        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
    }
}

