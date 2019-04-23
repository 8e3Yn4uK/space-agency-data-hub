package com.ve3yn4uk.spaceagencydatahub.dao;

import com.ve3yn4uk.spaceagencydatahub.entity.Mission;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 23.04.2019
 */

public interface IMissionDAO {

    public void save(Mission mission);

    public void deleteById(int id);

    public List<Mission> findAll();

}
