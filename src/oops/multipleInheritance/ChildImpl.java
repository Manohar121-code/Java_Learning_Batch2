package oops.multipleInheritance;

public class ChildImpl implements IParent1, IParent2 {

	@Override
	public void m1() {
		System.out.println("ChildImpl m1() called");
	}

}
