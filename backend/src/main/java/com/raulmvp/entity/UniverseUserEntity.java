package com.raulmvp.entity;

import com.raulmvp.entity.teamRankId.UniverseUserId;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(UniverseUserId.class)
@Table(name = "universeuser")
@NamedQueries({
        @NamedQuery(name = "UniverseUserEntity.getUniverseUser", query = "SELECT u FROM UniverseUserEntity u WHERE u.username =: username ")
})
public class UniverseUserEntity implements Serializable {

    @Id
    @Column(name = "universe_id")
    private Integer universeId;

    @Id
    @Column(name = "username")
    private String username;

    public Integer getId() {
        return universeId;
    }

    public void setId(Integer id) {
        this.universeId = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
