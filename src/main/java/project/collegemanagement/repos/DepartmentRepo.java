package project.collegemanagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import project.collegemanagement.entities.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

//	@Query("select from Department")
//	public List<Department> getHOD();
}