package project.collegemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import project.collegemanagement.entities.Marks;
import project.collegemanagement.service.MarksService;

@RestController
public class MarksController {
	@Autowired
	private MarksService marksService;
	
	
	@GetMapping("/marks")
	public List<Marks> getAllMarks() {
	    return marksService.getAllMarks();
	}
	@PostMapping("add/marks")
	public Marks createMark(@RequestBody Marks mark) {
	    
	    return marksService.createMark(mark);
	}
	
	@PutMapping("/marks/{id}/{updatedMark}")
	public ResponseEntity<Marks> updateMark(@PathVariable int id, @PathVariable float updatedMarks) {
	    var marks=marksService.updateMarks(id, updatedMarks);
	        return ResponseEntity.ok(marks);
	    }
	
	
	@DeleteMapping("/marks/{id}")
	public ResponseEntity<Void> deleteMarkById(@PathVariable int id) {
	    
	        return marksService.deleteMarkById(id);
	    }
	}
	






	


