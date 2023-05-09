package org.virtusa.calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner ns=new Scanner(System.in);
		try 
		{
			System.out.print("Enter the 2 numbers: ");
			int num1=ns.nextInt();
			int num2=ns.nextInt();
			int add=num1+num2;
			System.out.println("Addtion of 2 numbers: "+add);
			int sub=num1-num2;
			System.out.println("Subtraction of 2 numbers: "+sub);
			int mul=num1*num2;
			System.out.println("Multiplication of 2 numbers: "+mul);
			int div=num1/num2;
			System.out.println("Division of 2 numbers: "+div);
			
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		finally
		{
			ns.close();
		}
	}
}
