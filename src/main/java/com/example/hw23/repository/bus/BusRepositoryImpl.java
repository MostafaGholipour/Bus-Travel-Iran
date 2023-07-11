package com.example.hw23.repository.bus;

import com.example.hw23.base.repository.BaseRepositoryImpl;
import com.example.hw23.entity.Bus;

public class BusRepositoryImpl extends BaseRepositoryImpl<Bus>implements BusRepository {

    @Override
    public Class getClassName() {
        return Bus.class;
    }
}
