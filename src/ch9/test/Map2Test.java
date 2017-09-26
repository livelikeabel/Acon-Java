package ch9.test;

import java.util.HashMap;
import java.util.Set;

public class Map2Test {
	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);
		map1.put("d", 4);
		map1.put("d", 5);
		map1.put("e", 4);
		map1.put("f", 4);
		System.out.println(map1);
		System.out.println(map1.size());
		System.out.println(map1.get("c"));
		
		Object o1 = map1.clone();
		System.out.println(o1);
		HashMap map2 = (HashMap) o1;
		//map2.remove(key)
		
		Set set = map1.keySet();
		System.out.println(set);
		Object[] oArr = set.toArray();
		for(int i = 0; i < oArr.length; i++) {
			System.out.println(map1.get("a"));
		}
	}
}
