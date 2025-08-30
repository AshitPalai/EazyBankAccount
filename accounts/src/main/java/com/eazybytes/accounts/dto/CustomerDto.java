package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",description="Customer Schema"
)
public class CustomerDto {


    @Schema(description = "Customer Id",example="Abc")
    @NotEmpty(message = "Name should not be empty")
    @Size(min=2,max=20,message = "Name should be between 2 and 20 characters")
    private String name;


    @Schema(description = "email",example="abc.com")
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String email;


    @Schema(description = "Mobile Number",example="1234567890")
    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
