package 컬렉션기본;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class 중복제거처리 {

	public static void main(String[] args) {
		//랜덤을 이용해서
		//seed 55
		Random r = new Random(55);
	
		//int[]에 1000개 랜덤값 만들어서 넣어보세요.
		int[] num = new int[1000];
		
		//랜덤한 값을 1000번 생성해서 num에 하나씩 넣습니다.
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);//0~999
		}
		
		System.out.println(Arrays.toString(num));
		
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}
		System.out.println("중복이 제거된 개수>> " + set.size());
		System.out.println(set);
	}
}
