package com.techlabs.list.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("A", 100);
		map.put("A", 101);
		map.put("B", 102);
		map.put(null, 99);
		map.put("C",null);
		System.out.println(map);
		
		Map<String,Integer> treemap = new TreeMap<String,Integer>();
		
		treemap.put("A", 100);
		treemap.put("A", 101);
		treemap.put("B", 102);
		System.out.println(treemap);
	}

}
