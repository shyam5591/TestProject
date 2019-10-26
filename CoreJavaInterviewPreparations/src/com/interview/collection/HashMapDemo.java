package com.interview.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("x", 1);
		map.put("y", 2);
		map.put("z", 3);
		System.out.println(map);
		System.out.println(map.get("x"));
		
	}
}
