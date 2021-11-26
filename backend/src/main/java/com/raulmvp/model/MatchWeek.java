package com.raulmvp.model;

public class MatchWeek {

    private int matchWeekNumber;
    private Game[] gameArr;

    public int getMatchWeekNumber() {
        return matchWeekNumber;
    }

    public void setMatchWeekNumber(int matchWeekNumber) {
        this.matchWeekNumber = matchWeekNumber;
    }

    public Game[] getGameArr() {
        return gameArr;
    }

    public void setGameArr(Game[] gameArr) {
        this.gameArr = gameArr;
    }
}
