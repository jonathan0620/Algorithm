package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열함수로뒤집기 {

	public static void main(String[] args) {
		int[] num = {11, 55, 33, 22, 44};
		int[] answer = null;
		//List<int[]> list = Arrays.asList(num); //비파괴 
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int x : num) {
			list.add(x);
		}
		System.out.println(list);
		Collections.reverse(list); //파괴형! 
		System.out.println(list);
		Collections.sort(list); //파괴형! 
		System.out.println(list);
	}
}
