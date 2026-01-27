package com.bl_java_rfp.programming_constructs;

public class SnakeAndLadder {

    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder Game");

        int position = 0;
        int diceRoll = (int) (Math.floor(Math.random() * 10) % 6) + 1;

        System.out.println("Player starts at position: " + position);
        System.out.println("Dice rolled: " + diceRoll);

    }
}
