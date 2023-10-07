package com.example.BusTravelIran.base.repository;

import com.example.BusTravelIran.base.entity.BaseEntity;

import java.util.List;

public interface BaseRepository<E extends BaseEntity> {
    void save(E entity);

    void deleteById(long id);

    void delete(E t);

    E loadById(long id);

    void update(E entity);

    List<E> loadAll();
}
