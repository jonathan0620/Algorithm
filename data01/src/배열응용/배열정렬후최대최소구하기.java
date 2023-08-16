package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬후최대최소구하기 {

	public static void main(String[] args) {
		int[] s = new int[1000]; 
		Random r = new Random(100); //seed, 씨앗값!
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(999) + 1; //0~998--> 1~999
		}
		System.out.println(Arrays.toString(s));
		//정렬후 최소/최대 
		Arrays.sort(s); //오름차순 정렬, 파괴함수
		//<---> 비파괴함수, String num = "100"; Integer.parseInt(num); 
		System.out.println(Arrays.toString(s)); //출력해서 확인!
		System.out.println("최소값>> "+ s[0]);
		System.out.println("최대값>> "+ s[s.length - 1]);
	}

}
