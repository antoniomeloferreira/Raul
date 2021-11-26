package com.raulmvp.model;

import java.util.List;


public class Competition {

    private int id;
    private Season seasonId;
    private int edition;
    private String name;
    private boolean isOver;
    private User winnerUsername;
    private List<Game> gameList;
    private CompetitionConfig competitionConfig;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOver() {
        return isOver;
    }

    public void setOver(boolean over) {
        isOver = over;
    }

    public User getWinnerUsername() {
        return winnerUsername;
    }

    public void setWinnerUsername(User winnerUsername) {
        this.winnerUsername = winnerUsername;
    }

    public CompetitionConfig getCompetitionConfig() {
        return competitionConfig;
    }

    public void setCompetitionConfig(CompetitionConfig competitionConfig) {
        this.competitionConfig = competitionConfig;
    }

    public Season getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Season seasonId) {
        this.seasonId = seasonId;
    }

    public List<Game> getGameList() {
        return gameList;
    }

    public void setGameList(List<Game> gameList) {
        this.gameList = gameList;
    }
}
