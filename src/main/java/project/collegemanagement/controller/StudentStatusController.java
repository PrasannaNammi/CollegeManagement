package project.collegemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import project.collegemanagement.entities.StudentStatus;
import project.collegemanagement.repos.StudentStatusRepo;
import project.collegemanagement.service.StudentStatusService;

import java.util.List;

@RestController
public class StudentStatusController {

    @Autowired
    private StudentStatusService studentStatusService;


    @GetMapping("/all/studentstatus")
    public List<StudentStatus> getStudentStatus() {
        return studentStatusService.getStudentStatus();
    }

    @PostMapping("/add/studentstatus")
    public String addStudentStatus(@RequestBody StudentStatus studentStatus) {

        return studentStatusService.addStudentStatus(studentStatus);
    }

    @PutMapping("update/studentstatus")
    public StudentStatus updateStudentstatus(@RequestParam() int id, @RequestParam() String passfailstatus) {
        return studentStatusService.updateStudentstatus(id, passfailstatus);

    }


    @DeleteMapping("delete/studentstatus")
    public String deletestudentStatus(@RequestParam() int id) {
        return studentStatusService.deletestudentStatus(id);


    }
}

