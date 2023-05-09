package com.exceptionHandling.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter first number :");
			int num1 = sc.nextInt();
			
			System.out.println("Enter Second number :");
			int num2 = sc.nextInt();
			
			System.out.println(num1+num2);
		}
		catch(InputMismatchException i1)
		{
			System.out.println("Plese enter integer values !!! ");
		}
		
		
		
    
	}

}
