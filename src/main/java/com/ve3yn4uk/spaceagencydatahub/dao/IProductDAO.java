package com.ve3yn4uk.spaceagencydatahub.dao;

import com.ve3yn4uk.spaceagencydatahub.entity.Product;


/**
 * Created by 8e3Yn4uK on 24.04.2019
 */

public interface IProductDAO {

    public void save(Product product);

    public void deleteById(int id);

    public Product findById(int id);
}
