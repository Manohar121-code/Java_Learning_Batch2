package basics.programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("enter a string");
		String s = new Scanner(System.in).next();
		String reverse = reverse(s);
		if (s.equals(reverse)) {
			System.out.println(s +" is a palindrome");
		} else {
			System.out.println(s +" is not a palindrome");
		}
	}
	
	public static String reverse(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char charAt = s.charAt(i);
			rev = rev + charAt;
		}
		return rev;
	} 
}
