package com.denodev.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.denodev.model.Employee;

@Service
@Transactional
public class CustomService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Employee> findEmployeesByCompanyId(final Integer companyId) {
        return this.entityManager
            .createQuery("from Employee e where e.company.id = :companyId", Employee.class)
            .setParameter("companyId", companyId)
            .getResultList();
    }

    public void setEntityManager(EntityManager entityManager) {
	    this.entityManager = entityManager;
    }
}
