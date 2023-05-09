package com.exceptionHandling.basic;

public class ExceptionDemo2 {
	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 0;

			System.out.println(a / b);
		} catch (Exception e1) {
			System.out.println("can't devide by 0 :");
		}
		System.out.println("thank you !!! ");

	}

}
