package com.ve3yn4uk.spaceagencydatahub.service;

import com.ve3yn4uk.spaceagencydatahub.dao.IProductDAO;
import com.ve3yn4uk.spaceagencydatahub.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by 8e3Yn4uK on 24.04.2019
 */

@Service
public class ProductService implements IProductService {

    private IProductDAO productDAO;

    @Autowired
    public ProductService(IProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    @Transactional
    public void save(Product product) {

        productDAO.save(product);
    }

    @Override
    @Transactional
    public void deleteById(int id) {

        productDAO.deleteById(id);
    }

    @Override
    @Transactional
    public List<Product> findByMissionName(String missionName) {

        return productDAO.findByMissionName(missionName);
    }

    @Override
    @Transactional
    public List<Product> findByMissionImageryType(String imageryType) {
        return null;
    }

    @Override
    @Transactional
    public List<Product> findByProductAcquisitionDate(Date date, boolean b) {
        return null;
    }

    @Override
    @Transactional
    public List<Product> findByProductAcquisitionDate(Date date1, Date date2) {
        return null;
    }

    @Override
    public Product findById(int id) {
        return productDAO.findById(id);
    }
}
