package com.smallworldfs.tennis;

public class TennisGame

{

    private static final String localId = "player1";
    private Player localPlayer;
    private Player foreignPlayer;
    private Score score;


    public TennisGame(String localPlayerName, String foreignPlayerName) {
        localPlayer = new Player(localPlayerName);
        foreignPlayer = new Player(foreignPlayerName);
        score = new Score();
    }

    public String getScore() {
        return ScoreBoard.printScore(score);
    }

    public void wonPoint(String player) {
        if (isLocalPlayer(player)) {
            score.addPointLocal();
        } else {
            score.addPointForeign();
        }
    }

    private boolean isLocalPlayer(String playerId) {
        return localId.equals(playerId);
    }

}
