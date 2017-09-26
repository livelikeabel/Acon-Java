package ch10.test;

import java.util.HashMap;

public class Map1Test {
	
	public static void main(String[] args) {
		HashMap map = new HashMap(); //¹ü¿ë
		map.put(1, 1111);
		map.put("two", 222);
		map.put(3.3, 333);
		map.put(4, 4.4);
		map.put(1, 1111);
		System.out.println(map);
		System.out.println(map.get(3.3));
		System.out.println(map.size());
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("dfds", "df");
		
		
	}
}
