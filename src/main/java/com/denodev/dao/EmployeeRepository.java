package com.denodev.dao;

import com.denodev.model.Employee;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author Arnaud DENOYELLE
 *
 *         Le 07 nov. 2016
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

  @EntityGraph(value = "employeeOnly", type = EntityGraph.EntityGraphType.FETCH)
  List<Employee> findByCompanyId(Integer companyId);

  @Query("from Employee e where e.company.id = :companyId")
  List<Employee> findByCompanyIdUsingQuery(@Param("companyId") Integer companyId);
}
