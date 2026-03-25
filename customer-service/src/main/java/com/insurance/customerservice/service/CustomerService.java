package com.insurance.customerservice.service;

import com.insurance.customerservice.dto.CustomerCreateRequest;
import com.insurance.customerservice.dto.CustomerResponse;

public interface CustomerService {
    CustomerResponse createCustomer(CustomerCreateRequest request);
}