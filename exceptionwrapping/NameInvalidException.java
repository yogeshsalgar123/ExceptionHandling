package org.virtusa.exceptionwrapping;

public class NameInvalidException extends RuntimeException
{
	public final String message;
	public NameInvalidException(String message) 
	{
		this.message=message;	
	}
	
	@Override
	public String getMessage()
	{
		return message;
	}

}
