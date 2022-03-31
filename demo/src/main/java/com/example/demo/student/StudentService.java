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

import org.springframework.beans.factory.annotation.Autowired;
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

	private final StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository){
		this.studentRepository = studentRepository;
	}

    public List<Student> getStudents(){
		/*return Arrays.asList(
			new Student(
				(long) 1,
				"Mariam",
				"mariam.jamal@gmail.com",
				LocalDate.of(2000,Month.JANUARY,5),
				21);*/
				return studentRepository.findAll();
	}

	public void addNewStudent(Student student) {
		studentRepository.findStudentByEmail(student.getEmail());
		System.out.println(student);
		studentRepository.save(student);
	}

	public void deleteStudent(Long studentId) {
		/*studentRepository.findById(studentId);
			studentRepository.existsById(studentId);*/
		boolean exists = studentRepository.existsById(studentId);
		if (!exists){
			throw new IllegalStateException(
				"student with id " + studentId + "does not exists");
		}
		studentRepository.deleteById(studentId);
	}    
}