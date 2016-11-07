package com.denodev.dao;

import com.denodev.model.Employee;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Arnaud DENOYELLE
 *
 *         Le 07 nov. 2016
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

  @EntityGraph(value = "employeeOnly", type = EntityGraph.EntityGraphType.FETCH)
  List<Employee> findByCompanyId(Integer companyId);

}
