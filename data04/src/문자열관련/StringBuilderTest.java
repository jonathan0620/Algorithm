package 문자열관련;

import java.util.Random;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("오늘 월요일이야");
		sb.insert(2, " 진짜" );
		System.out.println(sb.length());
		System.out.println(sb);
		sb.replace(0, 2, "내일");
		System.out.println(sb);
		sb.delete(0, 2);
		System.out.println(sb);
		sb.setCharAt(0, '와');
		System.out.println(sb);
		sb.insert(1, " " );
		System.out.println(sb);
		String sub = sb.substring(5);
		System.out.println(sub);
		StringBuilder rev = sb.reverse();
		System.out.println(rev);
		
//		Random r = new Random();
//		r.nextInt(100);
		String result = sb.toString();
		System.out.println(result);
	}
}
