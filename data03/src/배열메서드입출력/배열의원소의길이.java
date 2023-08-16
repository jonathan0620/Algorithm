package 배열메서드입출력;

import java.util.Arrays;

public class 배열의원소의길이 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		String[] strlist = { "We", "are", "the", "world!" };
		int[] result = s.solution(strlist);
		System.out.println(Arrays.toString(result));
	}
}

class Solution2 {
	public int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length]; //{0,0,0,0}
		for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}
		return answer;
	}
}
