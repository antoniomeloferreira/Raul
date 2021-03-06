package com.raulmvp.entity;

import javax.persistence.*;

@Entity
@Table(name = "competition")
public class CompetitionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "edition")
    private Integer edition;

    @Column(name = "name")
    private String name;

    @Column(name = "is_over")
    private Boolean isOver;

    @Column(name = "winner_username")
    private String winnerUsername;

    @Column(name = "competition_config_id")
    private Integer competitionConfigId;

    @Column(name = "season_id")
    private Integer seasonId;

    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOver() {
        return isOver;
    }

    public void setOver(Boolean over) {
        isOver = over;
    }

    public String getWinnerUsername() {
        return winnerUsername;
    }

    public void setWinnerUsername(String winnerUsername) {
        this.winnerUsername = winnerUsername;
    }

    public Integer getCompetitionConfigId() {
        return competitionConfigId;
    }

    public void setCompetitionConfigId(Integer competitionConfigId) {
        this.competitionConfigId = competitionConfigId;
    }

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }
}
