package basics.methods;

public class ArithmeticOperationsEx {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int sum = sum(i, j);
		System.out.println("sum - "+sum);
	}
	
	public static int sum(int i, int j) {
		System.out.println("sum() called");
		int sum = i+j;
		return sum;
	}
}
