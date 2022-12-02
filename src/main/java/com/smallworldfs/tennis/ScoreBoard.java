package com.smallworldfs.tennis;

public final class ScoreBoard {

    private static final String[] POINTS = {"Love", "Fifteen", "Thirty", "Forty"};

    private static final String ALL = "-All";
    private static final String DEUCE = "Deuce";
    private static final String ADVANTAGE = "Advantage player";
    private static final String WIN = "Win for player";

    private static final String POINTS_SEPARATOR = "-";


    public static String printScore(Score score) {
        if (score.isDeuce()) {
            return ScoreBoard.DEUCE;
        }
        if (score.isAdvance()) {
            return ScoreBoard.ADVANTAGE + score.getWinningPlayer();
        }
        if (score.isWon()) {
            return ScoreBoard.WIN + score.getWinningPlayer();
        }
        if (score.isTie()) {
            return ScoreBoard.POINTS[score.getLocalPlayerPoints()] + ScoreBoard.ALL;
        }
        return String.join(POINTS_SEPARATOR, ScoreBoard.POINTS[score.getLocalPlayerPoints()], ScoreBoard.POINTS[score.getForeignPlayerPoints()]);
    }

}
