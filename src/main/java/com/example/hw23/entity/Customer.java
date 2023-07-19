package com.example.hw23.entity;

import com.example.hw23.base.entity.Person;
import com.example.hw23.repository.ticket.TicketRepositoryImpl;
import com.example.hw23.service.ticket.TicketService;
import com.example.hw23.service.ticket.TicketServiceImpl;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@Entity
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer extends Person {
    String username;
    String password;
    @OneToMany(mappedBy = "customer" , cascade = CascadeType.ALL)
    List<Ticket> tickets =new ArrayList<>();

//    public void enterTicket(Bus bus){
//        Ticket ticket =new Ticket();
//        ticket.setCustomer(this);
//        ticket.setBus(bus);
//        TicketServiceImpl ticketService= new TicketServiceImpl(new TicketRepositoryImpl());
//        ticketService.save(ticket);
//    }
    @Override
    public String toString() {
        return "Customer{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", tickets=" + tickets +
                '}';
    }
}
