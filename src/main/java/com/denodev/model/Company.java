package com.denodev.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Arnaud DENOYELLE
 *
 *         Le 07 nov. 2016
 */
@Entity
public class Company {

  @Id
  private Integer id;
  private String name;

  public Company() {
  }

  public Company(Integer id, String name) {
    this.id = id;
    this.name = name;
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
}
