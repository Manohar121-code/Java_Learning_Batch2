package part3.exception;

public class CheckedExpEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		String s = null;
		try {
			testLayer1(s);
		} catch (Exception e) {
			System.out.println("ëxception occurred");
		}
		System.out.println("Main ended");
	}

	private static void testLayer1(String s) throws Exception {
		testLayer2(s);
	}

	private static void testLayer2(String s) throws Exception {
		if (s == null) {
			throw new Exception();
		}
	}
}
