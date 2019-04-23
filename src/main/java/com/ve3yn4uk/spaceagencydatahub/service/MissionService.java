package com.ve3yn4uk.spaceagencydatahub.service;

import com.ve3yn4uk.spaceagencydatahub.dao.IMissionDAO;
import com.ve3yn4uk.spaceagencydatahub.entity.Mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 23.04.2019
 */

@Service
public class MissionService implements IMissionService {

    private IMissionDAO missionDAO;

    @Autowired
    public MissionService(IMissionDAO missionDAO) {
        this.missionDAO = missionDAO;
    }

    @Override
    @Transactional
    public void save(Mission mission) {

        missionDAO.save(mission);
    }

    @Override
    @Transactional
    public void deleteById(int id) {

        missionDAO.deleteById(id);
    }

    @Override
    @Transactional
    public List<Mission> findAll() {

        return missionDAO.findAll();
    }
}
