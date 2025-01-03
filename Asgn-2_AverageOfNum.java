//Exercise 8: Write a Java method to compute the average of three numbers.

package cts.avg;
import java.util.Scanner;

public class AverageOfNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number1: ");
		int num1=sc.nextInt();
		System.out.println("Number2: ");
		int num2=sc.nextInt();
		System.out.println("Number3: ");
		int num3=sc.nextInt();
		System.out.println("average of three numbers is :"+((num1+num2+num3)/3));
	}
}
