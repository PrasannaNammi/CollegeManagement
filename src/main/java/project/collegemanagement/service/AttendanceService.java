package project.collegemanagement.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import project.collegemanagement.dto.AttendanceDTO;
import project.collegemanagement.entities.Attendance;
import project.collegemanagement.repos.AttendanceRepo;

@Service
public class AttendanceService {
	
	@Autowired
	private AttendanceRepo  attendanceRepo;

	@Autowired
	private ModelMapper modelMapper;

	public AttendanceDTO convertEntityToDto(Attendance attendance){

		return modelMapper.map(attendance,AttendanceDTO.class);
	}
	public Attendance convertDtoToEntity(AttendanceDTO attendanceDTO){

		return modelMapper.map(attendanceDTO,Attendance.class);
	}
	
	//get
	public List<AttendanceDTO> attendanceDetails()
	{
		return attendanceRepo.findAll()
			.stream()
			.map(this::convertEntityToDto).toList();
	}


	
	//post
	public AttendanceDTO addAttendance( AttendanceDTO attendanceDTO)
	{
		Attendance attendanceEntity=convertDtoToEntity(attendanceDTO);
	    attendanceRepo.save(attendanceEntity);
	    return attendanceDTO;
	}
	
	//put
	public AttendanceDTO updatestatus( int id,  String status)
	{
	    var s = attendanceRepo.findById(id);
	    if(s.isPresent())
	    {
	        var attendance = s.get();
	        attendance.setStatus(status);
	        attendanceRepo.save(attendance);
			AttendanceDTO attendanceDTO=convertEntityToDto(attendance);
	        return attendanceDTO;
	    }
	    throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No Attendance found with the given id");
	}
	//delete
	public String deletestudent( int id)
	{
	    if(attendanceRepo.findById(id).isPresent())
	    {
	    	attendanceRepo.deleteById(id);
	        return "Attendance Deleted Successfully";
	    }
	    throw  new ResponseStatusException(HttpStatus.NOT_FOUND,"No Attendance found with the given id");
	}

}
