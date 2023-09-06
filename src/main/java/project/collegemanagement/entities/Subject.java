package project.collegemanagement.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="subjects")
public class Subject {
	


	@Id
	private int subjectid;
	
	
	private String subjectname;
	
	@ManyToOne
	@JoinColumn(name="facultyid")
//	@JsonIgnore
	private Faculty faculty;

	public int getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
}