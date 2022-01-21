package com.raulmvp.service;

import com.raulmvp.dao.AgeDao;
import com.raulmvp.entity.AgeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgeService {

    @Autowired
    private AgeDao ageDao;

    public AgeEntity getUniverseById(Integer aUniverseId) {
        return ageDao.getUniverseById(aUniverseId);
    }
}
