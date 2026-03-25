package com.insurance.customerservice.helper;

import com.insurance.customerservice.dto.CustomerCreateRequest;
import com.insurance.customerservice.dto.CustomerResponse;
import com.insurance.customerservice.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public Customer toEntity(CustomerCreateRequest request, String customerId) {
        Customer customer = new Customer();
        customer.setCustomerId(customerId);
        customer.setFirstName(request.getFirstName());
        customer.setLastName(request.getLastName());
        customer.setEmail(request.getEmail());
        customer.setPhoneNumber(request.getPhoneNumber());
        customer.setAddressLine1(request.getAddressLine1());
        customer.setCity(request.getCity());
        customer.setState(request.getState());
        customer.setZipCode(request.getZipCode());
        return customer;
    }

    public CustomerResponse toResponse(Customer customer) {
        return new CustomerResponse(
                customer.getCustomerId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                customer.getPhoneNumber(),
                customer.getAddressLine1(),
                customer.getCity(),
                customer.getState(),
                customer.getZipCode()
        );
    }
}