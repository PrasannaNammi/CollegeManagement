package project.collegemanagement.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="marks")
public class Marks {
	
	@Id
	private int markid;
	
	private float marksobtained;
	
	@ManyToOne
	@JoinColumn(name="studentid")
	@JsonIgnore
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="subjectid")
	@JsonIgnore
	private Subject subject;

	public int getMarkid() {
		return markid;
	}

	public void setMarkid(int markid) {
		this.markid = markid;
	}

	public float getMarksobtained() {
		return marksobtained;
	}

	public void setMarksobtained(float marksobtained) {
		this.marksobtained = marksobtained;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
