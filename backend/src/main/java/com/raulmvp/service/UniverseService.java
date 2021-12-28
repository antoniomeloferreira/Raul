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

    public List<UniverseEntity> getUniverseListByUsername(String username) {
        return universeDao.getUniverseListByUsername(username);
    }
}
