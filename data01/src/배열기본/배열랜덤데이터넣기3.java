package 배열기본;

import java.util.*;

public class 배열랜덤데이터넣기3 {

	public static void main(String[] args) {
		
		double[] num = new double[5]; //{0,0,0,0,0}//5개 변수, 입력해서 집어 넣을 저장공간 5개 준비!
		Scanner sc = new Scanner(System.in); //입력하는 부품 객체 생성 
		
		//입력받아서 저장공간에 넣음.
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextDouble();//String --> double로 캐스팅을 자동으로 해줌.
		}
		//{11.1, 22.2, 33.3, 22.2, 55.5}
		
		//출력하는 부분 
		System.out.println(Arrays.toString(num));
		
		//찾는 부분
		//for문? 함수??
		for (int i = 0; i < num.length; i++) {
			if(num[i] == 22.2) {
				System.out.println(i);
			}
			if(num[i] == 33.3) {
				System.out.println(i);
			}
		}
		
		//카운트!! --> 누적!
		int count = 0; //누적시킬 목적으로 count, sum변수들은 반복문 밖에서 만들어주어야함.
		for (double d : num) {
			if(d == 22.2) {
				count++;
			}
		}
		System.out.println("22.2의 개수>> " + count);
		
	}

}
