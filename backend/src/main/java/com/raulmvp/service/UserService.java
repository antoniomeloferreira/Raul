package com.raulmvp.service;

import com.raulmvp.dao.UserDao;
import com.raulmvp.entity.UserEntity;
import com.raulmvp.model.RaulUser;
import com.raulmvp.model.dto.RaulUserDto;
import com.raulmvp.model.dto.RaulUserLoginData;
import com.raulmvp.model.dto.RaulUserRegisterData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UniverseService universeService;

    public RaulUserDto login(RaulUserLoginData aLoginData) {

        RaulUserDto raulUserDto = null;
        UserEntity persistedUser = getUserByUsername(aLoginData.getUsername());

        if (persistedUser == null) {
            return raulUserDto;
        }

        if (persistedUser.getPasswordHash().equals(aLoginData.getPassword())) {

            raulUserDto = new RaulUserDto();

            raulUserDto.setUsername(persistedUser.getUserName());
            raulUserDto.setName(persistedUser.getName());
            raulUserDto.setUniverseArr(universeService.getUniverseListByUsername(aLoginData.getUsername()));
        }

        return raulUserDto;
    }

    public UserEntity getUserByUsername(String username) {
        return userDao.findUserByUserName(username);
    }

    public UserEntity createUser(RaulUserRegisterData registerData) {

        UserEntity persistedUser = getUserByUsername(registerData.getUsername());

        if (persistedUser != null) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setName(registerData.getName());
        userEntity.setPasswordHash(registerData.getPassword());
        userEntity.setUserName(registerData.getUsername());

        userEntity.setSalt("risos");

        return userDao.saveUser(userEntity);
    }
}
