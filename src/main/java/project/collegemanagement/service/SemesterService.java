package project.collegemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import project.collegemanagement.entities.Semester;
import project.collegemanagement.entities.Subject;
import project.collegemanagement.repos.SemesterRepo;

import java.util.List;

@Service
public class SemesterService {

    @Autowired
    private SemesterRepo semesterRepo;



    public List<Semester> getSemester() {

        return semesterRepo.findAll();
    }


        public String addSemester(Semester semester)
        {
            semesterRepo.save(semester);
            return semester.getSemestername();
    }




    public Semester updateSemester( int id,  String semesterName)
    {
        var s = semesterRepo.findById(id);
        if(s.isPresent())
        {
            var semester = s.get();
            semester.setSemestername(semesterName);
            semesterRepo.save(semester);
            return semester;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No Semester found with the given id");
    }


    public String deleteSemester( int id)
    {
        if(semesterRepo.findById(id).isPresent())
        {
            semesterRepo.deleteById(id);
            return "Shop Deleted Successfully";
        }
        throw  new ResponseStatusException(HttpStatus.NOT_FOUND,"No Shop found with the given id");
    }

}


