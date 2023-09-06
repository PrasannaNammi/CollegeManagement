package project.collegemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import project.collegemanagement.entities.Subject;
import project.collegemanagement.repos.SubjectRepo;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectRepo subjectRepo;
	
	//get
	public List<Subject> subjectDetails()
	{
	return subjectRepo.findAll();
	
	}
	
	//post
	public String addSub( Subject subject)
	{
	    subjectRepo.save(subject);
	    return subject.getSubjectname();
	}
	
	//put
	public Subject updateName( int id, String subjectName)
	{
	    var s = subjectRepo.findById(id);
	    if(s.isPresent())
	    {
	        var subject = s.get();
	        subject.setSubjectname(subjectName);
	        subjectRepo.save(subject);
	        return subject;
	    }
	    throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No Subject found with the given id");
	}
	
	//delete
	public String deleteSubject( int id)
	{
	    if(subjectRepo.findById(id).isPresent())
	    {
	    	subjectRepo.deleteById(id);
	        return "Subject Deleted Successfully";
	    }
	    throw  new ResponseStatusException(HttpStatus.NOT_FOUND,"No Subject found with the given id");
	}

	
	

}
