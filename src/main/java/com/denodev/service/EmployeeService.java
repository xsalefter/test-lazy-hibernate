package com.denodev.service;

import com.denodev.dao.EmployeeRepository;
import com.denodev.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Arnaud DENOYELLE
 *
 *         Le 07 nov. 2016
 */
@Service
@Transactional
public class EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;

  public Employee save(Employee employee) {
    return employeeRepository.save(employee);
  }

  public void delete(Integer employeeId) {
    employeeRepository.delete(employeeId);
  }

  public Iterable<Employee> findAll() {
    return employeeRepository.findAll();
  }

  public void loadByCompanyId(Integer companyId) {
    employeeRepository.findByCompanyId(companyId);
  }

  public void findByCompanyIdUsingQuery(Integer companyId) {
	employeeRepository.findByCompanyIdUsingQuery(companyId);
  }
}
