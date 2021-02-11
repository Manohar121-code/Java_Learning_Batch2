package basics.programs;

public class CopyArray {
	public static void main(String[] args) {
		int[] arr = {17, 87, 29, 44, 18};
		int[] resArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			resArr[i] = arr[i];
		}
		printArray(resArr);
	}
	
	public static void printArray(int[] arr) {
		System.out.println("********");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("********");
	}
}
