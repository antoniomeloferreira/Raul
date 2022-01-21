package com.raulmvp.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "universeuser")
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
