package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	TeacherService ts;
	
	@PostMapping("teacher")
	String addTeacher(@RequestBody Teacher t)
	{
		ts.saveTeacher(t);
		return "student added";
	}
	
	@GetMapping("teacher/{tID}")
	Teacher getStudent(@PathVariable int tID)
	{
		return ts.getTeacher(tID);
	}
	
	@DeleteMapping("teacher/{tID}")
	String deleteTeacher(@PathVariable int tID)
	{
		ts.deleteTeacher(tID);
		return "teacher deleted";
	}
	
	@DeleteMapping("teachers")
	String deleteallTeachers()
	{
		ts.deleteAllTeacher();
		return "all teachers deleted";
	}
	
	
}
