package com.ve3yn4uk.spaceagencydatahub.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

/**
 * Created by 8e3Yn4uK on 23.04.2019
 */

@Repository
public class MissionDAO implements IMissionDAO {

    private EntityManager entityManager;

    @Autowired
    public MissionDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
