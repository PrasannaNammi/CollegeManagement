package project.collegemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.collegemanagement.entities.Subject;
import project.collegemanagement.service.SubjectService;

@RestController
public class SubjectsController {
	
	@Autowired
	private SubjectService subjectservice;
	
	@GetMapping("subject/details")
	public List<Subject> subjectDetails()
	{
	return subjectservice.subjectDetails();
	
	}
	
	
	@PostMapping("/add/subject")
	public String addSub(@RequestBody Subject subject)
	{
	    
	    return subjectservice.addSub(subject);
	}


	@PutMapping("update/subjectName")
	public Subject updateName(@RequestParam() int id, @RequestParam() String subjectName)
	{
	    
	        return  subjectservice.updateName(id,subjectName);
	    
	    	}

	@DeleteMapping("delete/subject")
	public String deleteSubject(@RequestParam() int id)
	{
	   return subjectservice.deleteSubject(id);

	}
}
