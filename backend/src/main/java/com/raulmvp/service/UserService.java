package com.raulmvp.service;

import com.raulmvp.dao.UserDao;
import com.raulmvp.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserEntity getUserByName(String userName) {
        return userDao.findUserByUserName(userName);
    }

    public void createUser(UserEntity userEntity) {
        System.out.println("SERVICE : Get user name" + userEntity.getUserName());
        userDao.saveUser(userEntity);
    }
}
