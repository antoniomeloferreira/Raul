package com.raulmvp.model;

public class Country {

    private String name;
    private Continent continentName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continentName;
    }

    public void setContinent(Continent continent) {
        this.continentName= continent;
    }
}
