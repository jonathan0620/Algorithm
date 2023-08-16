package 비선형구조;

import java.util.Arrays;

public class K번째큰수 {

	public static void main(String[] args) {
		int[] num = { 9, 4, 6, 7, 8, 1, 3, 2, 5 };
		//  1번째 : num[1 - 1] ==> num[0]
		//  9번째 : num[num.length - 1] ==> num[8]
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		//[1, 2, 3, 4, 5, 6, 7, 8, 9]
		System.out.println("1번째로 제일 큰수 " + num[num.length - 1]);
		System.out.println("2번째로 제일 큰수 " + num[num.length - 2]);
		System.out.println("3번째로 제일 큰수 " + num[num.length - 3]);
		int k = 6;
		System.out.println("k번째로 제일 큰수 " + num[num.length - k]);
	}

}
