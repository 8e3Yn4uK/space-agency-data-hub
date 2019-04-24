package com.ve3yn4uk.spaceagencydatahub.dao;

import com.ve3yn4uk.spaceagencydatahub.entity.Mission;
import com.ve3yn4uk.spaceagencydatahub.entity.Product;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;

/**
 * Created by 8e3Yn4uK on 24.04.2019
 */

@Repository
public class ProductDAO implements IProductDAO {

    private EntityManager entityManager;

    @Autowired
    public ProductDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Product product) {

        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(product);
    }

    @Override
    public void deleteById(int id) {

        Session currentSession = entityManager.unwrap(Session.class);
        Query myQuery = currentSession.createQuery("delete from Product where id=:productId");
        myQuery.setParameter("productId", id);
        myQuery.executeUpdate();
    }

    @Override
    public List<Product> findByMissionName(String missionName) {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Product> myQuery = currentSession.createQuery("from Product", Product.class);
        List<Product> products = myQuery.getResultList();

        return products;
    }

    @Override
    public List<Product> findByMissionImageryType(String imageryType) {
        return null;
    }

    @Override
    public List<Product> findByProductAcquisitionDate(Date date, boolean b) {
        return null;
    }

    @Override
    public List<Product> findByProductAcquisitionDate(Date date1, Date date2) {
        return null;
    }

    @Override
    public Product findById(int id) {

        Session currentSession = entityManager.unwrap(Session.class);
        Product product = currentSession.get(Product.class, id);

        return product;
    }
}
