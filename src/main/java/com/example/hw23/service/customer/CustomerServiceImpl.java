package com.example.hw23.service.customer;

import com.example.hw23.base.service.BaseServiceImpl;
import com.example.hw23.entity.Customer;
import com.example.hw23.repository.customer.CustomerRepositoryImpl;

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
