package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 배열최대값구하기 {

	// 랜덤한 값 1000개를 발생시켜 배열에 넣어
	// 1. 최소값을 구하고, 순서도 수정!//0~999범위값!
	// 2. 최대값을 구해보세요.
	// 3. 최대값의 개수는??
	public static void main(String[] args) {
		int[] s = new int[1000]; //공간 
		//랜덤한 값 발생시키는 객체 생성
		Random r = new Random(100); //seed, 씨앗값!
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(999) + 1; //0~998--> 1~999
			//r.nextInt(바운더리최대값보다 1큰값)
		}
		System.out.println(Arrays.toString(s));
		
		int max = s[0];
		for (int x : s) {
			if (x > max) {
				max = x;
			} // if
		} // for

		System.out.println("최대값>> " + max);
		
		//최대값이 몇 개인지 카운트해보자.!
		int count = 0; //반복문밖에 만들어야 한다.!
		for (int x : s) {
			if (x == max) {
				count++;
			}
		}
		System.out.println("최대값의 개수는 " + count + "개");
	}

}
