package com.learn;
import com.learn.TestClass;

public class StaticNonStatic {
		
		int age= 25;
		static String name= "tom";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//local variable for main method
		int num3=22;
		System.out.println(TestClass.num1);
		
		TestClass abc=new TestClass();
		System.out.println(abc.num2);
		
		TestClass.stc();
		
		abc.nonStc();
		
		
	}
	public static void sum() {
		System.out.println("this is sum method");
	}

}
