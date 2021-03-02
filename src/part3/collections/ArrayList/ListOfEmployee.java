package part3.collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListOfEmployee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Mahesh", 87876, "Mahesh@gmail.com");
		Employee e2 = new Employee(2, "Sasi", 8768768, "Sasi@gmail.com");
		Employee e3 = new Employee(3, "Naveen", 68768, "Naveen@gmail.com"); 
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println("size - "+ list.size());
		for (Object object : list) {
			Employee emp = (Employee) object;
			System.out.println(object);
		}
	}
}
