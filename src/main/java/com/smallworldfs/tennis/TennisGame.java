package com.smallworldfs.tennis;

import java.text.MessageFormat;

public class TennisGame

{

    private static final String[] POINTS = {"Love", "Fifteen", "Thirty", "Forty"};
    private static final String PLAYER_ONE = "player1";
    private static final String ALL = "-All";
    private static final String DEUCE = "Deuce";
    private static final String ADVANTAGE = "Advantage player";
    private static final String WIN = "Win for player";

    private int playerOne = 0;
    private int playerTwo = 0;

    public TennisGame(String player1Name, String player2Name) {}

    public String getScore() {
        if (isDeuce()) {
            return DEUCE;
        }
        if (isAdvance()) {
            return ADVANTAGE + getWinningPlayer();
        }
        if (isWin()) {
            return WIN + getWinningPlayer();
        }
        return getMessageFromPoints();
    }

    private boolean isWin() {
        return Math.abs(playerOne - playerTwo) >= 2 && (playerOne > 3 || playerTwo > 3);
    }

    private boolean isDeuce() {
        return isTie() && (playerOne >= 3);
    }

    private boolean isAdvance() {
        return Math.abs(playerOne - playerTwo) == 1 && playerOne >= 3 && playerTwo >= 3;
    }

    private String getMessageFromPoints() {
        if (isTie()) {
            return POINTS[playerOne] + ALL;
        }
        return String.join("-", POINTS[playerOne], POINTS[playerTwo]);
    }

    private boolean isTie() {
        return playerOne == playerTwo;
    }

    private int getWinningPlayer() {
        return playerOne > playerTwo ? 1 : 2;
    }

    public void wonPoint(String player) {
        if (PLAYER_ONE.equals(player)) {
            playerOne++;
        } else {
            playerTwo++;
        }
    }
}
