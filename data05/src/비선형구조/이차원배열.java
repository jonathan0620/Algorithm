package 비선형구조;

public class 이차원배열 {

	public static void main(String[] args) {
		int[][] num = new int[3][3];
		//{{0,0,0},  {0,0,0},  {0,0,0}}
		//2차원배열안에 들어가는 1차원의 길이를 3으로 다 통일시키는 경우
		//변수가 전체 몇 개 만들어졌을까요???
		//num, num.length (2개) ==> 14개  
		//int[3] {0,0,0} + length (4개) * 3개 ==> 12개 
		
		//2차원은 1차원배열을 모아놓은 것.!
		int[][] num2 = new int[3][]; //3은 1차원 배열의 개수, 0~2
		
		int[] num00 = {1,2,3};
		num2[0] = num00;
		int[] num10 = {1,2};
		num2[1] = num10;
		int[] num20 = {1,2,3,4,5};
		num2[2] = num20;
		
		for (int i = 0; i < num2.length; i++) {
			for (int j = 0; j < num2[i].length; j++) {
				System.out.print(num2[i][j]);
			}
			System.out.println();
		}
	}

}
