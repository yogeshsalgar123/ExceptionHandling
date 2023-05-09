package com.customException2;

public class InvalidEmployeeNameLengthException extends Throwable{
	
	public InvalidEmployeeNameLengthException(String message) {
		super(message);
	}

}
