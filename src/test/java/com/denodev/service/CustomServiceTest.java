package com.denodev.service;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.denodev.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class CustomServiceTest {

	@Before
	public void before() {
        System.out.println("Run before every test is running.");
	}
}
