package com.Arrays;

import java.util.HashMap;
import java.util.Map;

public class HashMapArray {
	
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Suresh");
		hm.put(2, "Kanna");
		hm.put(2, "Kanna");
		
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " "+m.getValue());
		}
		
		hm.putIfAbsent(3, "chitti");
		hm.put(4, "Bangaram");
		
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " "+m.getValue());
		}
		
		
		
	}
	


}