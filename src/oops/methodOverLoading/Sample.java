package oops.methodOverLoading;

public class Sample {

	public void test() {
		System.out.println("test() called");
	}
	
	public void test(int i) {
		System.out.println("test() called, i - "+ i);
	}
	
	public void test(String s) {
		System.out.println("test() called, s - "+ s);
	}
	
	public void test(int i, String s) {
		System.out.println("test() called, i - "+ i + " and s - "+ s);
	}
	
	public void test(String s, int i) {
		System.out.println("test() called, s - "+ s + " and i - "+ i);
	}
}
