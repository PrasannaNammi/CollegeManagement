package project.collegemanagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import project.collegemanagement.entities.Attendance;

public interface AttendanceRepo  extends JpaRepository<Attendance, Integer>{

}
