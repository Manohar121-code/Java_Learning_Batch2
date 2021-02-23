package oops.singletonClass;

public class MainEx {
	public static void main(String[] args) {
		Sample object1 = Sample.getObject();
		System.out.println(object1);
		
		Sample object2 = Sample.getObject();
		System.out.println(object2);
		
		Sample object3 = Sample.getObject();
		System.out.println(object3);
	}
}
