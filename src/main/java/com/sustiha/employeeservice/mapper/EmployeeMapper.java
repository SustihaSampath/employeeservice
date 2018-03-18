package com.sustiha.employeeservice.mapper;

import com.sustiha.employeeservice.domain.Employee;
import com.sustiha.employeeservice.view.EmployeeView;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sustihashreesampath on 3/4/18.
 */
public class EmployeeMapper {

    @Autowired
    private AddressMapper addressMapper;


    public EmployeeView mapDomainToEmployeeView(Employee employee)
    {
        EmployeeView employeeView = new EmployeeView();
        employeeView.setAddress(addressMapper.mapDomainToAddressView(employee.getAddress()));
        employeeView.setId(employee.getId());
        employeeView.setFirstName(employee.getFirstName());
        employeeView.setLastName(employee.getLastName());
        employeeView.setDateOfBirth(employee.getDateOfBirth());
        employeeView.setEmail(employee.getEmail());
        employeeView.setPhoneNumber(employee.getPhoneNumber());
        return employeeView;
    }
}
