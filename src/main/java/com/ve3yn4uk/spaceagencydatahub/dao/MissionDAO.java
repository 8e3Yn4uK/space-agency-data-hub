package com.ve3yn4uk.spaceagencydatahub.dao;

import com.ve3yn4uk.spaceagencydatahub.entity.Mission;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

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

    @Override
    @Transactional
    public List<Mission> findAll() {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Mission> myQuery = currentSession.createQuery("from Mission", Mission.class);
        List<Mission> missions = myQuery.getResultList();

        return missions;
    }
}
