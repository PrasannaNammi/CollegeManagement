package project.collegemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

import project.collegemanagement.entities.Student;
import project.collegemanagement.repos.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	//get
	public List<String> getStudents()
	{
		return studentRepo.getNames();

}
	
	//PostMapping
	public Student createStudent( Student student) {
	    
	    return studentRepo.save(student);
	}

	//PutMapping
	public Student updateStudent( int id,  String lastname) {
	    Optional<Student> existingStudent = studentRepo.findById(id);
	    if (existingStudent.isPresent()) {
	        
	        Student student = existingStudent.get();
	        student.setLastname(lastname);
	        
	        studentRepo.save(student);
	        return student;
	    } else {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Student not found");
	    }
	}
	
	//DeleteMapping
	public ResponseEntity<Void> deleteStudentById( int id) {
		Optional<Student> student = studentRepo.findById(id);
		if (student.isPresent()) {
			studentRepo.deleteById(id);
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	public Student getStudentByID(int studentId)
	{
		return studentRepo.findById(studentId).get();
	}



	//Pagination
	public List<Student> getStudentPages(int pageno,int pagesize) {
		var result = studentRepo.findAll(PageRequest.of(pageno, pagesize));
		return result.getContent();
	}
}



