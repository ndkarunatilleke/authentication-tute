package com.nipuna.rentcloud.profileservice.services;

import com.nipuna.rentcloud.commons.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);
    List<Customer> fetchAllCustomers();
}
