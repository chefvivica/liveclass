package liveclass;

import javax.crypto.spec.ChaCha20ParameterSpec;

import liveclass.LinkedListDemo.Node;

public class DemoMian {
	public static void main(String[] args) {
		LinkedListDemo linkedListDemo = new LinkedListDemo();
		linkedListDemo.head = new Node(101);
		Node second = new Node(201);
		Node third = new Node(202);
		linkedListDemo.head.next = second;
		second.next= third;
		linkedListDemo.display();
		
		
		DoublyLinkedListDemo doublyLinkedListDemo = new DoublyLinkedListDemo();
		doublyLinkedListDemo.addNode(101);
		doublyLinkedListDemo.addNode(201);
		doublyLinkedListDemo.addNode(301);
		doublyLinkedListDemo.addNode(401);
		doublyLinkedListDemo.addNode(501);
		
		doublyLinkedListDemo.display();
		
		
		CircularLinkedList circularLinkedList = new CircularLinkedList();
		circularLinkedList.addNode(1201);
		circularLinkedList.addNode(2301);
		circularLinkedList.addNode(3201);
	
		System.out.println("--------------------------------");
		circularLinkedList.display();
	}
}
