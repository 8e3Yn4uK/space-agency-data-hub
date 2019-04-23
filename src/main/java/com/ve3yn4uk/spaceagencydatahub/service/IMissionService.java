package com.ve3yn4uk.spaceagencydatahub.service;

import com.ve3yn4uk.spaceagencydatahub.entity.Mission;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 23.04.2019
 */

public interface IMissionService {

    public void save(Mission mission);

    public void deleteById(int id);

    public List<Mission> findAll();
}
