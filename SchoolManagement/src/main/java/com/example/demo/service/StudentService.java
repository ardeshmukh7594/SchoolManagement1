package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository sr;

	public void saveStudent(Student s) {
		sr.save(s);

	}

	public Student getStudent(int sID) {

		return sr.findById(sID).get();
	}

	public void deleteStudent(int sID) {

		sr.deleteById(sID);
	}

	public void deleteAll() {
		sr.deleteAll();
	}

}
