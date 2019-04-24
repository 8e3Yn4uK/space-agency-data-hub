package com.ve3yn4uk.spaceagencydatahub.service;

import com.ve3yn4uk.spaceagencydatahub.entity.Product;


/**
 * Created by 8e3Yn4uK on 24.04.2019
 */

public interface IProductService {

    public void save(Product product);

    public void deleteById(int id);

    public Product findById(int id);
}
