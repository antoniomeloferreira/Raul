package com.raulmvp.entity.teamRankId;

import java.io.Serializable;

public class UniverseUserId implements Serializable {

    private Integer universeId;

    private String username;

    public UniverseUserId() {
    }

    public UniverseUserId(Integer universeId, String username) {
        this.universeId = universeId;
        this.username = username;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
