package org.virtusa.delegatedexception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DelegatedException 
{
	public static void main(String[] args)
	{
		Scanner ns=new Scanner(System.in);
		System.out.print("Enter the 2 numbers: ");
		int num1=ns.nextInt();
		int num2=ns.nextInt();
		System.out.print("Addition of 2 numbers:");
		try
		{
			add(num1,num2);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.print("Subtraction of 2 numbers:");
		try 
		{
			sub(num1,num2);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.print("Multiplication of 2 numbers:");
		try
		{
			mul(num1,num2);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.print("Division of 2 numbers:");
		try
		{
			div(num1,num2);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	static void add(int a,int b) throws InputMismatchException,ArithmeticException
	{
		System.out.println(a+b);
	}
	
	static void sub(int a,int b) throws InputMismatchException,ArithmeticException
	{
		System.out.println(a-b);
	}
	
	static void mul(int a,int b) throws InputMismatchException,ArithmeticException
	{
		System.out.println(a*b);
	}
	
	static void div(int a,int b) throws InputMismatchException,ArithmeticException
	{
		System.out.println(a/b);
	}
}
