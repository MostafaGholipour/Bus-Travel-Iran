package com.example.hw23.service.bus;

import com.example.hw23.base.service.BaseServiceImpl;
import com.example.hw23.entity.Bus;
import com.example.hw23.repository.bus.BusRepositoryImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BusServiceImpl extends BaseServiceImpl<Bus, BusRepositoryImpl> implements BusService {
    BusRepositoryImpl repository1;

    public BusServiceImpl(BusRepositoryImpl repository) {
        super(repository);
        repository1 = repository;
    }


    @Override
    public List<Bus> SearchBus(String origin, String destination, LocalDate dateMove) {
        List<Bus> buses = repository1.SearchBus(dateMove,origin);
        List<Bus> list = new ArrayList<>();
        for (Bus bus : buses) {
            if (bus.getDestination().equals(destination)) {
                list.add(bus);
            }
        }
        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
}
