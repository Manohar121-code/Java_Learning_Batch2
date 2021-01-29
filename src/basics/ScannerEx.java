package basics;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		int i = 30;
		Scanner scr = new Scanner(System.in);
		System.out.println("enter a digit:");
		int nextInt = scr.nextInt();
		System.out.println("input provided: "+nextInt);
		
		System.out.println("enter name:");
		String name = scr.next();
		System.out.println("Hello "+ name);
	}
}
