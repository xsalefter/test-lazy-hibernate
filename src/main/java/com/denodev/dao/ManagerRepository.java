package com.denodev.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denodev.model.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Long> {

}
