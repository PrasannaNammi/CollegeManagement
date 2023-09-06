package project.collegemanagement.entities;



import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="attendance")
public class Attendance {
	
	@Id
	private int attendanceid;
	
	private LocalDate date;
	private String status;
	private float condonationfee;
	private LocalDateTime createdat;
	private LocalDateTime updatedat;

	
	@ManyToOne
	@JoinColumn(name="studentid")
	@JsonIgnore
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="semesterid")
	@JsonIgnore
	private Semester semester;
	
	@ManyToOne
	@JoinColumn(name="subjectid")
	@JsonIgnore
	private Subject subject;

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

	public LocalDateTime getUpdateat() {
		return updatedat;
	}

	public void setUpdateat(LocalDateTime updateat) {
		this.updatedat = updateat;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Semester getSemester() {
		return semester;
	}

	public void setSemester(Semester semester) {
		this.semester = semester;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
}
