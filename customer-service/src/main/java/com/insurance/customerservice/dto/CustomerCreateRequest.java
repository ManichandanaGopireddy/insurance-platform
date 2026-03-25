package com.insurance.customerservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(description = "Request payload for creating a customer")
public class CustomerCreateRequest {

    @NotBlank(message = "First name is required")
    @Schema(example = "Sai")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Schema(example = "Reddy")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Schema(example = "sai@example.com")
    private String email;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
    @Schema(example = "9876543210")
    private String phoneNumber;

    @NotBlank(message = "Address line is required")
    @Schema(example = "123 Main Street")
    private String addressLine1;

    @NotBlank(message = "City is required")
    @Schema(example = "Atlanta")
    private String city;

    @NotBlank(message = "State is required")
    @Schema(example = "GA")
    private String state;

    @NotBlank(message = "Zip code is required")
    @Schema(example = "30022")
    private String zipCode;
}