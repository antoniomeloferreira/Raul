package com.raulmvp.entity;

import javax.persistence.*;

@Entity
@Table(name = "Universe")
@NamedQueries({
        @NamedQuery(name = "UniverseEntity.getByUsername", query = "SELECT u FROM UniverseEntity u LEFT JOIN UniverseUserEntity uu WITH u.id = uu.universeId WHERE uu.username=:username"),
        @NamedQuery(name = "UniverseEntity.getByName", query = "SELECT u FROM UniverseEntity u WHERE u.name=:name")
})

public class UniverseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
