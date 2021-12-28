package com.raulmvp.model.dto;

import com.raulmvp.entity.UniverseEntity;
import com.raulmvp.model.Universe;

import java.util.List;

public class RaulUserDto {

    private String username;
    private String name;
    private List<UniverseEntity> universeArr;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UniverseEntity> getUniverseArr() {
        return universeArr;
    }

    public void setUniverseArr(List<UniverseEntity> universeArr) {
        this.universeArr = universeArr;
    }
}
