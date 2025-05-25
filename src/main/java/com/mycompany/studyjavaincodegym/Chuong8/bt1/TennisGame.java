package com.mycompany.studyjavaincodegym.Chuong8.bt1;

public class TennisGame {

    private static final String[] SCORE_NAMES = {"Love", "Fifteen", "Thirty", "Forty"};

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return getEvenScore(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            return getAdvantageOrWin(player1Score, player2Score);
        } else {
            return getNormalScore(player1Score, player2Score);
        }
    }

    private static String getEvenScore(int score) {
        switch (score) {
            case 0:
            case 1:
            case 2:
            case 3:
                return SCORE_NAMES[score] + "-All";
            default:
                return "Deuce";
        }
    }

    private static String getAdvantageOrWin(int player1Score, int player2Score) {
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1) {
            return "Advantage player1";
        } else if (scoreDifference == -1) {
            return "Advantage player2";
        } else if (scoreDifference >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private static String getNormalScore(int player1Score, int player2Score) {
        return SCORE_NAMES[player1Score] + "-" + SCORE_NAMES[player2Score];
    }
}
