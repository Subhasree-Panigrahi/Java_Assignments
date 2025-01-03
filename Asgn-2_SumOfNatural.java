//Exercise 1: Create a class with a method which can calculate the sum of first n natural 
//numbers which are divisible by 3 or 5.
package cts.natural;
import java.util.Scanner;

public class SumOfNatural {
	public int calculateSum(int n) {
		int sum=0;
		for (int i=0;i<=n;i++) {
			if (i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		SumOfNatural son=new SumOfNatural();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int s=son.calculateSum(num);
		System.out.println("Sum of first "+num+ " natural numbers which are divisible by 3 or 5 is: "+s);
	}
}
