package com.learn;

public class TestClass {
	
	//Global variables
	public static int num1= 55;
	
	int num2=33;
	
	//nothing mentioned in access modifier means it is default public
	//you can make this method private as this is accessed by other class 
	void nonStc() {
		//local variables
		int i=56;
		
		System.out.println("This is not static");
		
	}
	
	public static void stc() {
		System.out.println("This is static");
		
		
	}

}
