package oops.encapsulation;

public class MainEx {
	public static void main(String[] args) {
		Sample obj = new Sample(1, "person1");
		int empId = obj.getEmpId();
		String empName = obj.getEmpName();
		
		System.out.println(empId);
		System.out.println(empName);
	}
}
