/*Exercise 3: Create an Exception class named as “EmployeeException”(User defined Exception) in a package named as “com.demo.exception” and throw 
an exception if salary of an employee is below than 3000. Use Exception Handling mechanism to handle exception properly*/

package com.demo.exception;

import java.util.Scanner;
class InvalidSalary extends Exception{
	public InvalidSalary(String message) {
		super(message);
	}
}

public class EmployeeException {
	public static void main(String[] args) throws InvalidSalary{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary");
		double sal=sc.nextDouble();
		if (sal>3000) {
			System.out.println("Salary:"+sal);
		}
		else {
			throw new InvalidSalary("Enter valid salary");
		}
	}
}
