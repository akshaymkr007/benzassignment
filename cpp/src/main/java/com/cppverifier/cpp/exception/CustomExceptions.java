/**
 * 
 */
package com.cppverifier.cpp.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author akshay
 *
 */
@ControllerAdvice
public class CustomExceptions extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> generalException(Exception ex, WebRequest request)
	{
		ExceptionCustomized ec=new ExceptionCustomized(new Date(), ex.getMessage(), request.getDescription(true));
	return new ResponseEntity<Object>(ec,HttpStatus.NOT_FOUND);	
	}

}
