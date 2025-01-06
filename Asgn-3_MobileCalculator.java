/*Lab Exercise No:3
Write a Java program to based on the multilevel inheritance in Java*/

package com.cts.asgn_3;

class Calc {
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

	public int sub(int a, int b) {
		int result = a - b;
		return result;
	}
}

class LaptopCalc extends Calc {
	public int mod(int a, int b) {
		int result = a % b;
		return result;
	}
}

public class MobileCalculator extends LaptopCalc {
	public int square(int a) {
		return a * a;
	}

	public static void main(String[] args) {
		MobileCalculator mc = new MobileCalculator();
		System.out.println("Square: "+mc.square(2));
		System.out.println("Addition: "+mc.add(63, 48));
	}
}
