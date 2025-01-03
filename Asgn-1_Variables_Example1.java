package com.asgn2;
import java.util.Scanner;

public class Variables_Example1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number1: ");
		int num1=sc.nextInt();
		System.out.println("Number2: ");
		int num2=sc.nextInt();
		System.out.println("Number3: ");
		int num3=sc.nextInt();
		System.out.println("sum of three numbers is :"+(num1+num2+num3));
		System.out.println("average of three numbers is :"+((num1+num2+num3)/3));
		System.out.println("sub of three numbers is :"+(num1-num2-num3));
		System.out.println("multiplication of three numbers is :"+(num1*num2*num3));
	}
}
