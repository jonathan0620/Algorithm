package 배열메서드입출력;

import java.util.Arrays;

public class 짝수홀수개수 {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] num_list = {1, 2, 3, 4, 5};
		int[] result = s.solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}

class Solution {
	//[1, 2, 3, 4, 5]	[2, 3]
    public int[] solution(int[] num_list) {
        int[] answer = new int[2]; //{0, 0}
        //answer[0] ==> 짝수개수 카운트 
        //answer[1] ==> 홀수개수 카운트 
        for (int x : num_list) {
			if(x % 2 == 0) {
				answer[0]++;
			}else {
				answer[1]++;
			}
		}
        return answer; //{2, 3}
    }
}
