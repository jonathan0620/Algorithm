package 배열컬렉션변환;

import java.util.Arrays;

public class 숫자찾기 {

	public static void main(String[] args) {
		int num = 29183;
		int find = 1;
		
		String s = String.valueOf(num);
		System.out.println(s);
		char[] c = s.toCharArray();
		System.out.println(Arrays.toString(c));
		int answer = 0;
		for (int i = 0; i < c.length; i++) {
			if((c[i] - '0') == find) {
				answer = i;
			}
		}
		System.out.println(answer + 1);
	}

}
