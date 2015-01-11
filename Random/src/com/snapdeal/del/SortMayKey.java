package com.snapdeal.del;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMayKey {
	Integer a;
	
	public static void printMap(Map<String, String> map) {
		for(Map.Entry<String,String> entry: map.entrySet()) {
			System.out.println("Key :" + entry.getKey() + "value :" + entry.getValue());
		}
	}
	
	public static void main(String [] args) {
		SortMayKey b= new SortMayKey();
   System.out.println(b.a);
	
	Map<String, String> unsortMap = new HashMap<String, String>();
	unsortMap.put("Z", "z");
	unsortMap.put("B", "b");
	unsortMap.put("A", "a");
	unsortMap.put("C", "c");
	unsortMap.put("C", "c");
	unsortMap.put("D", "d");
	unsortMap.put("E", "e");
	unsortMap.put("Y", "y");
	unsortMap.put("N", "n");
	unsortMap.put("J", "j");
	unsortMap.put("M", "m");
	unsortMap.put("F", "f");

	
	printMap(unsortMap);
	
	Map<String, String> sortedMap = new TreeMap<String, String>(unsortMap);
	
	System.out.println("==================================");
	
	printMap(sortedMap);
	
	}
}
