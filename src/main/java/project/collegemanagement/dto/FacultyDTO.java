package project.collegemanagement.dto;

import java.time.LocalDateTime;

import project.collegemanagement.entities.Department;

public class FacultyDTO {

private int facultyid;
	
	private String firstname;
	private String lastname;

	private String contactinfo;

	private LocalDateTime createdat;
	private LocalDateTime updatedat;
	private String isactive;
	private String isdeleted;
	
	
	
	private Department departmentid;



	public int getFacultyid() {
		return facultyid;
	}



	public void setFacultyid(int facultyid) {
		this.facultyid = facultyid;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getContactinfo() {
		return contactinfo;
	}



	public void setContactinfo(String contactinfo) {
		this.contactinfo = contactinfo;
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



	public String getIsactive() {
		return isactive;
	}



	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}



	public String getIsdeleted() {
		return isdeleted;
	}



	public void setIsdeleted(String isdeleted) {
		this.isdeleted = isdeleted;
	}



	public Department getDepartmentid() {
		return departmentid;
	}



	public void setDepartmentid(Department departmentid) {
		this.departmentid = departmentid;
	}
}
