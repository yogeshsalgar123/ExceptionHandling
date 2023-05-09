package org.virtusa.exceptionwrapping;

public class AgeInvalidException extends RuntimeException
{
	public final String message;
	public AgeInvalidException(String message) 
	{
		this.message=message;	
	}
	
	public String getMessage()
	{
		return message;
	}

}
