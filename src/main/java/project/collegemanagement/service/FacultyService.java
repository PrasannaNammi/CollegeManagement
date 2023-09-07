package project.collegemanagement.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import project.collegemanagement.dto.FacultyDTO;
import project.collegemanagement.entities.Faculty;
import project.collegemanagement.repos.FacultyRepo;

@Service
public class FacultyService {
	
	@Autowired
	private FacultyRepo facultyRepo;

	@Autowired
	private ModelMapper modelMapper;

	public FacultyDTO convertEntityToDto(Faculty faculty){

		return modelMapper.map(faculty,FacultyDTO.class);
	}
	public Faculty convertDtoToEntity(FacultyDTO facultyDTO){

		return modelMapper.map(facultyDTO,Faculty.class);
	}
	//get
	public List<FacultyDTO> facultyDetails()
	{

		return facultyRepo.findAll()
				.stream()
				.map(this::convertEntityToDto).toList();
	}
	
	//Post
	public FacultyDTO addSub( FacultyDTO facultyDTO)
	{
		Faculty facultyEntity=convertDtoToEntity(facultyDTO);
		facultyRepo.save(facultyEntity);
		return facultyDTO;
	}
	
	//Put
	public FacultyDTO updatelname(int id,String lastName)
	{

	    var s = facultyRepo.findById(id);
	    if(s.isPresent())
	    {
	        var faculty = s.get();
	        faculty.setLastname(lastName);
	        facultyRepo.save(faculty);
			FacultyDTO facultyDTO=convertEntityToDto(faculty);
	        return facultyDTO;
	    }
	    throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No Faculty found with the given id");
	}
	
	
	//Delete
	public String deleteFaculty( int id)
	{
	    if(facultyRepo.findById(id).isPresent())
	    {
	    	facultyRepo.deleteById(id);
	        return "Faculty Deleted Successfully";
	    }
	    throw  new ResponseStatusException(HttpStatus.NOT_FOUND,"No Faculty found with the given id");
	}





	}



