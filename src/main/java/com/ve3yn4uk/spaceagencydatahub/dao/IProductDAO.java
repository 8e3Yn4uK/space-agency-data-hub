package com.ve3yn4uk.spaceagencydatahub.dao;

import com.ve3yn4uk.spaceagencydatahub.entity.Product;

import java.util.Date;
import java.util.List;

/**
 * Created by 8e3Yn4uK on 24.04.2019
 */

public interface IProductDAO {

    public void save(Product product);

    public void deleteById(int id);

    public List<Product> findByMissionName(String missionName);

    public List<Product> findByMissionImageryType(String imageryType);

    public List<Product> findByProductAcquisitionDate(Date date, boolean b);

    public List<Product> findByProductAcquisitionDate(Date date1, Date date2);

    public Product findById(int id);
}
