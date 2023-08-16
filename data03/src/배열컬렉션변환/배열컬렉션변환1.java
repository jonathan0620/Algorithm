package 배열컬렉션변환;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열컬렉션변환1 {

	public static void main(String[] args) {
		Integer[] s = { 5, 2, 1, 9, 11, 15, 17 };

		//배열 오름차순 
		Arrays.sort(s);
		PrintAll.print(s);
		System.out.println("------------");
		
		String[] s2 = {"aaa", "ccc", "bbb"};
		List<String> list = Arrays.asList(s2);
		System.out.println(list);
		Collections.sort(list); //오름차순으로 정렬 
		System.out.println(list);
		Collections.reverse(list); //내림차순으로 정렬
		System.out.println(list);
		
		System.out.println("------------");
		//int[]은 asList() X
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int x : s) {
			list2.add(x);
		}
		System.out.println(list2);
		Collections.reverse(list2);
		System.out.println(list2);
		
		System.out.println("------------");
		//array --> list --> array
		String[] s3 = (String[])list.toArray(); //Object[]!!!
		System.out.println(Arrays.toString(s3));
		PrintAll.print(s);
//		Integer[] s4 = (Integer[])list2.toArray();
//		System.out.println(Arrays.toString(s4));
		
	}
}
