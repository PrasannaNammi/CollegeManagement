package project.collegemanagement.dto;

import java.time.LocalDateTime;

public class StudentStatusDTO {

    private int studentstatusid;

    private String passfailstatus;
    private LocalDateTime updatedat;

    private int semesterid;

    private int studentid;

    private int subjectid;

    public int getStudentstatusid() {
        return studentstatusid;
    }

    public void setStudentstatusid(int studentstatusid) {
        this.studentstatusid = studentstatusid;
    }

    public String getPassfailstatus() {
        return passfailstatus;
    }

    public void setPassfailstatus(String passfailstatus) {
        this.passfailstatus = passfailstatus;
    }

    public LocalDateTime getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(LocalDateTime updatedat) {
        this.updatedat = updatedat;
    }

    public int getSemesterid() {
        return semesterid;
    }

    public void setSemesterid(int semesterid) {
        this.semesterid = semesterid;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(int subjectid) {
        this.subjectid = subjectid;
    }
}
