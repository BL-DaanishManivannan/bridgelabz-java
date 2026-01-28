package com.bl_java_rfp.OOPS_Concepts.OOPS_Practice.DeckOfCards;

public class DeckOfCardsMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Deck of Cards Program");

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        String[] deck = new String[52];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        for (int i = 0; i < deck.length; i++) {
            int randomIndex = (int) (Math.random() * deck.length);

            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        System.out.println("Deck shuffled successfully");
    }
}
