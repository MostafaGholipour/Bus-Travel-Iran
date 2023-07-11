package com.example.hw23.repository.customer;

import com.example.hw23.base.repository.BaseRepository;
import com.example.hw23.entity.Customer;

public interface CustomerRepository extends BaseRepository<Customer> {
     Customer Login(String username, String password);
}
