package com.ve3yn4uk.spaceagencydatahub.dao;

import com.ve3yn4uk.spaceagencydatahub.entity.Product;


/**
 * Created by 8e3Yn4uK on 24.04.2019
 */

public interface IProductDAO {

    /**
     * add/(edit) product (if using saveOrUpdate() in implementation
     */
    public void save(Product product);

    /**
     * romove product by id
     */
    public void deleteById(int id);

    /**
     * get product by id (in our case for validation)
     */
    public Product findById(int id);
}
