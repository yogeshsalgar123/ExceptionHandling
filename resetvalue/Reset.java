package org.virtusa.resetvalue;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Reset extends User
{
	public static void main(String[] args) 
	{
		Reset reset= new Reset();
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the name:  ");
		reset.name=sc.next();
		try
		{
			System.out.print("Enter the age  ");
			reset.age=sc.nextInt();
			System.out.println(reset);
		}
		catch (InputMismatchException e)
		{
			System.out.println("GIVE AGE IN INTIGER FORMAT ");
			e.printStackTrace();
		}
		finally
		{
			sc.close();
			reset=null;
			System.out.println(reset);
		}
	}

}
