package com.homeworks.twotableswithhibernate.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DefaultRepository implements DBRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<String> getProductName(String name) {

        List<?> list = entityManager.createQuery("SELECT order.productName from Order order where order.customer.name = ?1")
                .setParameter(1, name)
                .getResultList();
        List<String> out = new ArrayList<>();
        list.forEach(order -> out.add(order.toString()));
        return out;
    }

}
