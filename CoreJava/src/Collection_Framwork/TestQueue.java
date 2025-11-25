package Collection_Framwork;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue q = new LinkedList();
		
		q.add("Akshat");
		q.add("Govind");
		q.add("Rizwan");
		q.add("Sandeep");
		q.add(1432);
		q.add("Chouhan");
		q.add("Dangi");
		q.add(7410);
		q.add(989);
		q.add("Gopi");
		
		System.out.println(q);
		
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
		
		System.out.println(dq);
		
	}
}

/*  Queue --> FIFO
 * ------------------------------------------------------------------------------------------------------------------------------------------------------
 * 		Insertion 			     Extraction/Deletion						Traversal / Inspection							if Q is Empty
 * --------------------------------------------------------------------------------------------------------------------------------------------------------
 *		 add()							remove()									element()									throw Exception
 * 		 offer()						poll()										peek()										return null
 * 
 * */
