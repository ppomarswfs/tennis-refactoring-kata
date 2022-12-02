package com.smallworldfs.tennis;

public final class Score {

    protected static boolean isTie(int playerOne, int playerTwo) {
        return playerOne == playerTwo;
    }

    protected static boolean isDeuce(int playerOne, int playerTwo) {
        return isTie(playerOne, playerTwo) && (playerOne >= 3);
    }

    protected static boolean isWon(int playerOne, int playerTwo) {
        return Math.abs(playerOne - playerTwo) >= 2 && (playerOne > 3 || playerTwo > 3);
    }

    protected static boolean isAdvance(int playerOne, int playerTwo) {
        return Math.abs(playerOne - playerTwo) == 1 && playerOne >= 3 && playerTwo >= 3;
    }

    protected static int getWinningPlayer(int playerOne, int playerTwo) {
        return playerOne > playerTwo ? 1 : 2;
    }

}
