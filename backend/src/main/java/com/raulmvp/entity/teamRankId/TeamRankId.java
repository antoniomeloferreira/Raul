package com.raulmvp.entity.teamRankId;

import java.io.Serializable;
import java.util.Objects;

public class TeamRankId implements Serializable {

    private Integer universeId;

    private String teamName;

    public TeamRankId() {
    }

    public TeamRankId(Integer universeId, String teamName) {
        this.universeId = universeId;
        this.teamName = teamName;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamRankId that = (TeamRankId) o;
        return Objects.equals(universeId, that.universeId) && Objects.equals(teamName, that.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(universeId, teamName);
    }
}
