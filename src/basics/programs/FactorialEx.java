package basics.programs;

public class FactorialEx {
	public static void main(String[] args) {
		int n = 15;
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		System.out.println("Factorial of "+ n +" is "+ result);
	}
}
