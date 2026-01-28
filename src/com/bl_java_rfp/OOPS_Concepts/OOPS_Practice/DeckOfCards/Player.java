package com.bl_java_rfp.OOPS_Concepts.OOPS_Practice.DeckOfCards;

public class Player {

    private String playerName;
    private String[] cards;
    private int cardCount;

    public Player(String playerName, int maxCards) {
        this.playerName = playerName;
        this.cards = new String[maxCards];
        this.cardCount = 0;
    }

    public void addCard(String card) {
        if (cardCount < cards.length) {
            cards[cardCount++] = card;
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public String[] getCards() {
        return cards;
    }

    public int getCardCount() {
        return cardCount;
    }
}
