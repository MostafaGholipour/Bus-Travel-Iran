package com.example.BusTravelIran.repository.bus;

import com.example.BusTravelIran.base.repository.BaseRepositoryImpl;
import com.example.BusTravelIran.entity.Bus;
import com.example.BusTravelIran.util.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.time.LocalDate;
import java.util.List;

public class BusRepositoryImpl extends BaseRepositoryImpl<Bus>implements BusRepository {

    @Override
    public Class getClassName() {
        return Bus.class;
    }

    @Override
    public List<Bus> SearchBus(LocalDate dateMove,String origin) {
        EntityManager  entityManager = Hibernate.getEntityManager();
        EntityTransaction transaction =entityManager.getTransaction();
        transaction.begin();
        String jpl="select m from Bus m where m.dateMove=:B and m.origin=:A";
        List<Bus> resultList = entityManager.createQuery(jpl, Bus.class).setParameter("B", dateMove).setParameter("A",origin).getResultList();
        return resultList;
    }
}
