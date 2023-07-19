package com.example.hw23.repository.bus;

import com.example.hw23.base.repository.BaseRepository;
import com.example.hw23.entity.Bus;

import java.time.LocalDate;
import java.util.List;

public interface BusRepository extends BaseRepository<Bus> {
    List<Bus> SearchBus(LocalDate dateMove,String origin);
}
