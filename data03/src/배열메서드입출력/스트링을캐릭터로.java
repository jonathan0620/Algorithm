package 배열메서드입출력;

import java.util.Arrays;

public class 스트링을캐릭터로 {

	public static void main(String[] args) {
		String s = "bread";
		//charAt(index)
		System.out.println(s.charAt(0));
		//toCharArray()
		char[] c= s.toCharArray();
		System.out.println(Arrays.toString(c));
	}

}
