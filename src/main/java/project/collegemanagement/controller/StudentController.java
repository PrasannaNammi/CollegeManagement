package project.collegemanagement.controller;

import java.util.List;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.collegemanagement.entities.Student;
import project.collegemanagement.repos.StudentRepo;
import project.collegemanagement.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;



	@GetMapping("/all/students")
	public List<String> getStudents() {
		return studentService.getStudents();

	}

	@PostMapping("/students")
	public Student createStudent(@RequestBody @Valid Student student) {

		return studentService.createStudent(student);
	}

	@PutMapping("/updatestudent/{id}/{lastname}")
	public Student updateStudent(@PathVariable int id, @PathVariable String lastname) {
		return studentService.updateStudent(id, lastname);
	}

	@DeleteMapping("/deletestudent/{id}")
	public ResponseEntity<Void> deleteStudentById(@PathVariable int id) {
		return studentService.deleteStudentById(id);

	}


}
