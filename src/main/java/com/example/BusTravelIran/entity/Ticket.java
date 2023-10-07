package com.example.BusTravelIran.entity;

import com.example.BusTravelIran.base.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Setter
@Getter
@Entity
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ticket extends BaseEntity {
    @ManyToOne
    Customer customer;
    String name;
    String gender;
    @ManyToOne
    Bus bus;

    @Override
    public String toString() {
        return "Ticket{" +
                "customer=" + customer.getId() +
                ", bus=" + bus.getId() +
                '}';
    }
}
