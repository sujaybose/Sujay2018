package javaProblExamples;

import java.util.Scanner;

public class reversingNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the number:"+sc.nextInt());
		int i = sc.nextInt();

		System.out.println("Reversed Number: " + reverse(i));

	}

	public static int reverse(int a) {
		int temp = 0;

		while (a > 0) {

			temp = temp * 10 + (a % 10);
			a = a / 10;

		}

		return temp;

	}

}
