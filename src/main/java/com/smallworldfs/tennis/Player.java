package com.smallworldfs.tennis;

public class Player {

    private int points;

    private int type;
    private String name;

    public Player(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public void addPoint() {
        points++;
    }

    public int getPoints() {
        return points;
    }

    public boolean isLocalPlayer(String player) {
        return getType().equals(player);
    }

    private String getType() {
        return "player" + type;
    }
}
