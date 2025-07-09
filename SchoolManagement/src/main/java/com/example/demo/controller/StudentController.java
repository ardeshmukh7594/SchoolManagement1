package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;

	@PostMapping("student")
	String addStudent(@RequestBody Student s) {
		ss.saveStudent(s);
		return "student added";
	}

	@GetMapping("student/{sID}")
	Student getStudent(@PathVariable int sID) {
		return ss.getStudent(sID);
	}

	@DeleteMapping("student/{sID}")
	String deleteStudent(@PathVariable int sID) {
		ss.deleteStudent(sID);
		return "student deleted";
	}

	@DeleteMapping("students")
	String deleteAll() {
		ss.deleteAll();
		return "all students deleted";
	}

}
