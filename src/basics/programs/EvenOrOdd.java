package basics.programs;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println("enter a digit");
		int n = new Scanner(System.in).nextInt();
		if (n % 2 == 0) {
			System.out.println(n +" is even");
		} else {
			System.out.println(n +" is odd");
		}
	}
}
