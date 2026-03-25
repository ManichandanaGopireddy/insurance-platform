package com.insurance.customerservice.service;

import com.insurance.customerservice.dto.CustomerCreateRequest;
import com.insurance.customerservice.dto.CustomerResponse;
import com.insurance.customerservice.entity.Customer;
import com.insurance.customerservice.exception.DuplicateResourceException;
import com.insurance.customerservice.helper.CustomerMapper;
import com.insurance.customerservice.proxy.CustomerDbProxy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerDbProxy customerDbProxy;
    private final CustomerMapper customerMapper;

    @Override
    public CustomerResponse createCustomer(CustomerCreateRequest request) {
        customerDbProxy.findByEmail(request.getEmail()).ifPresent(existing -> {
            throw new DuplicateResourceException("Customer already exists with email: " + request.getEmail());
        });

        String customerId = UUID.randomUUID().toString();
        Customer customer = customerMapper.toEntity(request, customerId);
        Customer savedCustomer = customerDbProxy.save(customer);

        return customerMapper.toResponse(savedCustomer);
    }
}