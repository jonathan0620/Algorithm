package 문자열관련;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Stack;

public class 같은숫자는싫어2 {

	public static void main(String[] args) {
		int[] answer;
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		Stack<Integer> s = new Stack<Integer>();
		s.push(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (s.lastElement() != arr[i]) {
				s.push(arr[i]);
			}
		}
		System.out.println(s);
		
		answer = new int[s.size()];
		int i = s.size() - 1;
		try {
			while (s.lastElement() != null) {
				answer[i] = s.pop();
				i--;
			}
		} catch (NoSuchElementException e) {

		}
		System.out.println(Arrays.toString(answer));
	}
}
