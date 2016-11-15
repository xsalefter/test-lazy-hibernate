package com.denodev.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.denodev.MyApplication;
import com.denodev.model.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CompanyService companyService;

	@Before
	public void before() throws ParseException {
        this.companyService.init();
	}

    @Test
    public void employeeService_findEmployeesByCompanyId() {
        this.employeeService.findByCompanyIdUsingQuery(42);
    }

    @Test
    public void employeService_findByBirthDate() throws ParseException {
        System.out.println("===== employeService_findByBirthDate =====");
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Employee> result = this.employeeService.findByBirthDate(dateFormat.parse("1970-01-01 17:05:05"));

        Assert.assertEquals(3, result.size());
    }
}
