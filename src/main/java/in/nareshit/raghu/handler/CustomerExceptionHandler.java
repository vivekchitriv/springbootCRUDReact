package in.nareshit.raghu.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.nareshit.raghu.exception.EmployeeNotFoundException;

@RestControllerAdvice
public class CustomerExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<String> hendleEmployeeNotFound(
			EmployeeNotFoundException enfe)
	{
		return new ResponseEntity<String>(
				enfe.getMessage(),
				HttpStatus.NOT_FOUND);
	}
}
