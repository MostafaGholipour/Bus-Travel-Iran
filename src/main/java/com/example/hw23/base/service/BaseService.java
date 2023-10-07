package com.example.hw23.base.service;



import com.example.hw23.base.entity.BaseEntity;

import java.util.List;

public interface BaseService<E extends BaseEntity> {
    void delete(E t);
    void save(E entity);
    void update(E entity);
    E loadById(long id);
    void deleteById(long id);
    List<E> LoadAll();
}
