//Exercise 2: Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.

package com.cts.asgn_4;

import java.util.Scanner;
class InvalidAge extends Exception{
	public InvalidAge(String message) {
		super(message);
	}
}

public class Age {
	public static void main(String[] args) throws InvalidAge{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		if (age>15) {
			System.out.println("Age of person:"+age);
		}
		else {
			throw new InvalidAge("Enter valid age");
		}
	}
}
