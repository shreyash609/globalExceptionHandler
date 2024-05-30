package in.ashokit.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ashokit.binding.AppExInfo;

@RestControllerAdvice
public class ExceptionHandler {
	
	
	@org.springframework.web.bind.annotation.ExceptionHandler(value=Exception.class)
	public ResponseEntity<AppExInfo> exceptionHandler(Exception e){
		
		AppExInfo exception =new AppExInfo();
		
		exception.setExCode("SBIEX101");//management will decide the code
		exception.setExMsg(e.getMessage());
		exception.setExDate(LocalDateTime.now());

		return new ResponseEntity<AppExInfo>(exception,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
