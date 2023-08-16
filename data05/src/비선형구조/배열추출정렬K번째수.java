package 비선형구조;

import java.util.Arrays;

public class 배열추출정렬K번째수 {

	public static void main(String[] args) {
		int[] num = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = {
				{2,5,3},
				{4,4,1},
				{1,7,3}
		};
		//답안배열 크기를 commands의 크기로 똑같이 만들어라!
		int[] answer = new int[commands.length];
		//배열의 일부분을 추출할 때는 Arrays.copyOfRange()편하다.
		//                       배열명, 시작인덱스, 끝인덱스+1 
		int[] temp = Arrays.copyOfRange(num, 1, 5);
		//                              인덱스 1~4
		System.out.println(Arrays.toString(temp));
		Arrays.sort(temp);
		System.out.println(temp[2]);
		answer[0] = temp[2];
		System.out.println(Arrays.toString(answer));
		
	}

}
