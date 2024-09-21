package com.spec.cruddemo;

import com.spec.cruddemo.dao.StudentDAO;
import com.spec.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			createStudent(studentDAO);
		};
	}

	public void createStudent(StudentDAO studentDao){
//		Student stu = new Student("spec" , "aspecsur", "spec@specmail.com");
//
//		studentDao.save(stu);
//		Student stu = studentDao.findById(1);
//		stu.setFirstName("AUpdatedName");
//		stu.setLastName("ALastName");
		List<Student> stuList = studentDao.findAll();
//		List<Student> stuList = studentDao.findByLastname("specsur");
//		studentDao.updateFirstName(1 , "scooby");

//		studentDao.delete(1);
//		System.out.println("Log: Student ID : " + stu.getId() + " " + stu.getFirstName());
		System.out.println("Log: Student List : " + stuList);

	}

}
