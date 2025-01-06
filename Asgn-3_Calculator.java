/*Lab Exercise No:2
Write a Java program to Implement single inheritance*/

package com.cts.asgn_3;

class MobileCalc {
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

	public int sub(int a, int b) {
		int result = a - b;
		return result;
	}
}

public class Calculator extends MobileCalc {
	public int square(int a, int b) {
		int result = a + b;
		return result;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int x=c.sub(10, 5);
		System.out.println("Subtraction: "+x);
		System.out.println("Addition: "+c.add(2, 5));

	}
}
