package part3.exception;

import java.util.Scanner;

public class ExceptionHandlingEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		Scanner scr = new Scanner(System.in);
		System.out.println("enter first digit");
		int n1 = scr.nextInt();
		System.out.println("enter second digit");
		int n2 = scr.nextInt();
		if (n2 == 0) {
			System.out.println("dividing number should not be a zero");
			return;
		}
		int res = n1 / n2;
		System.out.println("result - "+ res);
		System.out.println("Main ended");
	}
}
