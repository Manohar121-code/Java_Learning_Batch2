package oops.privateStaticFinal;

public class Child extends Parent {
	public void test() {
		System.out.println("Child test() called");
	}
	
	public void test3() {
		System.out.println("Child test3() called");
	}
	
//	public final void finalMethod() {
//		System.out.println("Child finalMethod() called");
//	}
	
	public static void staticMethod() {
		System.out.println("Child staticMethod() called");
	}
}
