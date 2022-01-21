package com.raulmvp.entity;

import com.raulmvp.entity.teamRankId.TeamRankId;
import com.raulmvp.model.Team;

import javax.persistence.*;

@Entity
@IdClass(TeamRankId.class)
@Table(name = "Teamrank")
@NamedQueries({@NamedQuery(name = "TeamRankEntity.getTeamRank", query = "SELECT t FROM TeamRankEntity t WHERE t.universeId=:universe_id AND t.teamName=:team_name"),
                @NamedQuery(name = "TeamRankEntity.getTeamRankByUniverseId", query = "SELECT t FROM TeamRankEntity t WHERE t.universeId=:universe_id")
                })
public class TeamRankEntity {

    @Id
    @Column(name = "universe_id")
    private Integer universeId;

    @Id
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
