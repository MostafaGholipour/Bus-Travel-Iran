package com.example.hw23.repository.driver;

import com.example.hw23.base.repository.BaseRepositoryImpl;
import com.example.hw23.entity.Driver;

public class DriverRepositoryImpl extends BaseRepositoryImpl<Driver> implements DriverRepository {
    @Override
    public Class getClassName() {
        return Driver.class;
    }
}
