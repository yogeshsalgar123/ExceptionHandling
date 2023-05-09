package org.virtusa.course;

import java.util.Scanner;

public class Course 
{
	public static void main(String[] args) 
	{
		Scanner ns =new Scanner(System.in);
		System.out.println("Enter the data in format language number,language number,language number: ");
		String str=ns.nextLine();
		try
		{
			String[] strArry=str.split(",");
			for (String string:strArry)
			{
				String[] subStringArr=string.split(" ");
				if(Integer.parseInt(subStringArr[1])<=8)
					System.out.println(subStringArr[1]);
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please give format correctly " );
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		finally
		{
			ns.close();
		}
	}

}
