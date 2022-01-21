package com.raulmvp.model;

public class TeamRank {

    private int universeId;
    private Team teamName;
    private int ranking;
    private boolean isDefault;

    public int getUniverseId() {
        return universeId;
    }

    public void setUniverseId(int universeId) {
        this.universeId = universeId;
    }

    public Team getTeamName() {
        return teamName;
    }

    public void setTeamName(Team teamName) {
        this.teamName = teamName;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }
}