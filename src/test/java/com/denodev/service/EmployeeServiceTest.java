package com.denodev.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.denodev.MyApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CompanyService companyService;

	@Before
	public void before() {
        System.out.println("Run before every test is running.");
        this.companyService.init();
	}

    @Test
    public void employeeService_findEmployeesByCompanyId() {
    	System.out.println("=== Run EmployeeService#findEmployeesByCompanyId() start");
        this.employeeService.findByCompanyIdUsingQuery(42);
        System.out.println("=== Run EmployeeService#findEmployeesByCompanyId() end");
    }
}
