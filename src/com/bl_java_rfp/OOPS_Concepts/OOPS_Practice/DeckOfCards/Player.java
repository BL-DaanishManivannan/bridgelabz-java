package com.bl_java_rfp.OOPS_Concepts.OOPS_Practice.DeckOfCards;

public class Player {

    private String playerName;
    private CardNode head;
    private CardNode tail;
    private int cardCount;

    public Player(String playerName) {
        this.playerName = playerName;
        this.head = null;
        this.tail = null;
        this.cardCount = 0;
    }

    // UC5.3: Add card to linked list
    public void addCard(String card) {
        CardNode newNode = new CardNode(card);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        cardCount++;
    }

    public String getPlayerName() {
        return playerName;
    }

    public CardNode getHead() {
        return head;
    }

    public int getCardCount() {
        return cardCount;
    }
}
