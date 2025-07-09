package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	TeacherRepository tr;
	
	public void saveTeacher(Teacher t)
	{
		tr.save(t);
	}
	
	public Teacher getTeacher(int tID)
	{
		return tr.findById(tID).get();
	}
	
	public void deleteTeacher(int tID)
	{
		tr.deleteById(tID);
	}
	
	public void deleteAllTeacher()
	{
		tr.deleteAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
