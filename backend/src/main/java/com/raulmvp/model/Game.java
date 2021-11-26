package com.raulmvp.model;

public class Game {

    private int id;
    private User homeUser;
    private User awayUser;
    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;
    private Competition competitionId;

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getHomeUser() {
        return homeUser;
    }

    public void setHomeUser(User homeUser) {
        this.homeUser = homeUser;
    }

    public User getAwayUser() {
        return awayUser;
    }

    public void setAwayUser(User awayUser) {
        this.awayUser = awayUser;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public Competition getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Competition competitionId) {
        this.competitionId = competitionId;
    }

    @Override
    public String toString() {
        return this.homeTeam.getFullName() + " vs " + this.awayTeam.getFullName();
    }
}
