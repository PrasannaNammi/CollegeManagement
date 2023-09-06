package project.collegemanagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import project.collegemanagement.entities.StudentStatus;

public interface StudentStatusRepo extends JpaRepository<StudentStatus,Integer> {

}
