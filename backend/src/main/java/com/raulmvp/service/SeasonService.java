package com.raulmvp.service;

import com.raulmvp.dao.SeasonDao;
import com.raulmvp.entity.SeasonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeasonService {

    @Autowired
    SeasonDao seasonDao;

    public SeasonEntity getSeasonById(Integer aId) {
        return seasonDao.getSeasonById(aId);
    }
}
