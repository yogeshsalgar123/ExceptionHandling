package com.customException2;

public class TestEmployeeException {
	
	public static void getEmployee(Employee emp)
	{
		try {
			if(emp.getId() < 1 || emp.getId() > 999) 
			{
				throw new EmployeeIdNotFoundException("Invalid id");
			}else if(emp.getName().length() < 6)
			{
				throw new InvalidEmployeeNameLengthException("Name length should be greater than 6");
			}else {
				System.out.println("Employee Found");
			}
		}
		catch(EmployeeIdNotFoundException e1)
		{
			System.out.println(e1);
		}
		catch (InvalidEmployeeNameLengthException e2) {
			System.out.println(e2);
		}
		
	}

	
	public static void main(String[] args) {
		Employee emp = new Employee(100,"yog");
		getEmployee(emp);
		
	}
}
