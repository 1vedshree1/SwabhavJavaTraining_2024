package com.techlabs.list.test;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntryDemo {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "vedshree");
		map.put(2, "vedika");
		map.put(3, "Shruti");
		System.out.println(map);
		
		Set<Entry<Integer,String>> entries = map.entrySet();
		for(Entry<Integer,String> entry:entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
