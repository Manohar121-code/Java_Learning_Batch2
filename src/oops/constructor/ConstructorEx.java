package oops.constructor;

public class ConstructorEx {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		
		Sample s2 = new Sample(25, "java");
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println("----------");
		System.out.println(s2.id);
		System.out.println(s2.name);
	}
}
