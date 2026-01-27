package com.bl_java_rfp.basic_core_funtional_programs;

import java.util.Scanner;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                writer.print(arr[i][j] + " ");
            writer.println();
        }
        writer.flush();
    }
}