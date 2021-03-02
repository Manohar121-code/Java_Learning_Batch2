package part3.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(10);
		q.add(20);
		q.add(40);
		q.add(50);
		
		int size = q.size();
		System.out.println("size - "+size);
		
//		q.clear();
//		System.out.println("size - "+ q.size());
		
		System.out.println("is empty? - "+q.isEmpty());
		System.out.println("---------");
		for (Integer integer : q) {
			System.out.println(integer);
		}
		System.out.println("---------");
		
		Iterator<Integer> itr = q.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
		}
		
		System.out.println("---------");
		Integer peek = q.peek();
		System.out.println("peek element - "+peek);
		Integer poll = q.poll();
		System.out.println("polled element - "+ poll);
		
		Integer peek2 = q.peek();
		System.out.println("peek element after one time poll - "+peek2);
		
		System.out.println("------ POLLING ALL ELEMENTS FROM QUEUE ------");
		while (q.peek() != null) {
			Integer poll2 = q.poll();
			System.out.println(poll2);
		}
		
		System.out.println("is empty after polling all elements? - "+ q.isEmpty());
		
	}
}
