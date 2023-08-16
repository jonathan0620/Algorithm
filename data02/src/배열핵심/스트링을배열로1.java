package 배열핵심;

import java.util.Arrays;
import java.util.List;

public class 스트링을배열로1 {

	public static void main(String[] args) {
		String s = "국어, 영어, 수학, 컴퓨터";
		String[] s2 = s.split(", ");
		System.out.println(Arrays.toString(s2));
		//[국어, 영어, 수학, 컴퓨터], {국어, 영어, 수학, 컴퓨터}
		System.out.println(s2.length);
		int count = 0;
		for (int i = 0; i < s2.length; i++) {
			if (s2[i].equals("컴퓨터")) {
				System.out.println(i);
			}
			if (s2[i].length() < 3) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println("---------------");
		//배열에서 제공하지 않는 것은 list로 컨버팅시키자.!
		List<String> list = Arrays.asList(s2);
		System.out.println(list.indexOf("컴퓨터"));
	}
}
