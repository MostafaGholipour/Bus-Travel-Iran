package com.example.BusTravelIran.repository.customer;

import com.example.BusTravelIran.base.repository.BaseRepository;
import com.example.BusTravelIran.entity.Customer;

public interface CustomerRepository extends BaseRepository<Customer> {
     Customer Login(String username, String password);
}
