package liveclass;

public class DoublyLinkedListDemo {
	class Node{
		int data;
		Node previous;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	Node head, tail = null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		
		if(head == null) {
			head=tail=newNode;
			head.previous = null;
			head.next = null;
		}else {
			tail.next = newNode;
			newNode.previous = tail;
			tail= newNode;
			tail.next = null;
		}
	}
	
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		System.out.println("node of doubly list is: ");
		
		while(current !=null) {
			System.out.println(current.data + "lala");
			current = current.next;
		}
	}
	
	
}
