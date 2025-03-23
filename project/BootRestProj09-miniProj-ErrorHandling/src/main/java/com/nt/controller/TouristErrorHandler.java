package com.nt.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nt.error.TouristNotFoundException;
import com.nt.model.ErrorDetails;

//@ControllerAdvice

@RestControllerAdvice   //(@ControllerAdvice+@ResponseBody)
public class TouristErrorHandler {
	
	@ExceptionHandler(TouristNotFoundException.class) //specific error
	public ResponseEntity<ErrorDetails> handleTouristNotFound(TouristNotFoundException tnf){
		ErrorDetails details = new ErrorDetails(LocalDateTime.now(),tnf.getMessage(),"404-Tourist Not Found");
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(Exception.class) //All type of error
	public ResponseEntity<ErrorDetails> handleAllError(Exception e){
		ErrorDetails details = new ErrorDetails(LocalDateTime.now(),e.getMessage(),"Problem in Execution");
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	

}
