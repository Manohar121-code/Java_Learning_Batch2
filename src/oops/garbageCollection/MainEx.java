package oops.garbageCollection;

public class MainEx {
	public static void main(String[] args) {
		Sample obj = new Sample();
		obj = null;
		
		Sample obj2 = new Sample();
		obj2 = new Sample();
		
		Sample obj3 = new Sample();
		Sample temp = obj3;
		obj3 = null;
		
		System.gc();
		Runtime.getRuntime().gc();
	}
}
