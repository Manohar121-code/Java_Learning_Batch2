package oops.typeCasting;

public class PrimitiveTypeCasting {
	public static void main(String[] args) {
		int i = 10;
		long l = i; //widening
		
		System.out.println(i);
		System.out.println(l);
		
		long l2 = 181818;
		int i2 = (int) l2; //narrowing
		
		System.out.println(l2);
		System.out.println(i2);
		
		double d = 123.789;
		int i3 = (int) d;
		
		System.out.println(d);
		System.out.println(i3);
		
		int i4 = 123;
		double d2 = i4;
		
		System.out.println(i4);
		System.out.println(d2);
		
		float f1 = 12.56f;
		double d3 = f1;
		
		System.out.println(f1);
		System.out.println(d3);
		
		double d4 = 7879.878;
		float f2 = (float) d4;
		
		System.out.println(d4);
		System.out.println(f2);
		
	}
}
