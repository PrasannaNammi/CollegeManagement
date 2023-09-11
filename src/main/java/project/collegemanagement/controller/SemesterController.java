package project.collegemanagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import project.collegemanagement.entities.Semester;
import project.collegemanagement.service.SemesterService;

import java.util.List;

@RestController
public class SemesterController {

    @Autowired
    private SemesterService semesterService;


    @GetMapping("/all/semesters")
    public List<Semester> getSemester() {

        return semesterService.getSemester();
    }


    @PostMapping("/add/semester")
    public String addSemester(@RequestBody Semester semester) {

        return semesterService.addSemester(semester);
    }


    @PutMapping("update/semester")
    public Semester updateSemester(@PathVariable int id, @PathVariable String semesterName) {

        return semesterService.updateSemester(id, semesterName);
    }


    @DeleteMapping("delete/semester")
    public String deleteSemester(@RequestParam() int id) {
        return semesterService.deleteSemester(id);
    }
}
