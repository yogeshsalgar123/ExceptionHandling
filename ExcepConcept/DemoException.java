package com.ExcepConcept;

public class DemoException {
 int a;
 static int b=20;
	public static void main(String[] args) {
		
		try {
		  System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e);
			
		}
	}

}
