package com.bl_java_rfp.programming_constructs;

public class SnakeAndLadder {

    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder Game");

        int position = 0;
        int diceRoll = (int) (Math.floor(Math.random() * 10) % 6) + 1;
        int option = (int) (Math.floor(Math.random() * 10) % 3);

        if (option == 0) {
            System.out.println("No Play");
        } else if (option == 1) {
            position += diceRoll;
            System.out.println("Ladder");
        } else {
            position -= diceRoll;
            if (position < 0) {
                position = 0;
            }
            System.out.println("Snake");
        }

        System.out.println("Dice rolled: " + diceRoll);
        System.out.println("Player position: " + position);

    }
}
