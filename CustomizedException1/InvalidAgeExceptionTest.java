
// class which use custom exception
package com.CustomizedException1;

public class InvalidAgeExceptionTest {

	public static void validateAge(int age)
	{
	    try{
		if(age<18) 
		{throw new InvalidAgeException("please enter valid age");}
		
		else 
		{System.out.println("welcome to vote");}
	}
	catch(InvalidAgeException e){
		System.out.println(e.getMessage());
	   }
	
	}
	
	
	public static void main(String[] args) {
		validateAge(13);
	}
}
	

