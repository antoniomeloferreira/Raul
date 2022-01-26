package com.raulmvp.dao;

import com.raulmvp.entity.UniverseUserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class UniverseUserDao extends AbstractDao {

    private static final String PARAMETER_USERNAME = "username";


    public List<UniverseUserEntity> getUniverseUser(String username) {

        if(username == null || username.length() < 1) {
            return null;
        }

        Query q = em.createNamedQuery("UniverseUserEntity.getUniverseUser");
        q.setParameter(PARAMETER_USERNAME, username);


        return q.getResultList();
    }

}
