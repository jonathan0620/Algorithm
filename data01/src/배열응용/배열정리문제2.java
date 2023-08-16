package 배열응용;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열정리문제2 {

	public static void main(String[] args) {
//		int[] num = new int[5];
//		//55 66 77 22 33
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < num.length; i++) {
//			num[i] = sc.nextInt();
//		}
//		System.out.println(Arrays.toString(num));
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
//		System.out.println(num[0]);

//		int[] num2 = new int[20];
//		Random r = new Random();
//		for (int i = 0; i < num2.length; i++) {
//			num2[i] = r.nextInt(900);
//		}
//		System.out.println(Arrays.toString(num2));
//		Arrays.sort(num2);
//		System.out.println(Arrays.toString(num2));
//		System.out.println(num2[num2.length - 1]);

//		String s1 = "참좋다";
//		String s2 = "진짜좋다";
//		System.out.println(s1 == s2);//주소가 동일 
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.length());
//		//다르다는 전제!
//		if (s1.length() > s2.length()) {
//			System.out.println("s1이 글자수가 많다. ");
//		} else {
//			System.out.println("s2가 글자수가 많다. ");
//		}
		
//		String s3 = "나는 진짜 java programmer가 되었어";
//		String s4 = s3.substring(6, 21); //java programmer
//		System.out.println(s4.toUpperCase());
		
//		String s4 = "2056521";
//		char c1 = s4.charAt(0); //'2'
//		if (c1 == '2' || c1 == '4') { //==비교연산자로 값을 비교할때는 기본형만 가능!
//			System.out.println("여자");
//		} else {
//			System.out.println("남자");
//		}
		
		String s5 = " [  20, 10, 40, 50, 30]";
		String s6 = s5.replace("[", "");
		s6 = s6.replace("]", "");
		s6 = s6.trim();
		System.out.println(s6);
		String[] s7 = s6.split(", "); //{"10","20", "30", ..}
		System.out.println(Arrays.toString(s7));
		
		int sum = 0;
		for (int i = 0; i < s7.length; i++) {
			sum += Integer.parseInt(s7[i]);
			//sum = sum + Integer.parseInt(s7[i]); 
		}
		System.out.println(sum);
		
		int[] num3 = new int[s7.length];
		for (int i = 0; i < num3.length; i++) {
			num3[i] = Integer.parseInt(s7[i]);
		}
		System.out.println(Arrays.toString(num3));
		Arrays.sort(num3);
		System.out.println(Arrays.toString(num3));
	}
}
