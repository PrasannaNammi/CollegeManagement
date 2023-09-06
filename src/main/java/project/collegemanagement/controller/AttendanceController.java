package project.collegemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.collegemanagement.dto.AttendanceDTO;
import project.collegemanagement.entities.Attendance;
import project.collegemanagement.exception.BusinessException;
import project.collegemanagement.repos.AttendanceRepo;
import project.collegemanagement.service.AttendanceService;

@RestController
public class AttendanceController {
	
	@Autowired
	private AttendanceService attendanceservice;
	@Autowired
	private AttendanceRepo attendanceRepo;
	@GetMapping("student/attendance")
	public List<AttendanceDTO> attendanceDetails()
	{
		return attendanceservice.attendanceDetails();
	}
	
	
	@PostMapping("/add/attendance")
	public AttendanceDTO addAttendance(@RequestBody AttendanceDTO attendanceDTO)
	{
	    return attendanceservice.addAttendance(attendanceDTO);
	}


	@PutMapping("update/status")
	public AttendanceDTO updatestatus(@RequestParam() int id, @RequestParam() String status)
	{
		return attendanceservice.updatestatus(id,status);
	}
	    

	@DeleteMapping("delete/attendance")
	public String deletestudent(@RequestParam() int id)
	{
	    return attendanceservice.deletestudent(id);

}


	@GetMapping("attendanceById")
	public ResponseEntity<?> getAttendancebyID(@RequestParam() int id)
	{
		var attendance= attendanceRepo.findById(id);
		if (attendance.isEmpty()){
			throw new BusinessException("Attendence Not Found With Id");
		}

		return new ResponseEntity<Attendance>(attendance.get(), HttpStatus.OK);
	}

}
