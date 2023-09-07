package project.collegemanagement.controller;

import java.util.List;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.collegemanagement.dto.FacultyDTO;
import project.collegemanagement.service.FacultyService;

@RestController
public class FacultyController {

	@Autowired
	private FacultyService facultyservice ;
	

	
	@GetMapping("/faculty/details")
	public List<FacultyDTO> facultyDetails()
	{

		return facultyservice.facultyDetails();
	}

	
	@PostMapping("/add/faculty")
	public FacultyDTO addSub(@RequestBody @Valid FacultyDTO facultyDTO)
	{

		return facultyservice.addSub(facultyDTO);
	}


	@PutMapping("update/lastName")
	public FacultyDTO updatelname(@RequestParam()  int id , @RequestParam() @Valid String lastName)
	{
	    return facultyservice.updatelname(id, lastName);
	}

	@DeleteMapping("delete/faculty")
	public String deleteFaculty(@RequestParam() int id)
	{

		return facultyservice.deleteFaculty(id);
	}





}
