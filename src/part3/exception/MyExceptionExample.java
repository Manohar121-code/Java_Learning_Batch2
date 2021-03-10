package part3.exception;

public class MyExceptionExample {
	public static void main(String[] args) {
		System.out.println("Main started");
		String s = null;
		try {
			testLayer1(s);
		} catch (MyException e) {
			System.out.println("MyException occurred");
		}
		System.out.println("Main ended");
	}

	private static void testLayer1(String s) throws MyException {
		testLayer2(s);
	}

	private static void testLayer2(String s) throws MyException {
		if (s == null) {
			throw new MyException();
		}
	}
}
