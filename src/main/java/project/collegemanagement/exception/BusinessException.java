package project.collegemanagement.exception;

public class BusinessException  extends   RuntimeException {
    private String errormessage;
    private String errorcode;
    private static final long serialVersionUserID = 1;

    public BusinessException(String errormessage) {
        this.errormessage = errormessage;
    }

    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    public String getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }

    public BusinessException(String errormessage, String errorcode) {
        this.errormessage = errormessage;
        this.errorcode = errorcode;
    }

    public BusinessException() {
    }


    public class AttendanceNotFoundException extends BusinessException {
        public AttendanceNotFoundException(String message) {
            super(message);
        }
    }

    public class DepartmentNotFoundException extends BusinessException {
        public DepartmentNotFoundException(String message) {
            super(message);
        }
    }
}

