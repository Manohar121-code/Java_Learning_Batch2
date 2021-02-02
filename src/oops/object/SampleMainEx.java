package oops.object;

public class SampleMainEx {
	public static void main(String[] args) {
		
		Sample s1 = new Sample();
		s1.i = 10;
		s1.s = "python";
		int i = s1.i;
		String s = s1.s;
		System.out.println(i);
		System.out.println(s);
		s1.m1();
		s1.m2();
		
		System.out.println("--------------");
		
		Sample s2 = new Sample();
		s2.i = 20;
		s2.s = "java";
		int i2 = s2.i;
		String ss = s2.s;
		System.out.println(i2);
		System.out.println(ss);
		s2.m1();
		s2.m2();
		
	}
}
