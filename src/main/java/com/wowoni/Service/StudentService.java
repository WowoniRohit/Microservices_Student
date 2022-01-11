package com.wowoni.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wowoni.Entity.Student;
import com.wowoni.Entity.Classes.Details;
import com.wowoni.Entity.Classes.Subject;
import com.wowoni.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repository;

	@Autowired
	RestTemplate restTemplate;

	public Student createStudent(Student student) {
		return repository.save(student);
	}
	
	public List<Student> showAllStudents(){
		return repository.findAll();
	}

	public Details getDetails(long stdId) {
		Optional<Student> student = repository.findById(stdId);
		long sid = student.get().getSubId();
		Subject subject = restTemplate.getForObject("http://SUBJECT/subject/get/" + sid, Subject.class);
		Details details=new Details();
		details.setStudent(student.get());
		details.setSubject(subject);
		return details;
	}
	
//	public Optional<Details> all(){
//		List<Student> students=repository.findAll();
//		long sid = students.
//	}

}
