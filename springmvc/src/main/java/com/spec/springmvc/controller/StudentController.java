package com.spec.springmvc.controller;

import com.spec.springmvc.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    public String showForm(Model model){

        Student student = new Student();
        student.setFirstName("Manually Setted name");

        model.addAttribute("student" , student);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String submitForm(@ModelAttribute("student") Student student, Model model){

        System.out.println(student);

        return "student-form";
    }

}
