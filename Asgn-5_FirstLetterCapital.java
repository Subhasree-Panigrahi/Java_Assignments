//2) Write a Java program to convert all the words first letter into capital for given String? (String s=”java standard edition”)

package com.cts.asgn_5;

public class FirstLetterCapital {
	public static void main(String[] args) {
		String s="java standard edition";
		String[] words=s.split(" ");
		StringBuilder capStr=new StringBuilder();
		
		for (String word:words) {
			capStr.append(Character.toUpperCase(word.charAt(0)))
				  .append(word.substring(1))
				  .append(" ");
		}
		String result = capStr.toString().trim();
        System.out.println("Capitalized String: " + result);
	}
}
