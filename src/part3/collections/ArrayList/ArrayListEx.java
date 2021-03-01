package part3.collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list.isEmpty());
		list.add(50);
		list.add("java");
		list.add('@');
		list.add(new Object());
		list.add(16.38);
		
		int size = list.size();
		System.out.println(size);
		System.out.println("--------------");
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		System.out.println("--------------");
		list.add(2, 300);
		System.out.println(size);
		System.out.println("--------------");
		for (Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("--------------");
		
		System.out.println(list.isEmpty());
		System.out.println("-------------");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			Object next = itr.next();
			System.out.println(next);
		}
		
		System.out.println("--------------------");
		
		Object remove = list.remove(1);
		System.out.println("removed object at 1st index - "+ remove);
		
		System.out.println("--------------");
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		list.set(1, 400);
		
		System.out.println("--------------");
		for (Object obj : list) {
			System.out.println(obj);
		}
		
	}
}
