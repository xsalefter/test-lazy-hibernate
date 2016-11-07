package com.denodev;

import com.denodev.service.CompanyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Arnaud DENOYELLE
 *
 *         Le 07 nov. 2016
 */
@SpringBootApplication
public class MyApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(MyApplication.class);
    context.getBean(CompanyService.class).init();
  }

}
