package com.collectionpractice;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfacePractice {
public static void main(String args[]) {
	Queue< String> queue = new LinkedList();
	//Queue< String> queue = new PriorityQueue<>();
	queue.add("Sangeetha");
	queue.add("Ajay");
	queue.add("Zen");
	queue.add("Harsha");
	
	
	System.out.println("Full queue-->"+queue);
	queue.add(null);//accepts null
	System.out.println("Adding null-->"+queue);
	queue.add("Harsha");//accepts duplicates
	System.out.println("Adding duplicate-->"+queue);
	
	
	System.out.println("Remove-->"+queue.remove());
	System.out.println("After removing-->"+queue);
	System.out.println("Poll-->"+queue.poll());
	System.out.println("After polling-->"+queue);
	System.out.println("Peek-->"+queue.peek());
	System.out.println("After peeking-->"+queue);
	
	Deque<String> deque = new LinkedList<>(queue);
	System.out.println("Pop-->"+deque.pop());
	System.out.println("After poping-->"+deque);
	
	deque.push("Murari");
	System.out.println("After pushing-->"+deque);
}
}
