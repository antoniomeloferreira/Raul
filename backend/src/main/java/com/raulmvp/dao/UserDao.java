package com.raulmvp.dao;

import com.raulmvp.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends AbstractDao {

    public UserEntity saveUser(UserEntity user) {

        if(findUserByUserName(user.getUserName()) == null) {
            em.persist(user);
        } else {
            return null;
        }

        return user;
    }

    public UserEntity findUserByUserName(String userName) {

        if(userName == null ||  !(userName.length() > 0) ) {
            return null;
        }

        return em.find(UserEntity.class, userName);
    }

    public void deleteUserByUserName(String id) {
        UserEntity user = findUserByUserName(id);
        em.remove(user);
    }
}
