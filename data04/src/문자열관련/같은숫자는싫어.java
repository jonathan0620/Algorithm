package 문자열관련;

import java.util.ArrayList;
import java.util.HashSet;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		int[] answer = {};
		int[] arr = { 1,1,3,3,0,1,1};
//		HashSet<Integer> set = new HashSet<>();
//		for (int x : arr) {
//			set.add(x);
//		}
		//System.out.println(set);
		ArrayList<Integer> list = new ArrayList<Integer>();
		//넣을 기준은
		//바로 앞에서 넣지 않은 새로운 값이
		//출현하면 넣자.!
		//첫번째 배열의 값은 무조건 넣어주어야 함.
		//-1, 10
		//list.add(arr[0]);
//		int preNo = arr[0]; //앞에 값을 넣어줄 변수 하나 지정. 
//		for (int i = 0; i < arr.length; i++) {
//			if(preNo != arr[i]) {
//				list.add(arr[i]);
//			}
//			preNo = arr[i];
//		}
		int preNo = -1; //arr: 0~9
		for (int x : arr) {
			if(preNo != x ) {
			// -1       1
				list.add(x); //{1, 3, 0, 1}
			}	
			preNo = x; //preNo = 1
			System.out.println(x + " " + preNo);
		}
		
//		int preNum = 10;
//        for(int num : arr) {
//            if(preNum != num)
//                tempList.add(num);
//            preNum = num;
//        }     
		System.out.println(list);
	}
}
