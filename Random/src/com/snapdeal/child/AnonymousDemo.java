package com.snapdeal.child;

public class AnonymousDemo {
	
	public void show(int [] arr) {
		
		System.out.println("Anonymous array");
		for(int i : arr)
			System.out.println(i);
	}

	public static void main(String[] args) {
		int [] array;
		array = new int[] {1,2,3,4,5};
		
		for(int i: array) {
			System.out.println(i);
		}
		
		new AnonymousDemo().show(new int[] {7,8,9,10});

	}

}
