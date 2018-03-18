package com.sustiha.employeeservice.service.impl;

import com.sustiha.employeeservice.domain.Address;
import com.sustiha.employeeservice.domain.Employee;
import com.sustiha.employeeservice.domain.EmployeeBuilder;
import com.sustiha.employeeservice.mapper.EmployeeMapper;
import com.sustiha.employeeservice.service.GetEmployeeService;
import com.sustiha.employeeservice.view.EmployeeView;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sustihashreesampath on 3/4/18.
 */
public class GetEmployeeServiceImpl implements GetEmployeeService {


    @Autowired
    private EmployeeMapper employeeMapper;

    public EmployeeView getEmployee(String employeeId) {

        Address address = new Address();
        Employee employee = new EmployeeBuilder(employeeId,"sustiha").
                                    setAddress(address).build();



        return employeeMapper.mapDomainToEmployeeView(employee);

    }

    public List<EmployeeView> getAllEmployee() {
        return null;
    }

    public void createEmployee(Employee employee) {

    }

    public void createEmployeeList(List<Employee> employees) {

    }

    public void removeEmployee(Employee employee) {

    }

    public void removeEmployeeList(List<Employee> employees) {

    }
}
