package com.user.service.exception;

import org.springframework.http.HttpStatus;

public class ApiResponse {

//	private String message;
//	private String success;
//	private String status;
	
	
	private String message;
	private boolean success;
	private HttpStatus status;
	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApiResponse(String message, boolean success, HttpStatus status) {
		super();
		this.message = message;
		this.success = success;
		this.status = status;
	}
	
	
	
}
