package project.collegemanagement.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AttendanceDTO {
private int attendanceid;
	
	private LocalDate date;
	private String status;
	private float condonationfee;
	private LocalDateTime createdat;
	private LocalDateTime updatedat;
	private int semesterid;
	private int studentid;
	private int subjectid;
	public int getAttendanceid() {

		return attendanceid;
	}
	public void setAttendanceid(int attendanceid) {

		this.attendanceid = attendanceid;
	}
	public LocalDate getDate() {

		return date;
	}
	public void setDate(LocalDate date) {

		this.date = date;
	}
	public String getStatus() {

		return status;
	}
	public void setStatus(String status) {

		this.status = status;
	}
	public float getCondonationfee() {

		return condonationfee;
	}
	public void setCondonationfee(float condonationfee) {

		this.condonationfee = condonationfee;
	}
	public LocalDateTime getCreatedat() {

		return createdat;
	}
	public void setCreatedat(LocalDateTime createdat) {

		this.createdat = createdat;
	}
	public LocalDateTime getUpdatedat() {

		return updatedat;
	}
	public void setUpdatedat(LocalDateTime updatedat) {
		this.updatedat = updatedat;
	}
	public int getSemesterid() {

		return semesterid;
	}
	public void setSemesterid(int semesterid) {

		this.semesterid = semesterid;
	}
	public int getStudentid() {

		return studentid;
	}
	public void setStudentid(int studentid) {

		this.studentid = studentid;
	}
	public int getSubjectid() {

		return subjectid;
	}
	public void setSubjectid(int subjectid) {

		this.subjectid = subjectid;
	}
	

}
