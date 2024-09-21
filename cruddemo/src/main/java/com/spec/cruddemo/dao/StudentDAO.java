package com.spec.cruddemo.dao;

import com.spec.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastname(String lastName);
    void updateFirstName(int id, String firstName);
    void update(Student student);
    void delete(int student);
}
