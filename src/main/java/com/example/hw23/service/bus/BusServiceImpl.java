package com.example.hw23.service.bus;

import com.example.hw23.base.service.BaseServiceImpl;
import com.example.hw23.entity.Bus;
import com.example.hw23.repository.bus.BusRepositoryImpl;

public class BusServiceImpl extends BaseServiceImpl<Bus, BusRepositoryImpl>implements BusService {
    BusRepositoryImpl repository1;
    public BusServiceImpl(BusRepositoryImpl repository) {
        super(repository);
        repository1=repository;
    }


}
