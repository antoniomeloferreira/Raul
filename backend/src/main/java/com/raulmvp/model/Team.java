package com.raulmvp.model;

public class Team {

    private String fullName;
    private String initials;
    private Country country;
    private boolean isNationalTeam;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public boolean isNationalTeam() {
        return isNationalTeam;
    }

    public void setNationalTeam(boolean nationalTeam) {
        isNationalTeam = nationalTeam;
    }
}
