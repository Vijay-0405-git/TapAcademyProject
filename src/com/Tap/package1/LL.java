package com.Tap.package1;

public class LL {
	private Node head;
	private Node tail;
	private int size;
	public LL(){
		this.size=0;
	}
	private class Node{
		private int value;
		private Node next;
		public Node(int value) {
			this.value=value;
		}
		public Node(int value,Node next) {
			this.value=value;
			this.next=next;
		}
	}
	
	public void insertFirst(int val) {
		Node node=new Node(val);
		node.next=head;
		head=node;
		if(tail==null) {
			tail=head;
		}
		size++;
	}
	public void reverseList() {
	    Node prev = null;
	    Node current = head;
	    Node next = null;
	    
	    tail = head; // After reversal, head becomes tail

	    while (current != null) {
	        next = current.next;   // Store next node
	        current.next = prev;   // Reverse the link
	        prev = current;        // Move prev one step ahead
	        current = next;        // Move current one step ahead
	    }

	    head = prev; // Update head to the last processed node
	}

	
	public void insertlast(int val) {
		if(head==null) {
			insertFirst(val);
			return;
		}
		Node node=new Node(val);
		tail.next=node;
		tail=node;
		size++;
	}
	
	
	public void display() {
		Node temp=head;
		System.out.print("Start-->");
		while(temp != null) {
			System.out.print(temp.value +"-->");
			temp=temp.next;
		}
		System.out.print("End");
		System.out.println();
	}
	public void insertAt(int n,int val) {
		if(n==0) {
			insertFirst(val);
			return;
		}
		Node temp=head;
		for(int i=1;i<n-1;i++) {
			temp=temp.next;
		}
		Node node=new Node(val,temp.next);
		temp.next=node;
		size++;
		
		
	}
	public void deleteFirst() {
		head=head.next;
	}
	public void deleteLast() {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
	}
	
	

}
