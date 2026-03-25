package com.insurance.customerservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(description = "Response payload for customer details")
public class CustomerResponse {

    @Schema(example = "7fd1f8d0-1d0d-4d6c-a36b-a74ef5e6e7f1")
    private String customerId;

    @Schema(example = "Sai")
    private String firstName;

    @Schema(example = "Reddy")
    private String lastName;

    @Schema(example = "sai@example.com")
    private String email;

    @Schema(example = "9876543210")
    private String phoneNumber;

    @Schema(example = "123 Main Street")
    private String addressLine1;

    @Schema(example = "Atlanta")
    private String city;

    @Schema(example = "GA")
    private String state;

    @Schema(example = "30022")
    private String zipCode;
}