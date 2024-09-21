package com.spec.employee_management.rest;

import com.spec.employee_management.dao.EmployeeDao;
import com.spec.employee_management.dao.impl.EmployeeDaoImpl;
import com.spec.employee_management.entity.Employee;
import com.spec.employee_management.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    EmployeeRestController( EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeid}")
    public Employee find(@PathVariable() int employeeid){
        return employeeService.findById(employeeid);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        log.error("ErrorCust : " + employee.toString());
        return employeeService.save(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployeeById(@PathVariable int employeeId){
        employeeService.deleteById(employeeId);
    }

}
