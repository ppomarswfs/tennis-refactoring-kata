package com.smallworldfs.tennis;

public class Player {
    private final int positionPlayer;
    private int points;


    public Player(int position) {
        this.positionPlayer= position;
    }

    public void addPoints() {
        this.points++;
    }
    public String getPositionPlayer(){
        return "player"+positionPlayer;
    }
    public int getPoints() {
        return points;
    }

}
