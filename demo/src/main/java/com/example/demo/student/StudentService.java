package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import com.example.demo.student.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/*@Service = @Component*/
@Service
public class StudentService {
    public List<Student> getStudents(){
		return Arrays.asList(
			new Student(
				1,
				"Mariam",
				"mariam.jamal@gmail.com",
				LocalDate.of(2000,Month.JANUARY,5),
				21
			)
		);
	}    
}
