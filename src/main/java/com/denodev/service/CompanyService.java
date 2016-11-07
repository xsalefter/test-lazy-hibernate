package com.denodev.service;

import com.denodev.dao.CompanyRepository;
import com.denodev.dao.EmployeeRepository;
import com.denodev.model.Company;
import com.denodev.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Arnaud DENOYELLE
 *
 *         Le 07 nov. 2016
 */
@Service
public class CompanyService {

  @Autowired
  private CompanyRepository companyRepository;

  @Autowired
  private EmployeeRepository employeeRepository;

  public Company save(Company company) {
    return companyRepository.save(company);
  }

  public void delete(Integer companyId) {
    companyRepository.delete(companyId);
  }

  public Iterable<Company> findAll() {
    return companyRepository.findAll();
  }

  public void init() {
    Company companySun = companyRepository.save(new Company(42, "Sun microsystems"));
    Company companyGoogle = companyRepository.save(new Company(43, "Google"));

    employeeRepository.save(new Employee(101, "James", "Gosling", companySun));
    employeeRepository.save(new Employee(102, "Paul", "Sheridan", companySun));
    employeeRepository.save(new Employee(103, "Patrick", "Naughton", companySun));

    employeeRepository.save(new Employee(201, "Lary", "Page", companyGoogle));
    employeeRepository.save(new Employee(202, "Sergey", "Brin", companyGoogle));
  }
}
