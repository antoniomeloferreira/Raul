package com.raulmvp.model;

public class Country {

    private String name;
    private Continent continent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent= continent;
    }
}
