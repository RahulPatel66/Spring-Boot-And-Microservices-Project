package com.user.service.exception;

public class ResourceNotFound extends RuntimeException{

	public ResourceNotFound()
	{
		super("resource not exit");
	}
	public ResourceNotFound(String message)
	{
		super(message);
	}
}
