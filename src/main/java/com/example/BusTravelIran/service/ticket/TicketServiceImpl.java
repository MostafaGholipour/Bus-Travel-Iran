package com.example.BusTravelIran.service.ticket;

import com.example.BusTravelIran.base.service.BaseServiceImpl;
import com.example.BusTravelIran.entity.Ticket;
import com.example.BusTravelIran.repository.ticket.TicketRepositoryImpl;

public class TicketServiceImpl extends BaseServiceImpl<Ticket, TicketRepositoryImpl> implements TicketService {
    TicketRepositoryImpl repository1;
    public TicketServiceImpl(TicketRepositoryImpl repository) {
        super(repository);
        repository1= repository;
    }
}
