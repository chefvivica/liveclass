package liveclass;

public class LinkedListDemo {
	Node head;
	
	//constructor for node
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
		
	}
	
	public void display() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data + "\n");
			n = n.next;
		}
	}
	
}
