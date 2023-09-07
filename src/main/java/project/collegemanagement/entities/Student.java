package project.collegemanagement.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="students")
public class Student {

	@Id
	private int studentid;

	@NotBlank (message = "First name is required")
	private String firstname;
	@NotBlank(message = "Last name is required")
	private String lastname;
	@NotNull (message = "Date of birth is required")
	private LocalDate dateofbirth;
	@NotBlank(message = "Contact info is required")
	private String contactinfo;
	@NotBlank(message = "Address info is required")
	private String address;
	private LocalDateTime createdat;
	private LocalDateTime updatedat;
	private String isactive;
	private String isdeleted;
	
	
	public Student()
	{
		
	}


	
	public Student(int studentid, String firstname, String lastname, LocalDate dateofbirth, String contactinfo,
			String address, LocalDateTime createdat, LocalDateTime updatedat, String isactive, String isdeleted) {
		super();
		this.studentid = studentid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateofbirth = dateofbirth;
		this.contactinfo = contactinfo;
		this.address = address;
		this.createdat = createdat;
		this.updatedat = updatedat;
		this.isactive = isactive;
		this.isdeleted = isdeleted;
	}



	public int getStudentid() {
		return studentid;
	}


	public void setStudentid(int studentid) {
		this.studentid = studentid;
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


	public LocalDate getDateofbirth() {
		return dateofbirth;
	}


	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}


	public String getContactinfo() {
		return contactinfo;
	}


	public void setContactinfo(String contactinfo) {
		this.contactinfo = contactinfo;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
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



	
	
}
