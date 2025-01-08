/*Exercise Objective(s):Overloading
Exercise:Create a class called Calculator which has 4 different methods add, diff, mul and div which
accepts two numbers as parameters. Overload the methods such that the parameters can be
of the following pattern.
1. Both are of int data type.
2. Both are of double data type.
3. First parameter is of int data type and second parameter is of double data type.
4. First parameter is of double data type and second parameter is of int data type.
Create anobject to access these methods and invoke these methods with different type of
numbers and display the result in the corresponding methods.*/

package com.cts.shapes;
class Calculator {
 
	public int add(int a, int b) {
		return a + b;
	}
 
	public double add(double a, double b) {
		return a + b;
	}
 
	public double add(int a, double b) {
		return a + b;
	}
 
	public double add(double a, int b) {
		return a + b;
	}
 
	public int diff(int a, int b) {
		return a - b;
	}
 
	public double diff(double a, double b) {
	return a - b;
	}
	
	public double diff(int a, double b) {
		return a - b;
	}
 
	public double diff(double a, int b) {
		return a - b;
	}
 
	public int mul(int a, int b) {
		return a * b;
	}
 
	public double mul(double a, double b) {
		return a * b;
	}
 
	public double mul(int a, double b) {
		return a * b;
	}
 
	public double mul(double a, int b) {
		return a * b;
	}
	
	public int div(int a, int b) {
		return a / b;
	}
 
	public double div(double a, double b) {
	return a / b;
	}
 
	public double div(int a, double b) {
		return a / b;
	}
 
	public double div(double a, int b) {
		return a / b;
	}
}
 
public class Calculator1 {
	public static void main(String[] args) {
	Calculator calculator = new Calculator();
	System.out.println("Addition:");
	System.out.println("int + int: " + calculator.add(2, 4));
	System.out.println("double + double: " + calculator.add(5.8, 6.2));
	System.out.println("int + double: " + calculator.add(9, 8.2));
	System.out.println("double + int: " + calculator.add(3.5, 7));
 
	System.out.println("\nSubtraction:");
	System.out.println("int - int: " + calculator.diff(2, 4));
	System.out.println("double - double: " + calculator.diff(5.8, 6.2));
	System.out.println("int - double: " + calculator.diff(9, 8.2));
	System.out.println("double - int: " + calculator.diff(3.5, 7));
 
	System.out.println("\nMultiplication:");
	System.out.println("int * int: " + calculator.mul(2, 4));
	System.out.println("double * double: " + calculator.mul(5.8, 6.2));
	System.out.println("int * double: " + calculator.mul(9, 8.2));
	System.out.println("double * int: " + calculator.mul(3.5, 7));
 
	System.out.println("\nDivision:");
	System.out.println("int / int: " + calculator.div(2, 4));
	System.out.println("double / double: " + calculator.div(5.8, 6.2));
	System.out.println("int / double: " + calculator.div(9, 8.2));
	System.out.println("double / int: " + calculator.div(3.5, 7));
	}
}
