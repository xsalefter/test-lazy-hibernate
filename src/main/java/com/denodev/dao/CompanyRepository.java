package com.denodev.dao;

import com.denodev.model.Company;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Arnaud DENOYELLE
 *
 *         Le 07 nov. 2016
 */
public interface CompanyRepository extends CrudRepository<Company, Integer> {
}
