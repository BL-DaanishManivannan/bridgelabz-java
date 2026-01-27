package com.bl_java_rfp.java_workshop.gambling;

import java.util.Random;
public class Gambling {
    static final int STAKE = 100;
    static final int BET = 1;
    static final int WIN = 1;
    static final int LOWER_LIMIT = 50;
    static final int UPPER_LIMIT = 150;
    static final int DAYS = 20;


    public static void main(String[] args) {
        startGambling();
        trackLuckiestUnluckiestDay();

    }
    static void playForDays() {
    int totalAmount = 0;

    for (int day = 1; day <= DAYS; day++) {
            int stake = STAKE;

            while (stake > LOWER_LIMIT && stake < UPPER_LIMIT) {
                stake = playGame(stake);
                }

            totalAmount += (stake - STAKE);
    }
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
    static void trackWinLossDays() {
        int winDays = 0;
        int lossDays = 0;

        for (int day = 1; day <= DAYS; day++) {
            int stake = STAKE;

            while (stake > LOWER_LIMIT && stake < UPPER_LIMIT) {
                stake = playGame(stake);
            }
            if (stake > STAKE) {
                winDays++;
            } else {
                lossDays++;
            }
        }
        static void trackLuckiestUnluckiestDay() {
            int maxWin = Integer.MIN_VALUE;
            int maxLoss = Integer.MAX_VALUE;
            int luckiestDay = 0;
            int unluckiestDay = 0;

            for (int day = 1; day <= DAYS; day++) {
                int stake = STAKE;

                while (stake > LOWER_LIMIT && stake < UPPER_LIMIT) {
                            stake = playGame(stake);
                        }
                int dailyResult = stake - STAKE;

                if (dailyResult > maxWin) {
                    maxWin = dailyResult;
                    luckiestDay = day;
                }
                if (dailyResult < maxLoss) {
                maxLoss = dailyResult;
                unluckiestDay = day;
                }
            }
        }

    }
}
