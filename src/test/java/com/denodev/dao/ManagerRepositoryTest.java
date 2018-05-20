package com.denodev.dao;

import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.denodev.Application;
import com.denodev.model.Manager;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class ManagerRepositoryTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private ManagerRepository managerRepository;

    @Before
    public void before() {
        Manager m1 = new Manager();
        m1.setPersonFirstName("John");
        m1.setPersonLastName("Doe");
        m1.setBudget(10000d);
        this.managerRepository.save(m1);
    }

    @Test
    public void test() {
        List<Manager> managers = this.managerRepository.findAll();
        assertTrue(managers.size() == 1);
    }
}
