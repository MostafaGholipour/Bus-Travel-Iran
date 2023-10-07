package com.example.BusTravelIran.service.customer;

import com.example.BusTravelIran.base.service.BaseServiceImpl;
import com.example.BusTravelIran.entity.Customer;
import com.example.BusTravelIran.repository.customer.CustomerRepositoryImpl;

public class CustomerServiceImpl extends BaseServiceImpl<Customer, CustomerRepositoryImpl> implements CustomerService {
    CustomerRepositoryImpl repository1;

    public CustomerServiceImpl(CustomerRepositoryImpl repository) {
        super(repository);
        repository1 = repository;
    }

    @Override
    public Customer Login(String username, String password) {
        Customer customer = repository1.Login(username, password);
        if (customer.getPassword()!=null) {
            if (customer.getPassword().equals(password)) {
            System.out.println("Welcome----------" + customer.getName());
                return customer;
            } else {
            System.out.println("NOt Found !");
                return null;
            }
        } else {
            System.out.println("NOt Found !");
            return null;
        }
    }
}
