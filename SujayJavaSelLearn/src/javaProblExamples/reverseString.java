package javaProblExamples;

import java.util.ArrayList;
import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		System.out.println("Please input the string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		System.out.println("reversed String: " + reverseStr(s));

	}

	public static String reverseStr(String s) {
		String temp = "";
		char[] ar = s.toCharArray();
		System.out.println("printchar array: " + ar.length);
		for (int i = ar.length; i >= 0; i--) {
			try {

				temp = temp + ar[i - 1];
				//System.out.println("String:" + temp);
			} catch (Exception e) {
				
			}

		}
		return temp;

	}

}
