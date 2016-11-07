package com.denodev.model;

import javax.persistence.*;

/**
 * @author Arnaud DENOYELLE
 *
 *         Le 07 nov. 2016
 */
@Entity
@NamedEntityGraph(name = "employeeOnly")
public class Employee {

  @Id
  private Integer id;
  private String name;
  private String surname;
  @ManyToOne
  private Company company;

  public Employee() {
  }

  public Employee(Integer id, String name, String surname, Company company) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.company = company;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }
}
