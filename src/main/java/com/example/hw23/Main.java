package com.example.hw23;

import com.example.hw23.entity.Bus;
import com.example.hw23.entity.Customer;
import com.example.hw23.entity.Driver;
import com.example.hw23.entity.Ticket;
import com.example.hw23.repository.bus.BusRepositoryImpl;
import com.example.hw23.repository.customer.CustomerRepositoryImpl;
import com.example.hw23.repository.driver.DriverRepositoryImpl;
import com.example.hw23.repository.ticket.TicketRepositoryImpl;
import com.example.hw23.service.bus.BusServiceImpl;
import com.example.hw23.service.customer.CustomerServiceImpl;
import com.example.hw23.service.driver.DriverServiceImpl;
import com.example.hw23.service.ticket.TicketService;
import com.example.hw23.service.ticket.TicketServiceImpl;
import com.example.hw23.util.Application;
import com.example.hw23.util.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BusServiceImpl busService = new BusServiceImpl(new BusRepositoryImpl());
        TicketServiceImpl ticketService=new TicketServiceImpl(new TicketRepositoryImpl());
        CustomerServiceImpl customerService =new CustomerServiceImpl(new CustomerRepositoryImpl());
        DriverServiceImpl driverService=new DriverServiceImpl(new DriverRepositoryImpl());


//        Customer customer= new Customer();
//        customer.setUsername("A1");
//        customer.setPassword("A1");
//        customer.setName("Ali");
//        customer.setAge(null);
//        customer.setNationalCode(123456L);
//        customerService.save(customer);


//        Driver driver= new Driver();
//        driver.setName("Ali");
//        driver.setAge(null);
//        driver.setNationalCode(123456L);
//        driver.setDrivingLicenceCode(11316L);
//        driverService.save(driver);


//        Bus bus=new Bus();
//        bus.setCapacity(33);
//        bus.setTimeMove("12:10:01");
//        bus.setDateMove("1402-10-15");
//        bus.setDriver(driverService.loadById(1L));
//        bus.setOrigin("Tehran");
//        bus.setDestination("Rasht");
//        busService.save(bus);

//        System.out.println(customerService.loadById(2L));
//        LocalDate localDate = LocalDate.of(2023,07,07);
//        System.out.println(busService.SearchBus("Tehran", "Tabriz",localDate));
//        Customer customer = customerService.loadById(1L);
//        Bus bus = busService.loadById(1L);
//        Ticket ticket= new Ticket();
//        ticket.setName("Zahra");
//        ticket.setGender("12");
//        ticket.setCustomer(customer);
//        ticket.setBus(bus);
//        ticketService.save(ticket);
//        System.out.println(busService.loadById(customerService.loadById(1L).getTickets().get(1).getBus().getId()).getDateMove());
//        System.out.println(busService.loadById(2L));

//            Bus bus = busService.loadById(2L);
//            EntityManager entityManager= Hibernate.getEntityManager();
////            entityManager.remove(bus);
//        Ticket ticket = ticketService.loadById(1L);
//        ticketService.delete(ticket);



//        EntityManager entityManager= Hibernate.getEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        entityManager.createQuery("delete from Ticket where id=:x").setParameter("x",1L).executeUpdate();
//        transaction.commit();

        EntityManager entityManager = Hibernate.getEntityManager();
        Bus bus = busService.loadById(3L);
        entityManager.remove(new Bus());
//        busService.delete(bus);

    }
}
