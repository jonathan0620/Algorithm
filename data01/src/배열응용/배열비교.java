package 배열응용;

import java.util.Arrays;

public class 배열비교 {

	public static void main(String[] args) {
		int[] n1 = { 100, 20, 30 }; //1학기 성적 
		//int[] n2 = n1; //2학기 성적  //얕은 복사
		int[] n2 = n1.clone(); //깊은 복사
		n2[0] = 90; //2학기 성적 중에서 첫번째 과목만 90점!
		System.out.println("1학기 >> " + Arrays.toString(n1)); 
		System.out.println("2학기 >> " + Arrays.toString(n2));
		
		System.out.println(n1 == n2); //주소비교 
		System.out.println(Arrays.equals(n1, n2)); //값들이 비교 
		
	}
}
