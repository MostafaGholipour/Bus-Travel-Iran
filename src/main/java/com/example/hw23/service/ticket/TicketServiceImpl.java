package com.example.hw23.service.ticket;

import com.example.hw23.base.service.BaseServiceImpl;
import com.example.hw23.entity.Ticket;
import com.example.hw23.repository.ticket.TicketRepositoryImpl;

public class TicketServiceImpl extends BaseServiceImpl<Ticket, TicketRepositoryImpl> implements TicketService {
    TicketRepositoryImpl repository1;
    public TicketServiceImpl(TicketRepositoryImpl repository) {
        super(repository);
        repository1= repository;
    }
}
