package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;
public class 배열자르기 {
	public static void main(String[] args) {
		Solution4 s = new Solution4();
		int[] arr = { 1, 2, 3, 4, 5 };
		int start = 2; //3
		int end = 4; //5
		int[] result2 = Arrays.copyOfRange(arr, start, end + 1);
		int[] result = s.solution(arr, start, end);
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(result2));
		
	}
}

class Solution4 {
	public int[] solution(int[] arr, int start, int end) {
		//2, 4 ==> 4 - 2 + 1 ==> 3개, {3,4,5} 
		//1, 4 ==> 4 - 1 + 1 ==> 4개, {2,3,4,5}
		int[] answer = new int[end - start + 1]; //size를 구해보세요!
		//{0,0,0}
//		for (int i = 0; i < answer.length; i++) {
//			answer[i] = arr[i + start]; 
//			//answer[0] = arr[0 + 2];
//			//answer[1] = arr[1 + 2];
//			//answer[2] = arr[2 + 2];
//		}
		
		int j = 0; //answer용 index
		for (int i = start; i <= end; i++) { //arr용 index
			answer[j] = arr[i];
			j++;
		}
		
		return answer;
	}
}
