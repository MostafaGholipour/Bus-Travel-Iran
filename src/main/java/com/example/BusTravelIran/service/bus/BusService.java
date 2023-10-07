package com.example.BusTravelIran.service.bus;

import com.example.BusTravelIran.base.service.BaseService;
import com.example.BusTravelIran.entity.Bus;

import java.time.LocalDate;
import java.util.List;

public interface BusService extends BaseService<Bus> {
    List<Bus> SearchBus(String origin, String destination, LocalDate dateMove);
}
