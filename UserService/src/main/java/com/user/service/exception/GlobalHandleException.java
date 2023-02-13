package com.user.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import ch.qos.logback.core.status.Status;

@RestControllerAdvice
public class GlobalHandleException {

//	@org.springframework.web.bind.annotation.ExceptionHandler(ResourceNotFound.class)
//	public ResponseEntity<ApiResponse> ExceptionHandler(ResourceNotFound ex)
//	{
//		String message= ex.getMessage();
//		ApiResponse response=ApiResponse.message(message).success(false).status(HttpStatus.NOT_FOUND);
//		return ResponseEntity.ok(response,HttpStatus.NOT_FOUND);
//	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<ApiResponse> ExceptionHandler(ResourceNotFound ex)
	{
	 	String message =ex.getMessage();
	 	ApiResponse response= new ApiResponse(message,false,HttpStatus.NOT_FOUND);
	 	return ResponseEntity.ok(response);
	}
	
}
