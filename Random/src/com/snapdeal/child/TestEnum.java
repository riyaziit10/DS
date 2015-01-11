package com.snapdeal.child;
class Parent {
	int sum(int a , int b) {
		return a + b;
	}
}
public class TestEnum extends Parent{

	public static void main(String [] args) {
		short a = 7;
		System.out.println(new Parent().sum(a, 8));
	}
	
}
