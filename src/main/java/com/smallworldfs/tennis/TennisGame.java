package com.smallworldfs.tennis;

import java.text.MessageFormat;

public class TennisGame

{

    private static final String[] POINTS = {"Love", "Fifteen", "Thirty", "Forty"};
    private static final String PLAYER_ONE = "player1";
    private static final String ALL = "-All";
    private static final String DEUCE = "Deuce";
    private static final String ADVANTAGE = "Advantage ";
    private static final String WIN = "Win for ";

    private int playerOne = 0;
    private int playerTwo = 0;

    public TennisGame(String player1Name, String player2Name) {}

    public String getScore() {
        if (isWinnerOrDeuceOrAdvance()) {
            return getMessageWithoutPoints();
        }
        return getMessageFromPoints();
    }

    private boolean isWinnerOrDeuceOrAdvance() {
        return playerOne > 3 || playerTwo > 3 || (playerOne == 3 && playerTwo == 3);
    }

    private String getMessageWithoutPoints() {
        if (isTie()) {
            return DEUCE;
        } else if (isAdvance()) {
            return ADVANTAGE + getWinningPlayer();
        }
        return WIN + getWinningPlayer();
    }

    private String getWinningPlayer() {
        return "player" + (isWinningPlayerOne() ? 1 : 2);
    }

    private boolean isAdvance() {
        return Math.abs(playerOne - playerTwo) == 1;
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

    private boolean isWinningPlayerOne() {
        return playerOne > playerTwo;
    }

    public void wonPoint(String player) {
        if (PLAYER_ONE.equals(player)) {
            playerOne++;
        } else {
            playerTwo++;
        }
    }
}
