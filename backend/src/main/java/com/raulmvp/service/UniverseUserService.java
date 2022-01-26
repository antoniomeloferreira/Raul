package com.raulmvp.service;

import com.raulmvp.dao.UniverseUserDao;
import com.raulmvp.entity.UniverseUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniverseUserService {

    @Autowired
    UniverseUserDao universeUserDao;

    public List<UniverseUserEntity> getUniverseUser(UniverseUserEntity aUniverseUser) {
        return universeUserDao.getUniverseUser(aUniverseUser.getUsername());
    }
}
