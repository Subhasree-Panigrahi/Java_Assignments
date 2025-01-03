//Exercise 2: Create a class with a method to find the difference between the sum of the 
//squares and the square of the sum of the first n natural numbers.
package cts.natural1;

import java.util.Scanner;
public class DiffNatural {
	
	public int calculateDifference(int n){
		int sum1=0;
		for (int i=1;i<=n;i++) {
			sum1 += i*i;
		}
		int sum2=0;
		for (int i=1;i<=n;i++) {
			sum2 += i;
		}
		int sqOfSum2 = sum2*sum2;
		int diff = sum1 - sqOfSum2;
		return diff;
	}
	public static void main(String[] args) {
		DiffNatural dn=new DiffNatural();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int d=dn.calculateDifference(num);
		System.out.println("Difference between the sum of the squares and the square of the sum of the first "+num+" natural numbers: "+d);
	}
}

