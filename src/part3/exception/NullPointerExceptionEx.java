package part3.exception;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		String s = null;
		String upperCaseString = convertToUpperCase(s);
		System.out.println("Upper case string - "+ upperCaseString);
	}

	private static String convertToUpperCase(String s) {
		if (s == null) {
			System.out.println("ERROR - input string cannot be null");
			return s;
		}
		String upperCase = s.toUpperCase();
		return upperCase;
	}
}
