package com.smallworldfs.tennis;

public class TennisGame

{
    private Player playerOne;
    private Player playerTwo;


    public TennisGame(String player1Name, String player2Name) {
        playerOne = new Player(player1Name, 1);
        playerTwo = new Player(player2Name, 2);
    }

    public String getScore() {
        return ScoreBoard.printScore(playerOne.getPoints(),playerTwo.getPoints());
    }
    public void wonPoint(String player) {
        if (playerOne.isLocalPlayer(player)) {
            playerOne.addPoint();
        } else {
            playerTwo.addPoint();
        }
    }
}
