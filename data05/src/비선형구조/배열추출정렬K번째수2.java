package 비선형구조;

import java.util.Arrays;

public class 배열추출정렬K번째수2 {

	public static void main(String[] args) {
		int[] num = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, // commands[0], 2 ==> commands[0][0]
				{ 4, 4, 1 }, // commands[1], 1 ==> commands[1][2]
				{ 1, 7, 3 } // commands[2], 7 ==> commands[2][1]
		};
		System.out.println(commands.length); // 1차원배열의 개수

		int[] answer = new int[commands.length]; //{0,0,0}

		for (int i = 0; i < commands.length; i++) {// 0~2, i
			// commands[0]은 1차원 배열추출!
			// 답안배열 크기를 commands의 크기로 똑같이 만들어라!
			// 배열명, 시작인덱스, 끝인덱스+1
			int ii = commands[i][0]; //2
			int jj = commands[i][1]; //5
			int kk = commands[i][2]; //3
			int[] temp = Arrays.copyOfRange(num, ii - 1, jj);
			// 인덱스 1~4
			System.out.println(Arrays.toString(temp));
			Arrays.sort(temp);
			//System.out.println(temp[kk - 1]);
			answer[i] = temp[kk - 1];
			System.out.println(Arrays.toString(answer));
			System.out.println();
//			// 1차원 배열을 구분하기 위한 index가 필요 i
//			for (int j = 0; j < commands[i].length; j++) {// 0~2,j
//				System.out.print(commands[i][j]); // 00, 01, 02, 10, 11, 12, 20, 21, 22
//				// { 2, 5, 3 }
//				// 배열의 일부분을 추출할 때는 Arrays.copyOfRange()편하다.
//			}
		}
		
	}

}
