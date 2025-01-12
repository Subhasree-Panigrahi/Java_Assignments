//Exercise 1: Write a Java Program to validate the full name of an employee. Create and throw a user defined exception if firstName and lastName is blank.

package com.cts.asgn_4;

import java.util.Scanner;
class InvalidName extends Exception {
	public InvalidName(String message) {
		super(message);
	}
}

class Employee {
	String firstName;
	String lastName;
	public Employee(String firstName, String lastName) throws InvalidName {
		if (firstName == null || firstName.trim().isEmpty()) {
			throw new InvalidName("First name cannot be blank");
		}
		if (lastName == null || lastName.trim().isEmpty()) {
			throw new InvalidName("Last name cannot be blank");
		}
		this.firstName = firstName;
		this.lastName = lastName;
}
public String getFullName() {
	return this.firstName + " " + this.lastName;
	}
}

public class EmployeeFullName {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First Name:");
			String fn=sc.nextLine();
			System.out.println("Enter Last Name:");
			String ln=sc.nextLine();
			Employee emp1 = new Employee(fn, ln);
			System.out.println("Employee full name: " + emp1.getFullName());
		} catch (InvalidName e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
