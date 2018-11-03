package com.learn;

public class CllByRefAndValue {
	

	int p;
	int q;

	public static void main(String[] args) {
		CllByRefAndValue obj= new CllByRefAndValue();
		
		int a= 5;
		int b= 8;
		//Call by value or pass by value
		int c= obj.sum(a, b);
		System.out.println(c);
		
		obj.p=50;
		obj.q=60;
		
		obj.swap(obj);
		
		System.out.println(obj.p);
		
	}
	
	public int sum (int x, int y) {
		
		//x= 20;
		//y= 30;
		
		int c = x+y;
		return c;
		
		
	}
	
	//call by reference
	public void swap(CllByRefAndValue t) {
		int temp= t.p;
		t.p=t.q;
		t.q=temp;
		System.out.println("value of p="+p);
		System.out.println("value of q="+q);
	}
}
