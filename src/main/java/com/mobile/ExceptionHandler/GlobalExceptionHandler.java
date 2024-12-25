package com.mobile.ExceptionHandler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mobile.Exception.MobileAlreayExistsException;
import com.mobile.Exception.MobileNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	@Value(value="${data.exception.message1}")
  private String message1;
	@Value(value="${data.exception.message2}")
	private String message2;
	
	@ExceptionHandler(value=MobileNotFoundException.class)
	public ResponseEntity mobileNotFoundException(MobileNotFoundException mobileNotFoundException) {
		return new ResponseEntity(message1,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=MobileAlreayExistsException.class)
	public ResponseEntity mobileAlreadyExistsException(MobileAlreayExistsException mobileAlreadyExistsException) {
		return new ResponseEntity(message2,HttpStatus.NOT_FOUND);
	}
}
