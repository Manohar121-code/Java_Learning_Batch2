package basics.programs;

public class ShowDuplicatesFromArray {
	public static void main(String[] args) {
		int[] arr = {1,2,0,3,1,4,6,0,2,6,3,8,6,9,0,3,1,5,8,7,1};
		
		int[] countArr = new int[10];
		
//		3 4 2 3 1 1 3 1 2 1  //count
//		0 1 2 3 4 5 6 7 8 9  //index
		
		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			countArr[val] = countArr[val] + 1;
		}
		
		for (int i = 0; i < countArr.length; i++) {
			int count = countArr[i];
			if (count > 1) {
				System.out.println(i+" -> "+count);
			}
		}
		
	}
}
