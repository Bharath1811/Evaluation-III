package com.masai.webapp.example.exceptions;

public class InvalidMarksException extends RuntimeException{

	public InvalidMarksException() {}
	
	public InvalidMarksException(String msg) {
		super(msg);
	}
}
