package com.denodev.service;

import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.denodev.MyApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class CustomServiceTest {

    @Autowired
    private CustomService customService;

    @Autowired
    private CompanyService companyService;

	@Before
	public void before() throws ParseException {
        System.out.println("Run before every test is running.");
        this.companyService.init();
	}

    @Test
    public void customService_findEmployeesByCompanyId() {
        System.out.println("=== Run CustomService#findEmployeesByCompanyId() start");
        this.customService.findEmployeesByCompanyId(42);
        System.out.println("=== Run CustomService#findEmployeesByCompanyId() end");
    }

}
