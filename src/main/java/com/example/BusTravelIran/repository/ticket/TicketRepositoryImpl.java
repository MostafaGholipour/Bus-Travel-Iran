package com.example.BusTravelIran.repository.ticket;

import com.example.BusTravelIran.base.repository.BaseRepositoryImpl;
import com.example.BusTravelIran.entity.Ticket;

public class TicketRepositoryImpl extends BaseRepositoryImpl<Ticket> implements TicketRepository {
    @Override
    public Class getClassName() {
        return Ticket.class;
    }
}
