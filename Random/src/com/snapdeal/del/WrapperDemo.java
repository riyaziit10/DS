package com.snapdeal.del;

class Test {
	String invade(short s) {
		return "short";
	}
	
	String invade(short... s) {
		return "var short";
	}
}
public class WrapperDemo {
	

	public static void main(String args[]) {
		System.out.println(new Test().invade((short)7));
		
		final int a =10;
		
		 int a = 7;
		 
		short s = 10;
		 
		 
		 int z = s;
		
	}
}