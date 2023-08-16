package 비선형구조;

import java.util.HashMap;

public class HashMap확인문제과일 {

	public static void main(String[] args) {
		String[] s = { "apple", "banana", "apple", "banana", "melon", "apple" };
		HashMap<String, Integer> fruit = new HashMap<>();
		for (String x : s) {
			fruit.put(x, fruit.getOrDefault(x, 0) + 1);
		}
		System.out.println(fruit);
		
		int max = 0;
		String fruit_max = "";
		for (String key : fruit.keySet()) {
			if(fruit.get(key) > max) {
				max = fruit.get(key);
				fruit_max = key;
			}
		}
		System.out.println(fruit_max + " " + max);
		
		for (String key : fruit.keySet()) {
			System.out.print(key + " ");
		}
		
	}

}
