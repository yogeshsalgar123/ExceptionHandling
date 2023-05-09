package com.CustomizedException1;

public class TestCustom {

	public static void main(String[] args) {
	//	System.out.println("Statement1");
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace(); //location description  
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	//	System.out.println("Statement3");
	}
}
