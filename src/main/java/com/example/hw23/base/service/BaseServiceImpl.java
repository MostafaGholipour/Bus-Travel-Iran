package com.example.hw23.base.service;

import com.example.hw23.base.entity.BaseEntity;
import com.example.hw23.base.repository.BaseRepositoryImpl;
import com.example.hw23.util.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class BaseServiceImpl <E extends BaseEntity,R extends BaseRepositoryImpl<E>> implements BaseService<E> {
    private final R repository;

    public BaseServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public void delete(E t) {
//        EntityManager entityManager= Hibernate.getEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
        repository.delete(t);
//        transaction.commit();
    }

    @Override
    public void save(E entity) {
        repository.save(entity);
    }

    @Override
    public void update(E entity) {
        repository.update(entity);
    }

    @Override
    public E loadById(long id) {
        return (E)repository.loadById(id);
    }


    @Override
    public void deleteById(long id) {
        EntityManager entityManager= Hibernate.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        repository.delete(loadById(id));
        transaction.commit();
    }

    @Override
    public List<E> LoadAll() {
        return repository.loadAll();
    }
}
