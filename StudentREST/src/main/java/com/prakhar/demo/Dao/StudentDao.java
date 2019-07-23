package com.prakhar.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakhar.demo.model.Student;

public interface StudentDao extends JpaRepository<Student,Integer> {

}
