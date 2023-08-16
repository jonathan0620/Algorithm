package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 배열최소값구하기2_ {

	// 랜덤한 값 1000개를 발생시켜 배열에 넣어
	// 1. 최소값을 구하고, 순서도 수정!//0~999범위값!
	// 2. 최대값을 구해보세요.
	// 3. 최대값의 개수는??
	public static void main(String[] args) {
		int[] s = new int[1000]; //공간 
		//랜덤한 값 발생시키는 객체 생성
		Random r = new Random();
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(999) + 1; //0~998--> 1~999
			//r.nextInt(바운더리최대값보다 1큰값)
		}
		System.out.println(Arrays.toString(s));
		
		int min = s[0];
		for (int x : s) {
			if (x < min) {
				min = x;
			} // if
		} // for

		System.out.println("최소값>> " + min);
	}

}
