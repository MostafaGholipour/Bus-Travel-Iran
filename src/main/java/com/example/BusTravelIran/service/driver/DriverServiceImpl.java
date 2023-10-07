package com.example.BusTravelIran.service.driver;

import com.example.BusTravelIran.base.service.BaseServiceImpl;
import com.example.BusTravelIran.entity.Driver;
import com.example.BusTravelIran.repository.driver.DriverRepositoryImpl;

public class DriverServiceImpl extends BaseServiceImpl<Driver, DriverRepositoryImpl> implements DriverService {
    DriverRepositoryImpl repository1;
    public DriverServiceImpl(DriverRepositoryImpl repository) {
        super(repository);
        repository1=repository;
    }
}
