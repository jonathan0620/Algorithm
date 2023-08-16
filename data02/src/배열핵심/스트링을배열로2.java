package 배열핵심;

import java.util.Arrays;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		//스트링을 배열로 만들 수 있음.
		//"감자,고구마,감자,감자,고구마" ==> String[]
		//"김수안무동방석차"; ==> char[]
		String s = "감자,고구마,감자,감자,고구마";
		String[] s2 = s.split(","); //split(분리시킬기준)
		System.out.println(Arrays.toString(s2));
		
		int count = 0;
		for (String x : s2) {
			if(x.equals("감자")) {
				count++;
			}
		}
		System.out.println("감자의 개수>> " + count);
		System.out.println("============");
		String s3 = "김수안무동방석차";
		char[] c = s3.toCharArray(); 
		System.out.println(Arrays.toString(c));
		int count2 = 0;
		//김, 동, 석의 개수 카운트!해서 프린트!
		for (char x : c) {
			if (x == '김' || x == '동' || x == '석') {
				count2++;
			}
		}
		System.out.println("김, 동, 석의 개수>> " + count2);
		System.out.println("============");

		//String의 일부 char를 추출할 수 있음.
		char c2= s3.charAt(0); //index를 주고 특정한 char를 추출 가능!
		System.out.println("이 사람의 성은 " + c2);
	}

}
