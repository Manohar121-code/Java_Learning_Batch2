package oops.getterAndSetter;

public class GetterAndSetterEx {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.setId(10);
		int id = s1.getId();
		System.out.println(id);
		
		s1.setName("golang");
		String name = s1.getName();
		System.out.println(name);
		
		int i = 10;
		System.out.println(i);
		
		System.out.println(s1);
	}
}
