package com.raulmvp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TeamRank")
public class TeamRankEntity {

    @Id
    @Column(name = "universe_id")
    private Integer universeId;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "ranking")
    private Integer ranking;

    @Column(name = "is_default")
    private Boolean isDefault;

    public Integer getUniverseId() {
        return universeId;
    }

    public void setUniverseId(Integer universeId) {
        this.universeId = universeId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
