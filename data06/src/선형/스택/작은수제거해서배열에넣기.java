package 선형.스택;

import java.util.Arrays;
import java.util.Stack;

public class 작은수제거해서배열에넣기 {

	public static void main(String[] args) {
		int[] n = {10};
		//int[] n = { 4, 3, 2, 1 };
		//Arrays.sort(n); //{1,2,3,4}
		//역순으로 정렬을 해야한다면,
		//List로 옮겨서, 역순으로 정렬하고, Stack으로 옮기세요.!
		
		//==> 스택에 있는 것을 배열에 옮기기 
		//배열을 스택에 넣어보자.
		int[] answer = null;
		if(n.length > 1) {
			Stack<Integer> stack = new Stack<Integer>();
			for (int x: n) {
				stack.push(x);
			}
			System.out.println(stack);
			System.out.println(stack.peek()); //top을 확인
			//제일 작은 것이 맨위(top)에 들어가게 됨.
			System.out.println();
			//top을 버리자.!
			stack.pop(); //top부터 버려짐.!
			System.out.println("stack>> " + stack);
			//스택에 있는 것을 답안 배열에 옮기자.
			answer = new int[n.length - 1]; //{0,0,0} + length
			//int[] answer = new int[stack.size()];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = stack.get(i);
			}
			System.out.println("array>> " + Arrays.toString(answer));
			
			for (int i = answer.length -1 ; i >= 0; i--) {
				answer[i] = stack.pop();
			}
		}else {
			answer = new int[1]; 
			answer[0] = -1;
		}
			System.out.println("array2>> " + Arrays.toString(answer));
	}
}
