package com.smallworldfs.tennis;

public final class ScoreBoard {

    private static final String[] POINTS = {"Love", "Fifteen", "Thirty", "Forty"};

    private static final String ALL = "-All";
    private static final String DEUCE = "Deuce";
    private static final String ADVANTAGE = "Advantage player";
    private static final String WIN = "Win for player";

    private static final String POINTS_SEPARATOR = "-";


    public static String printScore(int pointsOne, int pointsTwo) {
        if (Score.isDeuce(pointsOne, pointsTwo)) {
            return ScoreBoard.DEUCE;
        }
        if (Score.isAdvance(pointsOne, pointsTwo)) {
            return ScoreBoard.ADVANTAGE + Score.getWinningPlayer(pointsOne, pointsTwo);
        }
        if (Score.isWon(pointsOne, pointsTwo)) {
            return ScoreBoard.WIN + Score.getWinningPlayer(pointsOne, pointsTwo);
        }
        if (Score.isTie(pointsOne, pointsTwo)) {
            return ScoreBoard.POINTS[pointsOne] + ScoreBoard.ALL;
        }
        return String.join(POINTS_SEPARATOR, ScoreBoard.POINTS[pointsOne], ScoreBoard.POINTS[pointsTwo]);
    }

}
