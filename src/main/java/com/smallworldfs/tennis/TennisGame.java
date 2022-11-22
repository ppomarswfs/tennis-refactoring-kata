package com.smallworldfs.tennis;

public class TennisGame

{

    private static final String[] points = {"Love", "Fifteen", "Thirty", "Forty"};
    private static final String[] results = {"Deuce", "Advantage ", "Win for "};

    private Player playerOne;
    private Player playerTwo;

    public TennisGame(String player1Name, String player2Name) {
        this.playerOne = new Player(1);
        this.playerTwo = new Player(2);
    }
    public String getScore() {
        int difference = playerOne.getPoints() - playerTwo.getPoints();
        if (isWinnerOrDeuce(playerOne.getPoints(), playerTwo.getPoints())) {
            return getMessage(difference) + getWinningPlayer(difference);
        }
        if (isTie(difference)) {
            return points[playerOne.getPoints()] + "-All";
        }
        return points[playerOne.getPoints()] + "-" + points[playerTwo.getPoints()];
    }
    private boolean isTie(int difference) {
        return difference == 0;
    }
    private String getWinningPlayer(int difference) {
        if (isTie(difference)) {
            return "";
        }
        return "player" + (isWinningPlayerOne(difference) ? 1 : 2);
    }

    private boolean isWinningPlayerOne(int difference) {
        return difference > 0;
    }

    private String getMessage(int index) {
        return results[Math.min(2, Math.abs(index))];
    }

    private boolean isWinnerOrDeuce(int points, int points1) {
        return points > 3 || points1 > 3 || (points == 3 && points1 ==3);
    }
    public void wonPoint(String player) {
        if (player != null && player.equals(playerOne.getPositionPlayer())) {
            playerOne.addPoints();
        } else {
            playerTwo.addPoints();
        }
    }
}
