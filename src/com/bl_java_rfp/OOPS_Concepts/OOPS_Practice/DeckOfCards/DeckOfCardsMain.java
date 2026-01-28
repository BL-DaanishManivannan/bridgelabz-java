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

        // UC1: Initialize deck
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

        int players = 4;
        int cardsPerPlayer = 9;
        String[][] playerCards = new String[players][cardsPerPlayer];

        int cardIndex = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex++];
            }
        }

        // UC4: Display player cards
        for (int i = 0; i < players; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println(playerCards[i][j]);
            }
        }
    }
}
