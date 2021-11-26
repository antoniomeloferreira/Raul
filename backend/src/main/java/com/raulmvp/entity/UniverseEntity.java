package com.raulmvp.entity;

import javax.persistence.*;

@Entity
@Table(name = "Universe")
@NamedQueries({
        @NamedQuery(name = "UniverseEntity.findByUsername", query = "SELECT u FROM UniverseEntity u LEFT JOIN UniverseUserEntity uu WITH u.id = uu.universeId WHERE uu.username=:username"),

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
