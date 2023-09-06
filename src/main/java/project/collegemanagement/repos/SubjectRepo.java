package project.collegemanagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import project.collegemanagement.entities.Subject;


public interface SubjectRepo extends JpaRepository<Subject,Integer>{

	
}