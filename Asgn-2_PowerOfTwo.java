//Exercise 4: Create a method to check if a number is a power of two or not

package cts.checknum;
import java.util.Scanner;

public class PowerOfTwo {
	public boolean checkNumber(int n) {
		if (n>0 && (n&(n-1))==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		PowerOfTwo pot=new PowerOfTwo();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean res=pot.checkNumber(n);
		System.out.println("Is "+n+ " a power of two? "+res);
	}
}
