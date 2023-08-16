package 배열기본;

import java.util.*;

public class 배열랜덤데이터넣기2 {

	public static void main(String[] args) {
		
		int[] num = new int[3]; //5개 변수, num <- 주소, [0,0,0], length <- 3
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();//String --> int로 캐스팅을 자동으로 해줌.
		}
		System.out.println(Arrays.toString(num));
	}

}
