package com.raulmvp.dao;

import com.raulmvp.entity.UserEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.UnexpectedRollbackException;

@Repository
public class UserDao extends AbstractDao {

    public UserEntity saveUser(UserEntity aUser) {

        if(findUserByUserName(aUser.getUserName()) != null) {
            return null;
        }

        em.persist(aUser);

        return aUser;
    }

    public UserEntity findUserByUserName(String aUsername) {

        if(aUsername == null || (aUsername.length() < 1) ) {
            return null;
        }

        return em.find(UserEntity.class, aUsername);
    }

    public Boolean deleteUserByUserName(String username) {

        Boolean isDeleted = Boolean.FALSE;
        UserEntity user = findUserByUserName(username);

        if (user == null) {
            return isDeleted;
        }

        try {
            em.remove(user);
            isDeleted = Boolean.TRUE;
        } catch (IllegalArgumentException e) {
            System.out.println("UserDao - Delete: " + e);
        }

        return isDeleted;
    }
}
