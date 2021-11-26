package com.raulmvp.entity;

import javax.persistence.*;

@Entity
@Table(name = "Universe")
@NamedQueries({
        @NamedQuery(name = "UniverseEntity.findById", query = "SELECT u FROM UniverseEntity u WHERE u.id=:id"),

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
