package com.raulmvp.entity;

import javax.persistence.*;

@Entity
@Table(name = "game")
public class GameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "home_user")
    private String homeUser;

    @Column(name = "away_user")
    private String awayUser;

    @Column(name = "home_team")
    private String homeTeam;

    @Column(name = "away_team")
    private String awayTeam;

    @Column(name = "home_score")
    private int homeScore;

    @Column(name = "away_score")
    private int awayScore;

    @Column(name = "competition_id")
    private String competition;

    public int getId() {
        return id;
    }

    public String getHomeUser() {
        return homeUser;
    }

    public void setHomeUser(String homeUser) {
        this.homeUser = homeUser;
    }

    public String getAwayUser() {
        return awayUser;
    }

    public void setAwayUser(String awayUser) {
        this.awayUser = awayUser;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }
}

