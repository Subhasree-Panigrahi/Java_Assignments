//Exercise 7: Write a Java method to find the smallest number among three numbers.

package cts.smallest;
import java.util.Scanner;

public class SmallestNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number1: ");
		int n1=sc.nextInt();
		System.out.println("Number2: ");
		int n2=sc.nextInt();
		System.out.println("Number2: ");
		int n3=sc.nextInt();
		if (n1<n2 && n1<n3) {
			System.out.println(n1+" is smallest.");
		}
		else if (n2<n1 && n2<n3) {
			System.out.println(n2+" is smallest.");
		}
		else {
			System.out.println(n3+" is smallest.");
		}
	}
}
