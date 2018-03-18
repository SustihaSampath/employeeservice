package com.sustiha.employeeservice.configuration;

import com.sustiha.employeeservice.mapper.AddressMapper;
import com.sustiha.employeeservice.service.GetEmployeeService;
import com.sustiha.employeeservice.service.impl.GetEmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sustihashreesampath on 3/4/18.
 */

@Configuration
public class EmployeeServiceConfiguration {

    @Bean
    public GetEmployeeService getEmployeeService(){
        return new GetEmployeeServiceImpl();
    }


}
