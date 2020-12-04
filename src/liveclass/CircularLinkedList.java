package liveclass;

public class CircularLinkedList {


		class Node{
			int data;
			Node next;
			
			public Node(int data) {
				this.data = data;
			}
		}
		
		Node head, tail = null;
		
		public void addNode(int data) {
			Node newNode = new Node(data);
			
			
			if(head == null) {
				head=newNode;
				tail=newNode;
				newNode.next = head;
			}else {
				tail.next = newNode;
				tail = newNode;
				tail.next = head;
			}
		}
		
		
		public void display() {
			Node current = head;
			if(head == null) {
				System.out.println("list is empty");
				
			}else {
				System.out.println("node of doubly list is: ");
				do {
					System.out.println(current.data );
					current = current.next;
				}while(current !=head) ;
			
				
			}
		
		}
		
		
	}


