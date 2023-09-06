package project.collegemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import project.collegemanagement.entities.Marks;
import project.collegemanagement.repos.MarksRepo;

@Service
public class MarksService {
	@Autowired
	private MarksRepo marksRepo;

	// get
	public List<Marks> getAllMarks() {
		return marksRepo.findAll();
	}

	// PostMapping
	public Marks createMark( Marks mark) {

		return marksRepo.save(mark);
	}

	// PutMapping
	public Marks updateMarks( int id,  float updatedMark) {
		Optional<Marks> existingMark = marksRepo.findById(id);
		if (existingMark.isPresent()) {

			var mark = existingMark.get();
			mark.setMarksobtained(updatedMark);
			marksRepo.save(mark);
			return mark;
		} else
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "id not present");
	}

	// DeleteMapping
	public ResponseEntity<Void> deleteMarkById( int id) {
		Optional<Marks> mark = marksRepo.findById(id);
		if (mark.isPresent()) {
			marksRepo.deleteById(id);
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}
