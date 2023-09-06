package project.collegemanagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import project.collegemanagement.entities.Semester;

public interface SemesterRepo extends JpaRepository<Semester, Integer>{

}