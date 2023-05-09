package org.virtusa.exceptionwrapping;
import java.util.Scanner;

public class Employee 
{
	public static void main(String[] args)
	{
		Scanner ns=new Scanner(System.in);
		System.out.println("Enter name & age of an employee");
		String name=ns.next();
		int age=ns.nextInt();
		
		if(name.equals("Yogesh"))
		{
			try
			{
				throw new NameInvalidException("Name already exists");
			}
			catch(NameInvalidException e)
			{
				System.err.println(e.getMessage());
             //e.printStackTrace();
			}
		}
		else
		{
			System.err.println("Name Is Entered Successfully");
		}
			
		if(age>18)
		{
			if(age<60)
			{
				System.err.println("Age is Valid");
			}
			else
			{
				try
				{
					throw new AgeInvalidException("Age Invalid");
				}
				catch(AgeInvalidException e)
				{
					System.out.println(e.getMessage());
                 //e.printStackTrace();

				}
			}
		}
		else
		{
			try
			{
				throw new AgeInvalidException("Age Invalid");
			}
			catch(AgeInvalidException e)
			{
				System.out.println(e.getMessage());
				//e.printStackTrace();

			}
		}
	}
}
