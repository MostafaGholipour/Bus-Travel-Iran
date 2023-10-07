package com.example.hw23.entity;

import com.example.hw23.base.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bus extends BaseEntity {
    int Capacity;
    @ManyToOne(cascade = CascadeType.ALL)
    Driver driver;
    String origin;
    String title;
    String destination;
    LocalDate dateMove;
    LocalTime timeMove;
    @OneToMany(mappedBy = "bus", cascade = CascadeType.ALL)
    List<Ticket> ticketList = new ArrayList<>();

    public void setTimeMove(String timeMove) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        try {
            this.timeMove = LocalTime.parse(timeMove, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid input for time.");
        }
    }

    public void setDateMove(String dateMove) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            this.dateMove= LocalDate.parse(dateMove, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid input for date.");
        }

    }

    @Override
    public String toString() {
        return "Bus{" +
                "Capacity=" + Capacity +
                ", driver=" + driver +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", dateMove=" + dateMove +
                ", timeMove=" + timeMove +
                ", ticketList=" + ticketList +
                '}';
    }
}
