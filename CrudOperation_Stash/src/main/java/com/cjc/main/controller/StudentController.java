package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/postStudent")
	public ResponseEntity<Student> regStudent(@RequestBody Student st)
	{
		Student s=studentService.saveStudent(st);
		return new ResponseEntity<Student>(s,HttpStatus.CREATED);
	}
	
	
	

}
