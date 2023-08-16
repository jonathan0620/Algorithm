package 프로그래머스입문;

import java.util.Arrays;

public class 아이스아메리카노 {

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		int[] result = s.solution(15000);
		System.out.println(Arrays.toString(result));
	}
}

class Solution4 {
	public int[] solution(int money) {
		int[] answer = { 0, 0 };
		answer[0] = money / 5500; //살 수 있는 개수 
		answer[1] = money % 5500;
		return answer;
	}
}
