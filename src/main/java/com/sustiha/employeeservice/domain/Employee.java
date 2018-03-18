package com.sustiha.employeeservice.domain;

import java.time.LocalDateTime;

/**
 * Created by sustihashreesampath on 2/26/18.
 */
public class Employee {

    private String id;
    private String firstName;
    private String lastName;
    private Address address;
    private String phoneNumber;
    private String email;
    private LocalDateTime dateOfBirth;


    public Employee(String id, String firstName, String lastName, Address address, String phoneNumber, String email, LocalDateTime dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }
}
