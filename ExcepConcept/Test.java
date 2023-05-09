package com.ExcepConcept;

public class Test {
	public static void main(String[] args) {
		doStuff();   //5
	}
	
	public static void doStuff()
	{
		doMoreStuff();   //10
	}
	public static void doMoreStuff(){
		System.out.println(10/0);  //Arithmatic Exception : / by zero
	}

}
