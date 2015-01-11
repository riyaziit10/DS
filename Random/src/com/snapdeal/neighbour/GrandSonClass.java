package com.snapdeal.neighbour;

import com.snapdeal.child.childSubClass;

public class GrandSonClass extends childSubClass{
   void display() {
	   System.out.println(x);
   }
	public static void main(String args[]) {
		int y[]= new int[10];
		
		System.out.println(new GrandSonClass().x);
	}
}
