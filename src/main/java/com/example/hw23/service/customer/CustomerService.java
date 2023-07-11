package com.example.hw23.service.customer;

import com.example.hw23.base.service.BaseService;
import com.example.hw23.entity.Customer;

public interface CustomerService extends BaseService<Customer> {
    Customer Login(String username, String password);
}
