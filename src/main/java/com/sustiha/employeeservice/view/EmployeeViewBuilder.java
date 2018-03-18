package com.sustiha.employeeservice.view;

import com.sustiha.employeeservice.domain.Address;
import com.sustiha.employeeservice.domain.Employee;

import java.time.LocalDateTime;

/**
 * Created by sustihashreesampath on 2/26/18.
 */
public class EmployeeViewBuilder {

    private String id;
    private String firstName;
    private String lastName;
    private Address address;
    private String phoneNumber;
    private String email;
    private LocalDateTime dateOfBirth;

    public EmployeeViewBuilder(String id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Employee build(EmployeeViewBuilder employeeBuilder)
    {
        return new Employee(id,firstName,lastName,address,phoneNumber,email,dateOfBirth);
    }

}
