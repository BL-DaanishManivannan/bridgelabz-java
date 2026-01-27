package com.bl_java_rfp.java_workshop.gambling;

import java.util.Random;
public class Gambling {
    static final int STAKE = 100;
    static final int BET = 1;
    static final int WIN = 1;
    static final int LOWER_LIMIT = 50;
    static final int UPPER_LIMIT = 150;

    public static void main(String[] args) {
        startGambling();
    }

    static void startGambling() {
        int stake = STAKE;
        stake = playGame(stake);

        while (stake > LOWER_LIMIT && stake < UPPER_LIMIT) {
            stake = playGame(stake);
        }
    }

    static int playGame(int stake) {
        Random random = new Random();
        int result = random.nextInt(2);

        if (result == WIN) {
            stake += BET;
        } else {
            stake -= BET;
        }
        return stake;
    }
}
