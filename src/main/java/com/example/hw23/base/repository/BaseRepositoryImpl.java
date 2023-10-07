package com.example.hw23.base.repository;



import com.example.hw23.base.entity.BaseEntity;
import com.example.hw23.util.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transaction;
import java.util.List;

public abstract class BaseRepositoryImpl<E extends BaseEntity> implements BaseRepository<E>{
public abstract Class getClassName();
    EntityManager entityManager = Hibernate.getEntityManager();
    @Override
    public void save(E entity) {
        EntityTransaction transaction = null;
        EntityManager entityManager = null;
        try {
            entityManager = Hibernate.getEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
    }
   /* @Override
    public void deleteById(long id); {
        EntityTransaction transaction = null;
        try {
            EntityManager entityManager = Hibernate.getEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.remove(entity);
            //entityManager.createQuery("delete from "+getClassName().getSimpleName()+" where id=:x").setParameter("x",entity.getId()).executeUpdate();
                        transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
    }*/

    @Override
    public void delete(E t) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(t);
        transaction.commit();
//        entityManager.remove(t.getId());
    }

    @Override
    public void deleteById(long id){
        try {
            this.delete(loadById(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public E loadById(long id) {
        EntityManager entityManager= Hibernate.getEntityManager();
        E e=(E)entityManager.find(getClassName(),id);
        return e;
    }

    @Override
    public void update(E entity) {
        EntityTransaction transaction = null;
        EntityManager entityManager = null;
        try {
            entityManager = Hibernate.getEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(entity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
    }

    @Override
    public List<E> loadAll() {
        EntityManager entityManager= Hibernate.getEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        List resultList = entityManager.createQuery("from " + getClassName().getSimpleName(),getClassName())
                .getResultList();
       /* for(int i=0;i< resultList.size();i++){
            System.out.println(resultList.get(i));
        }*/
//        System.out.println(resultList);
        return resultList;
    }

}
