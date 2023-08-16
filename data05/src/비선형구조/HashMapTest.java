package 비선형구조;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("apple", 0);
		map.put("melon", 0);
		map.put("ice", 2);
//		int value = map.get("ice") + 1;
//		map.put("ice", value);
		map.put("ice", map.getOrDefault("ice", 0) + 1);
		map.put("ice2", map.getOrDefault("ice2", 0) + 1);
		System.out.println(map);
		System.out.println(map.get("ice")); //map.get(key)
		
		Set keys = map.keySet(); //키목록 
		for (Object k : keys) {
			System.out.println(map.get(k));
		}
		
		Set<Entry<String, Integer>> entryList = map.entrySet(); //{키:값} --> Entry(엔트리)
		for (Entry<String, Integer> entry : entryList) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		
		
		
		
		
	}
}
