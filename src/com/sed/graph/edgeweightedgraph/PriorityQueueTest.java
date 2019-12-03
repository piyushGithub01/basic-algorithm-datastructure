package com.sed.graph.edgeweightedgraph;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueueTest pqt = new PriorityQueueTest();
		pqt.testPriorityQueue();
	}
	
	private void testPriorityQueue() {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(5);
		pq.add(10);
		pq.add(2);
		pq.add(1);
		pq.add(100);
		printQueue(pq);
		Integer lowest = pq.remove();
		System.out.println("lowest is " + lowest);
		lowest = pq.remove();
		System.out.println("lowest is " + lowest);
		pq.add(3);
		lowest = pq.remove();
		System.out.println("lowest is " + lowest);
		lowest = pq.remove();
		System.out.println("lowest is " + lowest);
		pq.add(25);
		lowest = pq.remove();
		System.out.println("lowest is " + lowest);
	}
	
	private void printQueue(PriorityQueue<Integer> pq) {
		Iterator it = pq.iterator();
		while(it.hasNext()) {
			System.out.print("" + it.next() + " ");
		}
		System.out.println();
	}
	
	

}
