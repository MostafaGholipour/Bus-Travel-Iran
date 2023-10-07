package com.example.BusTravelIran.repository.customer;

import com.example.BusTravelIran.base.repository.BaseRepositoryImpl;
import com.example.BusTravelIran.entity.Customer;
import com.example.BusTravelIran.util.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CustomerRepositoryImpl extends BaseRepositoryImpl<Customer> implements CustomerRepository {
    @Override
    public Class getClassName() {
        return Customer.class;
    }

    @Override
    public Customer Login(String username, String password) {
        EntityManager entityManager = Hibernate.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        String jql = "SELECT m from Customer m where m.username=:S ";
        Customer customer = null;
        customer = entityManager.createQuery(jql, Customer.class).setParameter("S", username).getSingleResult();
        return customer;

    }
}
