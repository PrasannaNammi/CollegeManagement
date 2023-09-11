package project.collegemanagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import project.collegemanagement.entities.Marks;

public interface MarksRepo extends JpaRepository<Marks , Integer> {

    @Query(value="select marksobtained from Marks where StudentID = 1 and Subjectid=1", nativeQuery = true)
    public int getMarksByStudent(@Param("studentId") int studentId);

}
