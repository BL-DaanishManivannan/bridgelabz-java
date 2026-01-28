package com.bl_java_rfp.OOPS_Concepts.OOPS_Practice.DeckOfCards;

public class Player {

    private String playerName;
    private CardNode head;
    private CardNode tail;
    private int cardCount;

    private static final String[] RANK_ORDER = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
    };

    public Player(String playerName) {
        this.playerName = playerName;
        this.head = null;
        this.tail = null;
        this.cardCount = 0;
    }

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

    // UC5.4: Sort cards by rank
    public void sortCardsByRank() {

        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            CardNode current = head;

            while (current.next != null) {
                if (getRankIndex(current.card) > getRankIndex(current.next.card)) {
                    String temp = current.card;
                    current.card = current.next.card;
                    current.next.card = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    private int getRankIndex(String card) {
        String rank = card.split(" ")[0];

        for (int i = 0; i < RANK_ORDER.length; i++) {
            if (RANK_ORDER[i].equals(rank)) {
                return i;
            }
        }
        return -1;
    }

    public String getPlayerName() {
        return playerName;
    }

    public CardNode getHead() {
        return head;
    }
}
