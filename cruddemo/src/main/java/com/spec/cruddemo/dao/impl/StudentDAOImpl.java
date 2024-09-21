package com.spec.cruddemo.dao.impl;

import com.spec.cruddemo.dao.StudentDAO;
import com.spec.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    EntityManager entityManager;

    @Autowired
    StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = entityManager.createQuery("From Student order by lastName" , Student.class);

        return query.getResultList();
    }

    @Override
    public List<Student> findByLastname(String lastName) {
        TypedQuery<Student> query = entityManager.createQuery("From Student where lastName = :lastName" , Student.class);
        query.setParameter("lastName" , lastName);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void updateFirstName(int id, String firstName) {
        Student stu = findById(id);
        stu.setFirstName(firstName);
        entityManager.merge(stu);
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Student student = entityManager.find(Student.class, id);
        entityManager.remove(student);
    }


}
