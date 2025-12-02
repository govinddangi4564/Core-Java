package CollectionFramwork;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
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
		
		PriorityQueue pq = new PriorityQueue();
		pq.add("My String");
		pq.add("Govind");
		pq.add("Sunil");
		pq.add("Gopi");
//		pq.add(989);
		pq.add("Gopal");
		pq.add("Sunami");
		pq.add("Aag");
		pq.add("Wings");
		
		System.out.println(pq);
		
		System.out.println("-------------------------------");
		
		ArrayDeque dq = new ArrayDeque();
		dq.add("Akshat");
		dq.add("Govind");
		dq.add("Rizwan");
		dq.add("Sandeep");
		dq.add(1432);
		dq.add("Chouhan");
		dq.add("Dangi");
		dq.add(7410);
		dq.add(989);
		dq.add("Gopi");
		System.out.println("First Removed : " + dq.removeFirst());
		System.out.println("Last Removed : " + dq.removeLast());
		
		System.out.println(dq);
		
	}

}
