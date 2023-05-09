package com.CustomizedException1;

public class InvalidAgeException extends Throwable{
	
	InvalidAgeException(String message)
	{
		super(message);   //calling parent throwable exception constructor
		//System.out.println("constructor");
	}

}
