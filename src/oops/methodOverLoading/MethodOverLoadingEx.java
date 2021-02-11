package oops.methodOverLoading;

public class MethodOverLoadingEx {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.test();
		
		int i = 10;
		s1.test(i);
		
		String s = "python";
		s1.test(s);
		
		s1.test(i, s);
		s1.test(s, i);
	}
}
