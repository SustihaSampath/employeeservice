package com.sustiha.employeeservice.service;

import com.sustiha.employeeservice.domain.Employee;
import com.sustiha.employeeservice.view.EmployeeView;

import java.util.List;

/**
 * Created by sustihashreesampath on 3/4/18.
 */
public interface GetEmployeeService {

    public EmployeeView getEmployee(String employeeId);

    public List<EmployeeView> getAllEmployee();

    public void createEmployee(Employee employee);

    public void createEmployeeList(List<Employee> employees);

    public void removeEmployee(Employee employee);

    public void removeEmployeeList(List<Employee> employees);
}
