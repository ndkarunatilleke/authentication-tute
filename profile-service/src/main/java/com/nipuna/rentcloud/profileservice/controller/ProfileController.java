package com.nipuna.rentcloud.profileservice.controller;

import com.nipuna.rentcloud.commons.model.Customer;
import com.nipuna.rentcloud.profileservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    private CustomerService customerService;

    @Autowired
    public ProfileController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(value = "/profile")
    @PreAuthorize("hasAuthority('create_profile')")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping(value = "/fetchProfiles")
    @PreAuthorize("hasRole('ROLE_operator')")
    public List<Customer> fetchCustomer(){
        return customerService.fetchAllCustomers();
    }
}
