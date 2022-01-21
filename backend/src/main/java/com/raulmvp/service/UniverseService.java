package com.raulmvp.service;

import com.raulmvp.dao.UniverseDao;
import com.raulmvp.entity.UniverseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniverseService {

    @Autowired
    UniverseDao universeDao;

    public UniverseEntity createUniverse(String aName) {

        if(getUniverseByName(aName) != null) {
            return null;
        }

        UniverseEntity universeEntity = new UniverseEntity();
        universeEntity.setName(aName);

        return universeDao.createUniverse(universeEntity);
    }

    public List<UniverseEntity> getUniverseListByUsername(String aUsername) {
        return universeDao.getUniverseListByUsername(aUsername);
    }

    public UniverseEntity getUniverseByName(String aName) {
        return universeDao.getUniverseByName(aName);
    }

    public UniverseEntity getUniverseById(Integer aId) {

        if (aId == null) {
            return null;
        }

        return universeDao.getUniverseById(aId);
    }
    public Boolean deleteUniverse(String aName) {
        return universeDao.deleteUniverse(aName);
    }

}
