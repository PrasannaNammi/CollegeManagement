package project.collegemanagement.entities;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="studentstatus")
public class StudentStatus {
	
	@Id
	private int studentstatusid;
	
	private String passfailstatus;
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

	public int getStudentstatusid() {
		return studentstatusid;
	}

	public void setStudentstatusid(int studentstatusid) {
		this.studentstatusid = studentstatusid;
	}

	public String getPassfailstatus() {
		return passfailstatus;
	}

	public void setPassfailstatus(String passfailstatus) {
		this.passfailstatus = passfailstatus;
	}

	public LocalDateTime getUpdatedat() {
		return updatedat;
	}

	public void setUpdatedat(LocalDateTime updatedat) {
		this.updatedat = updatedat;
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
