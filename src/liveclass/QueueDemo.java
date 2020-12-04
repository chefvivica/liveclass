package liveclass;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("1");
		pq.add("2");
		pq.add("3");
		pq.add("4");
		pq.add("5");
		pq.add("6");
		
		System.out.println("element" + pq.element());
		
		Iterator<String> itr1 = pq.iterator();
		
		while(itr1.hasNext()) {
			System.out.println("itr1 next "+itr1.next());
		}
		
		pq.remove();
		pq.poll();
	
		Iterator<String> itr2 = pq.iterator();
		
		while(itr2.hasNext()) {
			System.out.println("itr2 next " + itr2.next());
		}
		
	}
}
