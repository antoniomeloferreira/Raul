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

    public UniverseEntity createUniverse(String name) {

        if(getUniverseByName(name) != null) {
            return null;
        }

        UniverseEntity universeEntity = new UniverseEntity();
        universeEntity.setName(name);

        return universeDao.createUniverse(universeEntity);
    }

    public List<UniverseEntity> getUniverseListByUsername(String username) {
        return universeDao.getUniverseListByUsername(username);
    }

    public UniverseEntity getUniverseByName(String name) {
        return universeDao.getUniverseByName(name);
    }

    public UniverseEntity getUniverseById(Integer id) {

        if (id == null) {
            return null;
        }

        return universeDao.getUniverseById(id);
    }
    public void deleteUniverse(String name) {
        universeDao.deleteUniverse(name);
    }

}
