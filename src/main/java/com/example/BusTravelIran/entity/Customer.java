package com.example.BusTravelIran.entity;

import com.example.BusTravelIran.base.entity.Person;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

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
