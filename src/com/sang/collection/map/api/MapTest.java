package com.sang.collection.map.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "AAAAA");
		hashMap.put(2, null);
		hashMap.put(1, "A");
		
		hashMap.putIfAbsent(3, "CCCC");
		hashMap.putIfAbsent(3, "DDDD");
		hashMap.putIfAbsent(2, "BBBB");
		
		hashMap.remove(2);
		hashMap.remove(1,"1");
		hashMap.remove(1,"A");
		
		hashMap.replace(3, "CCCCCCCCC");
		hashMap.replace(3, "CCCCCCCCC","C");
		hashMap.replaceAll((k,v)->v+"Bang");
		
		hashMap.compute(3, (k,v)->v+"Pizza");
		hashMap.computeIfPresent(3,(k,v)->v+"Veg");
		hashMap.computeIfAbsent(3, v->v+"Big");
		
		System.out.println(hashMap.containsKey(3));
		System.out.println(hashMap.containsValue("CBangPizzaVeg"));
		
		System.out.println(hashMap.get(3));
		System.out.println(hashMap.getOrDefault(2, "Sangeetha"));
		
		hashMap.merge(3, "Ajay", (n,v)->n+v);
		
		print(hashMap);
		
		Set<Integer> set = hashMap.keySet();
		System.out.println(set);
		
		Collection<String> arrList =  hashMap.values();
		System.out.println(arrList);
		
		Set<Map.Entry<Integer, String>> set2 = hashMap.entrySet();
		System.out.println(set2);
		
	}
	
	public static void print(Map hashMAp) {
		
		hashMAp.forEach((k,v)->System.out.println(k+"-"+v));
	}
}
