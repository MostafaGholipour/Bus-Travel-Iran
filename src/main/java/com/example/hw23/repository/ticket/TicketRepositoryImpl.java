package com.example.hw23.repository.ticket;

import com.example.hw23.base.repository.BaseRepositoryImpl;
import com.example.hw23.entity.Ticket;

public class TicketRepositoryImpl extends BaseRepositoryImpl<Ticket> implements TicketRepository {
    @Override
    public Class getClassName() {
        return Ticket.class;
    }
}
