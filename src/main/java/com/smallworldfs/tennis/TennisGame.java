package com.smallworldfs.tennis;

public class TennisGame

{

    private static final String[] POINTS = {"Love", "Fifteen", "Thirty", "Forty"};
    private static final String[] RESULTS = {"Deuce", "Advantage ", "Win for "};
    private static final String PLAYER_ONE = "player1";
    private static final String ALL = "-All";
    private int playerOne = 0;
    private int playerTwo = 0;


    public TennisGame(String player1Name, String player2Name) {}

    public String getScore() {
        if (isWinnerOrDeuce()) {
            return getMessageFromResults();
        }
        return getMessageFromPoints();
    }
    private boolean isWinnerOrDeuce() {
        return playerOne > 3 || playerTwo > 3 || (playerOne == 3 && playerTwo == 3);
    }

    private String getMessageFromResults() {
        int difference = playerOne - playerTwo;
        return RESULTS[Math.min(2, Math.abs(difference))] + getWinningPlayer(difference);
    }
    private String getWinningPlayer(int difference) {
        if (isTie()) {
            return "";
        }
        return "player" + (isWinningPlayerOne(difference) ? 1 : 2);
    }

    private String getMessageFromPoints() {
        if (isTie()) {
            return POINTS[playerOne] + ALL;
        }
        return POINTS[playerOne] + "-" + POINTS[playerTwo];
    }

    private boolean isTie() {
        return playerOne == playerTwo;
    }
    private boolean isWinningPlayerOne(int difference) {
        return difference > 0;
    }


    public void wonPoint(String player) {
        if (PLAYER_ONE.equals(player)) {
            playerOne++;
        } else {
            playerTwo++;
        }
    }
}
