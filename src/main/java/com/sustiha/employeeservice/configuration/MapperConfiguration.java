package com.sustiha.employeeservice.configuration;

import com.sustiha.employeeservice.mapper.AddressMapper;
import com.sustiha.employeeservice.mapper.EmployeeMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sustihashreesampath on 3/4/18.
 */

@Configuration
public class MapperConfiguration {


    @Bean
    public AddressMapper getAddressMapper()
    {
        return new AddressMapper();
    }

    @Bean
    public EmployeeMapper getEmployeeMapper()
    {
        return new EmployeeMapper();
    }

}
