package com.smallworldfs.tennis;

public  class Score {

    private int localPlayerPoints;
    private int foreignPlayerPoints;

    public int getLocalPlayerPoints() {
        return localPlayerPoints;
    }

    public int getForeignPlayerPoints() {
        return foreignPlayerPoints;
    }

    protected boolean isTie() {
        return localPlayerPoints == foreignPlayerPoints;
    }

    protected  boolean isDeuce() {
        return isTie() && (localPlayerPoints >= 3);
    }

    protected  boolean isWon() {
        return Math.abs(localPlayerPoints - foreignPlayerPoints) >= 2 && (localPlayerPoints > 3 || foreignPlayerPoints > 3);
    }

    protected  boolean isAdvance() {
        return Math.abs(localPlayerPoints - foreignPlayerPoints) == 1 && localPlayerPoints >= 3 && foreignPlayerPoints >= 3;
    }

    protected  int getWinningPlayer() {
        return localPlayerPoints > foreignPlayerPoints ? 1 : 2;
    }

    protected void addPointLocal(){
        localPlayerPoints++;
    }
    protected void addPointForeign(){
        foreignPlayerPoints++;
    }

}
