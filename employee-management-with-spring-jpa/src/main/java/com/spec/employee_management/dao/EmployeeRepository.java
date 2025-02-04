package com.spec.employee_management.dao;

import com.spec.employee_management.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
