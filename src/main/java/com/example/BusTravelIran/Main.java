package com.example.BusTravelIran;

import com.example.BusTravelIran.entity.Bus;
import com.example.BusTravelIran.repository.bus.BusRepositoryImpl;
import com.example.BusTravelIran.repository.customer.CustomerRepositoryImpl;
import com.example.BusTravelIran.repository.driver.DriverRepositoryImpl;
import com.example.BusTravelIran.repository.ticket.TicketRepositoryImpl;
import com.example.BusTravelIran.service.bus.BusServiceImpl;
import com.example.BusTravelIran.service.customer.CustomerServiceImpl;
import com.example.BusTravelIran.service.driver.DriverServiceImpl;
import com.example.BusTravelIran.service.ticket.TicketServiceImpl;
import com.example.BusTravelIran.util.Hibernate;

import javax.persistence.EntityManager;

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
