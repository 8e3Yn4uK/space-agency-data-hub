package com.ve3yn4uk.spaceagencydatahub.dao;

import com.ve3yn4uk.spaceagencydatahub.entity.Mission;


/**
 * Created by 8e3Yn4uK on 23.04.2019
 */

public interface IMissionDAO {

    /**
     * add/(edit) mission (if using saveOrUpdate() in implementation
     */
    public void save(Mission mission);

    /**
     * romove mission by id
     */
    public void deleteById(int id);

    /**
     * get mission by id (in our case for validation)
     */
    public Mission findById(int id);

}
