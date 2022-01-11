package com.wowoni.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wowoni.Entity.Student;
import com.wowoni.Entity.Classes.Details;
import com.wowoni.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}
	
	@GetMapping("/all")
	public List<Student> showAllStudents(){
		return service.showAllStudents();
	}
	
	@GetMapping("/get/{stdId}")
	public Details getDetails(@PathVariable long stdId) {
		return service.getDetails(stdId);
	}

}
