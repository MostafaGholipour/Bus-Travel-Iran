package com.example.hw23.service.bus;

import com.example.hw23.base.service.BaseService;
import com.example.hw23.entity.Bus;

import java.time.LocalDate;
import java.util.List;

public interface BusService extends BaseService<Bus> {
    List<Bus> SearchBus(String origin, String destination, LocalDate dateMove);
}
