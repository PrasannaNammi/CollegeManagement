package project.collegemanagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import project.collegemanagement.entities.Marks;

public interface MarksRepo extends JpaRepository<Marks , Integer> {

}
