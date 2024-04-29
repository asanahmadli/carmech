package com.zipcode.carmech.dao;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;

public class CarDAOImple implements CarDAO{

    private EntityManager entityManager;

    @Autowired
    public CarDAOImple(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Car> findAll() {
        //create query
        return null;
    }
}
