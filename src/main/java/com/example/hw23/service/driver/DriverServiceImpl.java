package com.example.hw23.service.driver;

import com.example.hw23.base.service.BaseServiceImpl;
import com.example.hw23.entity.Driver;
import com.example.hw23.repository.driver.DriverRepositoryImpl;

public class DriverServiceImpl extends BaseServiceImpl<Driver, DriverRepositoryImpl> implements DriverService {
    DriverRepositoryImpl repository1;
    public DriverServiceImpl(DriverRepositoryImpl repository) {
        super(repository);
        repository1=repository;
    }
}
