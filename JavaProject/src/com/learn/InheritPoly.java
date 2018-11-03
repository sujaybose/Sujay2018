package com.learn;

public class InheritPoly {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();
		b.engine();
		b.theftSafety();
		
		//static method calling
		StaticNonStatic.sum();
		//static string calling
		String name= StaticNonStatic.name;
		
		
	}
}
