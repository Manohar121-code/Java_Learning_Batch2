package basics.programs;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int n = 1531;
		
//		int total = 1^3 + 5^3 + 3^3;
//		n == total -> n is armstrong number
		
		for (int i = 1; i <= 1000; i++) {
			String s = String.valueOf(i);
			int len = s.length();
			int total = armStrongNumber(i, len);
			if (i == total) {
				System.out.println(i +" is a armStrong number");
			}
//			else {
//				System.out.println(n +" is not a armStrong number");
//			}
		}
	}
	
	private static int armStrongNumber(int n, int len) {
		int totalSum = 0;
		
		while (n > 0) {
			int lastDigit = n % 10;
			double pow = Math.pow(lastDigit, len);
			totalSum = totalSum + (int) pow;
			n = n / 10;
		}
		
		return totalSum;
	}
}
