package com.snapdeal.LinkedList;

class ListNode{
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		this.setData(data);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}
	
}

class LinkList {
	ListNode head;
	public void add(ListNode node) {
         if(this.head == null) {
        	 this.head = node;
        	 return;		
         } else {
        	 ListNode iterator = head;
        	 while(iterator.getNext() != null)
        		 iterator = iterator.getNext();
        	 iterator.setNext(node);
         }
    }
	
	public void show() {
		ListNode iterator = head;
		while(iterator.getNext() != null) {
			System.out.println(iterator.getData());
			iterator = iterator.getNext();
		}
	}
}
public  class LinkListDemo {
public static void main(String[] args){
	LinkList ll = new LinkList();
	ll.add(new ListNode(10));
	ll.add(new ListNode(20));
	ll.add(new ListNode(30));
	ll.add(new ListNode(40));
	ll.show();
	}
}
