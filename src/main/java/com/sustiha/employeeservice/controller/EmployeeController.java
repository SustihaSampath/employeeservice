package com.sustiha.employeeservice.controller;

import com.sustiha.employeeservice.service.GetEmployeeService;
import com.sustiha.employeeservice.view.EmployeeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sustihashreesampath on 2/26/18.
 */

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    private GetEmployeeService getEmployeeService;


    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public ResponseEntity getEmployee(@PathVariable("id") String employeeId) throws IllegalArgumentException
    {
        EmployeeView employee = getEmployeeService.getEmployee(employeeId);
        return new ResponseEntity(employee, HttpStatus.OK);
    }

   /* public List<EmployeeView> getAllEmployee()
    {

    }

    public void createEmployee(Employee employee)
    {

    }

    public void createEmployeeList(List<Employee> employees){

    }

    public void removeEmployee(Employee employee){

    }*/



}
