package com.insurance.customerservice.proxy;

import com.insurance.customerservice.entity.Customer;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class InMemoryCustomerDbProxy implements CustomerDbProxy {

    private final Map<String, Customer> customerStore = new ConcurrentHashMap<>();

    @Override
    public Customer save(Customer customer) {
        customerStore.put(customer.getCustomerId(), customer);
        return customer;
    }

    @Override
    public Optional<Customer> findByEmail(String email) {
        return customerStore.values()
                .stream()
                .filter(customer -> customer.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }
}