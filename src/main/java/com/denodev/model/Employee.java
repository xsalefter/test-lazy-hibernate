package com.denodev.model;

import java.util.Date;

import javax.persistence.*;

/**
 * @author Arnaud DENOYELLE
 *
 *         Le 07 nov. 2016
 */
@Entity
public class Employee {

  @Id
  private Integer id;
  private String name;
  private String surname;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "birth_date", columnDefinition = "DATETIME")
  private Date birthDate;

  @ManyToOne(fetch = FetchType.LAZY)
  private Company company;

  public Employee() {
  }

  public Employee(Integer id, String name, String surname, Date birthDate, Company company) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.birthDate = birthDate;
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
