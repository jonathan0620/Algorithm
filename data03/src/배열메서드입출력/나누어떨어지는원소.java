package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는원소 {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int[] numlist = { 10, 9, 5, 7 };
		int divisor = 5;
		int[] result = s.solution(numlist, divisor);
		System.out.println(Arrays.toString(result));
	}
}

class Solution3 {
	public int[] solution(int[] numlist, int divisor) {
		//1. divisor를 가지고 나누어지는 수의 리스트 
		//2. 그 리스트를 오름차순 정렬!
		//3. int[]로 리턴! 
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int x : numlist) {
			if (x % divisor == 0) {
				list.add(x);
			}
		}
		System.out.println(list);
		int[] answer = null;
		if (list.size() != 0) { //있는 경우 
			//------있는 경우 
			answer = new int[list.size()];
			//list에 있는 것 하나씩 꺼내서 answer배열에 넣어주자.!
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
			//정렬
			Arrays.sort(answer);
			
		} else { //없는 경우 
			//size()가 1인 배열을 만들어서
			answer = new int[1];
			//첫번째 index에 -1을 넣어주세요.
			answer[0] = -1;
		}
		
		//------없는 경우 
		//list에 하나도 없는 경우, answer[0] <== -1
		return answer;
	}
}
