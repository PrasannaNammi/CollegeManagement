package project.collegemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.collegemanagement.exception.BusinessException;
import project.collegemanagement.service.MarksService;
import project.collegemanagement.service.StudentService;
@RestController

public class BusinessController {

    @Autowired
    private MarksService marksService;

    @Autowired
    private StudentService studentService;

    @GetMapping("marksByStudentid")
    public Integer marksByStudent(@RequestParam() int studentId)
    {
        String status = studentService.getStudentByID(studentId).getIsdeleted();
        if(status.equals("Yes"))
        {
            throw new BusinessException("Sorry, this Student is Detained!","505");
        }
        return marksService.marks(studentId);
    }
}

