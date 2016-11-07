package com.denodev.controller;

import com.denodev.model.Company;
import com.denodev.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Arnaud DENOYELLE
 *
 *         Le 07 nov. 2016
 */
@RestController
@RequestMapping(value = "/companies")
public class CompanyController {

  @Autowired
  private CompanyService companyService;

  @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
  public Iterable<Company> findAll() {
    return companyService.findAll();
  }

  @RequestMapping(value = {"", "/"}, method = RequestMethod.PUT)
  public void save(@RequestBody Company company) {
    companyService.save(company);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void delete(@PathVariable Integer id) {
    companyService.delete(id);
  }

}
