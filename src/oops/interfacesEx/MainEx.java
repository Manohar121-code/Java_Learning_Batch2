package oops.interfacesEx;

public class MainEx {
	public static void main(String[] args) {
		InterfaceA obj = new ChildImpl(); // up casting
		obj.test();
		obj.test2();
	}
}
