package com.bl_java_rfp.OOPS_Concepts.OOPS_Practice.DeckOfCards;

public class DeckOfCardsExtendedMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Deck of Cards - Player Queue Extension");

        // Step 1: Create and shuffle deck (reuse logic)
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

        // Step 2: Create player queue
        PlayerQueue playerQueue = new PlayerQueue(4);

        playerQueue.enqueue(new Player("Player 1"));
        playerQueue.enqueue(new Player("Player 2"));
        playerQueue.enqueue(new Player("Player 3"));
        playerQueue.enqueue(new Player("Player 4"));

        // Step 3: Distribute 9 cards per player
        int cardsPerPlayer = 9;
        int cardIndex = 0;

        Player currentPlayer;
        while ((currentPlayer = playerQueue.dequeue()) != null) {

            for (int i = 0; i < cardsPerPlayer; i++) {
                currentPlayer.addCard(deck[cardIndex++]);
            }

            // Step 4: Sort cards
            currentPlayer.sortCardsByRank();

            // Step 5: Display cards
            currentPlayer.displayCards();

            System.out.println();
        }
    }
}
