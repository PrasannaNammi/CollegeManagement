package project.collegemanagement.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import project.collegemanagement.entities.Faculty;

public interface FacultyRepo extends JpaRepository<Faculty, Integer>{


}