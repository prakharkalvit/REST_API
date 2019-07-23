package com.prakhar.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakhar.demo.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
