package com.example.BusTravelIran.service.customer;

import com.example.BusTravelIran.base.service.BaseService;
import com.example.BusTravelIran.entity.Customer;

public interface CustomerService extends BaseService<Customer> {
    Customer Login(String username, String password);
}
