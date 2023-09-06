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

import project.collegemanagement.entities.Department;
import project.collegemanagement.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService  departmentService;
	
	@GetMapping("/all/departments")
	public List<Department> getDepartments()
	{
	    return departmentService.getDepartments();
	}

	@PostMapping("/add/department")
	public String addDepartment(@RequestBody Department department)
	{
	   
	    return departmentService.addDepartment(department);
	}

	@PutMapping("update/department")
	public Department updateDepartment(@RequestParam() int id, @RequestParam() String name)
	{
	    
	        return departmentService.updateDepartment(id, name);
	    }
	

	@DeleteMapping("delete/department")
	public String deleteDepartment(@RequestParam() int id)
	{
		return departmentService.deleteDepartment(id);
	}
}
	
	
	
	


