package oops.interfacesEx;

public class ChildImpl implements InterfaceA {

	@Override
	public void test() {
		System.out.println("Child Impl test() called");
	}

	@Override
	public void test2() {
		System.out.println("Child Impl test2() called");
	}

}
