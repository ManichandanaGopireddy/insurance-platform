package com.insurance.customerservice.proxy;

import com.insurance.customerservice.entity.Customer;

import java.util.Optional;

public interface CustomerDbProxy {
    Customer save(Customer customer);
    Optional<Customer> findByEmail(String email);
}