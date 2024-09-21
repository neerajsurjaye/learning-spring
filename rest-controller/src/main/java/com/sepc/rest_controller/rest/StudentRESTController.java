package com.sepc.rest_controller.rest;

import com.sepc.rest_controller.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRESTController {

    List<Student> students;

    @PostConstruct
    public void loadData(){

        students = new ArrayList<>();
        students.add(new Student("Spec" , "Spec"));
        students.add(new Student("Neeraj" , "Surjaye"));
        students.add(new Student("spectre" , "meltdown"));

    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    @GetMapping("/students/{studentid}")
    public Student getStudent(@PathVariable Integer studentid){

        if(studentid >= students.size() || studentid < 0){
            throw new StudentNotFoundException("Student ID no found");
        }

        return students.get(studentid);
    }



}
