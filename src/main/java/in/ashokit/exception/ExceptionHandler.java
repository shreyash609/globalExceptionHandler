package in.ashokit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {
	
	
	@org.springframework.web.bind.annotation.ExceptionHandler(value=Exception.class)
	public ResponseEntity<String> exceptionHandler(Exception e){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
