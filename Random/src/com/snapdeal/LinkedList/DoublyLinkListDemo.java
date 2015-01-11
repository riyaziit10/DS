package com.snapdeal.LinkedList;
class DLLNode {
	private int data;
	private DLLNode next;
	private DLLNode previous;
	
	public DLLNode(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public DLLNode getNext() {
		return next;
	}

	public void setNext(DLLNode next) {
		this.next = next;
	}

	public DLLNode getPrevious() {
		return previous;
	}

	public void setPrevious(DLLNode previous) {
		this.previous = previous;
	}

		
}

class DLL {
	private DLLNode head;
	void add(int data) {
		if(this.head == null){
			this.head = new DLLNode(data);
		} else {
			DLLNode iterator = head;
			while(iterator.getNext() != null)
				iterator = iterator.getNext();
			iterator.setNext(new DLLNode(data));
			iterator.getNext().setPrevious(iterator);
		}
	}
	
	void show() {
		System.out.println("Doubly link List");
		DLLNode iterator = head;
		while(iterator != null) {
			System.out.println(iterator.getData());
			iterator = iterator.getNext();
		}
	}
	
	void addAfter(int data) {
		DLLNode iterator = head;
		while(iterator != null && iterator.getData() < data)
			iterator = iterator.getNext();
		DLLNode previousNode= iterator.getPrevious();
		DLLNode newNode = new DLLNode(data);
		previousNode.setNext(newNode);
		newNode.setPrevious(previousNode);
		newNode.setNext(iterator);
		iterator.setPrevious(newNode);
		
	}
}
public class DoublyLinkListDemo {
	public static void main(String [] args) {
		DLL dll = new DLL();
		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.add(40);
		dll.show();
		
		dll.addAfter(25);
		dll.show();
	}

}
