package project.collegemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import project.collegemanagement.entities.Department;
import project.collegemanagement.repos.DepartmentRepo;

@Service
public class DepartmentService {
	
	@Autowired 
	private DepartmentRepo departmentRepo;
	
	//get
	public List<Department> getDepartments()
	{
	    return departmentRepo.findAll();
	}

	//post
	public String addDepartment( Department department)
	{
	    departmentRepo.save(department);
	    return department.getDepartmentname();
	}

	//Put
	public Department updateDepartment( int id,  String name)
	{
	    var s = departmentRepo.findById(id);
	    if(s.isPresent())
	    {
	        var department = s.get();
	        department.setDepartmentname(name);
	        departmentRepo.save(department);
	        return department;
	    }
	    throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No department found with the given id");
	}

	//Delete
	public String deleteDepartment( int id)
	{
	    if(departmentRepo.findById(id).isPresent())
	    {
	    	departmentRepo.deleteById(id);
	        return "department Deleted Successfully";
	    }
	    throw  new ResponseStatusException(HttpStatus.NOT_FOUND,"No department found with the given id");
	}
}
	
	
	
	





