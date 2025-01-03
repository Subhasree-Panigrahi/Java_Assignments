//Exercise 6: Write a Java program to print the sum (addition), multiply, subtract, divide 
//and remainder of two numbers.

package cts.print;
import java.util.Scanner;

public class ArithmeticOp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number1: ");
		int num1=sc.nextInt();
		System.out.println("Number2: ");
		int num2=sc.nextInt();
		System.out.println("sum of two numbers is :"+(num1+num2));
		System.out.println("average of two numbers is :"+((num1+num2)/2));
		System.out.println("sub of two numbers is :"+(num1-num2));
		System.out.println("multiplication of two numbers is :"+(num1*num2));
		System.out.println("Remainder of two numbers is :"+(num1%num2));
	}
}
