package part3.exception;

public class FinallyEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		String s = null;
		try {
			int length = s.length();
			System.out.println("length - "+ length);
		} catch (NullPointerException npe) {
			System.out.println("NullPointerException occurred");
		} finally {
			System.out.println("I'll execute for sure");
		}
		System.out.println("Main ended");
	}
}
