//Exercise 3: Create a method to check if a number is an increasing number

package cts.increasing;
import java.util.Scanner;
public class IncreasingNumber {
	
	public boolean checkNumber(int number) {
		String num = Integer.toString(number);
		for (int i=0;i<num.length()-1;i++) {
			if (num.charAt(i)>num.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		IncreasingNumber in=new IncreasingNumber();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean res=in.checkNumber(n);
		System.out.println("Is "+n+ " an increasing number? "+res);
	}
}
