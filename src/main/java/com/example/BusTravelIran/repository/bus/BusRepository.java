package com.example.BusTravelIran.repository.bus;

import com.example.BusTravelIran.base.repository.BaseRepository;
import com.example.BusTravelIran.entity.Bus;

import java.time.LocalDate;
import java.util.List;

public interface BusRepository extends BaseRepository<Bus> {
    List<Bus> SearchBus(LocalDate dateMove,String origin);
}
