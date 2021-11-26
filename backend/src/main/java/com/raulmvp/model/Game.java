package com.raulmvp.model;

public class Game {

    private int id;
    private RaulUser homeUser;
    private RaulUser awayUser;
    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;
    private Competition competition;

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

    public RaulUser getHomeUser() {
        return homeUser;
    }

    public void setHomeUser(RaulUser homeUser) {
        this.homeUser = homeUser;
    }

    public RaulUser getAwayUser() {
        return awayUser;
    }

    public void setAwayUser(RaulUser awayUser) {
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

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    @Override
    public String toString() {
        return this.homeTeam.getFullName() + " vs " + this.awayTeam.getFullName();
    }
}
