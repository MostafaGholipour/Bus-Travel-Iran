package com.example.BusTravelIran.repository.driver;

import com.example.BusTravelIran.base.repository.BaseRepositoryImpl;
import com.example.BusTravelIran.entity.Driver;

public class DriverRepositoryImpl extends BaseRepositoryImpl<Driver> implements DriverRepository {
    @Override
    public Class getClassName() {
        return Driver.class;
    }
}
