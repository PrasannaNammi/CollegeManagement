package project.collegemanagement.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="semesters")
public class Semester {
	
	@Id
	private int semesterid;
	
	private String semestername;
	
	private LocalDate startdate;
	private LocalDate enddate;
	
	@OneToMany(mappedBy = "semester")
	private List<Attendance> attendance;

	public int getSemesterid() {
		return semesterid;
	}

	public void setSemesterid(int semesterid) {
		this.semesterid = semesterid;
	}

	public String getSemestername() {
		return semestername;
	}

	public void setSemestername(String semestername) {
		this.semestername = semestername;
	}

	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}

	public LocalDate getEnddate() {
		return enddate;
	}

	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}

	public List<Attendance> getAttendance() {
		return attendance;
	}

	public void setAttendance(List<Attendance> attendance) {
		this.attendance = attendance;
	}
	
	

}