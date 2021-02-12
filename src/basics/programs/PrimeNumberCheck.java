package basics.programs;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 100");
		for (int n = 1; n <= 100; n++) {
			boolean isPrimeNumber = isPrimeNumber(n);
			if (isPrimeNumber) {
				System.out.println(n + " is a prime number");
			} else {
//				System.out.println(n + " is not a prime number");
			}
		}
	}

	private static boolean isPrimeNumber(int n) {
		if (n < 2) {
			return false;
		}
		//11
		//2 3 4 5(n/2)
		boolean isPrime = true;
		
		int limit = n/2;
		for (int i = 2; i <= limit; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
