package com.denodev.controller;

import com.denodev.model.Employee;
import com.denodev.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Arnaud DENOYELLE
 *
 *         Le 07 nov. 2016
 */
@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
  public Iterable<Employee> findAll() {
    return employeeService.findAll();
  }

  @RequestMapping(value = {"/", ""}, method = RequestMethod.PUT)
  public Employee save(@RequestBody Employee employee) {
    return employeeService.save(employee);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void delete(@PathVariable Integer id) {
    employeeService.delete(id);
  }

  @RequestMapping(value = "/by-company/{id}")
  public void loadByCompanyId(@PathVariable Integer id) {
    employeeService.loadByCompanyId(id);
  }
}
