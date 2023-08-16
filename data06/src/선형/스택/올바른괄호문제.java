package 선형.스택;

import java.util.Stack;

public class 올바른괄호문제 {

	public static void main(String[] args) {
		String s = "()()()"; //true
		String s2 = "()(("; //false
		//Stack에 (이면 넣고, (가 아니면 빼자.!
		//올바른 괄호만 있다면 stack에는 아무것도 남지 않을 것.
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s2.length(); i++) {
			if(s2.charAt(i) == '(') {
				stack.push('(');
			}else { //')'
				stack.pop();
			}
		}//for
		boolean answer = false;
		System.out.println(stack.empty());
		answer = stack.empty();
		System.out.println("정답은 " + answer);
	}

}
