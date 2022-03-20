package com.example.demo;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import com.example.demo.student.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	/*public String hello() {
		return "Hello World";
	}*/

	public List<Student> hello(){
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
