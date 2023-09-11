package project.collegemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import project.collegemanagement.entities.StudentStatus;
import project.collegemanagement.repos.StudentStatusRepo;

import java.util.List;

@Service
public class StudentStatusService {

@Autowired
    private StudentStatusRepo studentStatusRepo;



    public List<StudentStatus> getStudentStatus()
    {
        return studentStatusRepo.findAll();
    }


    public String addStudentStatus( StudentStatus studentStatus)
    {
        studentStatusRepo.save(studentStatus);
        return studentStatus.getPassfailstatus();
    }


    public StudentStatus updateStudentstatus( int id,  String passfailstatus)
    {
        var s = studentStatusRepo.findById(id);
        if(s.isPresent())
        {
            var studentStatus = s.get();
            studentStatus.setPassfailstatus(passfailstatus);
            studentStatusRepo.save(studentStatus);
            return studentStatus;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No studentStatus found with the given id");
    }


    public String deletestudentStatus( int id)
    {
        if(studentStatusRepo.findById(id).isPresent())
        {
            studentStatusRepo.deleteById(id);
            return "StudentStatus  Deleted Successfully";
        }
        throw  new ResponseStatusException(HttpStatus.NOT_FOUND,"No studentStatus found with the given id");
    }


}


