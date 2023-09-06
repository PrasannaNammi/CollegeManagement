package project.collegemanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<String> handleMisArgument(){
		
		return new ResponseEntity<>("arguments not matched",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NumberFormatException.class)
	public ResponseEntity<String> handleNFE(){
		
		return new ResponseEntity<>("enter valid numbers",HttpStatus.BAD_REQUEST);
	}

	
	@ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointerException(NullPointerException ex) {
		
        return new ResponseEntity<>("A null value was encountered: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<String> handleBusinessExcep(Exception ex) {

		return new ResponseEntity<>( ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}





