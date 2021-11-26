package com.raulmvp.model;

import java.util.List;


public class Competition {

    private int id;
    private Season season;
    private int edition;
    private String name;
    private boolean isOver;
    private RaulUser winner;
    private List<Game> calendar;
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

    public RaulUser getWinner() {
        return winner;
    }

    public void setWinner(RaulUser winner) {
        this.winner = winner;
    }

    public CompetitionConfig getCompetitionConfig() {
        return competitionConfig;
    }

    public void setCompetitionConfig(CompetitionConfig competitionConfig) {
        this.competitionConfig = competitionConfig;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public List<Game> getCalendar() {
        return calendar;
    }

    public void setCalendar(List<Game> calendar) {
        this.calendar = calendar;
    }
}
