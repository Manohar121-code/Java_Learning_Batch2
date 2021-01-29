package basics.array;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		int i;
		i = 10;
		
//		int arr2[] = new int[5];
//		int[] arr3 = {10, 20, 30, 40, 50};
		
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		Scanner scr = new Scanner(System.in);
		System.out.println("enter length of an array:");
		int len = scr.nextInt();
		int[] arr = new int[len];
		
		for (int index = 0; index < arr.length; index++) {
			System.out.println("enter val for index - "+ index);
			int val = scr.nextInt();
			arr[index] = val;
		}
		
//		int first = arr[1];
//		System.out.println(first);
		System.out.println("-----------");
		
		for (int index = 0; index < arr.length; index++) {
			int k = arr[index];
			System.out.println(k);
		}
	}
}
