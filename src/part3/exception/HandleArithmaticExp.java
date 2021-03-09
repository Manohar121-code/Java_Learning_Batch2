package part3.exception;

import java.util.Scanner;

public class HandleArithmaticExp {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Scanner scr = new Scanner(System.in);
		System.out.println("enter first digit to divide");
		int n1 = scr.nextInt();
		System.out.println("enter second digit to divide");
		int n2 = scr.nextInt();
		try {
			int divRes = n1 / n2;
			System.out.println("Dividing result - " + divRes);
		} catch (NullPointerException e) {
			System.out.println("Arithmatic exception occurred - "+ e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception occurred");
		}
		System.out.println("Main Ended");
	}
}
