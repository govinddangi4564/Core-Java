package CollectionFramwork;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue q = new LinkedList();
		q.add("One");
		q.add("Two");
		q.add("Three");
		q.add("Four");
		q.add(7410);
		q.add(852.3);
		q.add("Five");
		q.add("Six");
		
		System.out.println(q);
		
		System.out.println("Head : " + q.peek());
		System.out.println("Deleted : " + q.poll());
		System.out.println("Head : " + q.peek());
		System.out.println("Head : " + q.element());
		System.out.println("Removed : " + q.remove());
		System.out.println(q);
		q.clear();
		System.out.println("Removed : " + q.peek());
		System.out.println("Head : " + q.peek());
		System.out.println("Removed : " + q.poll());
//		System.out.println("Head : " + q.element());
//		System.out.println("Removed : " + q.remove());
		
		System.out.println("-------------------------------");
		
	}

}
