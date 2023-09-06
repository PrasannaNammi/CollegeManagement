package project.collegemanagement.entities;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Departments")
public class Department {

	@Id
	private int departmentid;
	
	private String departmentname;

	private LocalDateTime createdat;
	private LocalDateTime updatedat;
	
	@ManyToOne
	@JoinColumn(name="departmenthead", referencedColumnName = "facultyid")
	@JsonIgnore
	private Faculty faculty;

	public int getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
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

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	
}


