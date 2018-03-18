package com.sustiha.employeeservice.domain;

import java.time.LocalDateTime;

/**
 * Created by sustihashreesampath on 2/26/18.
 */
public class EmployeeBuilder {

    private String id;
    private String firstName;
    private String lastName;
    private Address address;
    private String phoneNumber;
    private String email;
    private LocalDateTime dateOfBirth;

    public EmployeeBuilder(String id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }


    public EmployeeBuilder setLastName(String lastName) {

        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder setAddress(Address address) {
        this.address = address;
        return this;
    }

    public EmployeeBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public EmployeeBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public EmployeeBuilder setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public Employee build()
    {
        return new Employee(id,firstName,lastName,address,phoneNumber,email,dateOfBirth);
    }

}
