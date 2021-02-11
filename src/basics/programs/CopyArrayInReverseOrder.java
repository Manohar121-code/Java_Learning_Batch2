package basics.programs;

public class CopyArrayInReverseOrder {
	public static void main(String[] args) {
		int[] arr = {17, 87, 29, 44, 18};
		int[] resArr = new int[arr.length];
		int index = 0;
		for (int i = arr.length-1; i >= 0; i--) {
			resArr[index++] = arr[i];
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
