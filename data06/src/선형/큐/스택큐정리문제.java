package 선형.큐;

import java.util.LinkedList;
import java.util.Stack;

public class 스택큐정리문제 {

	public static void main(String[] args) {
		String[] food = {
				"apple", "apple", "apple", 
				"banana", "banana", 
				"melon", "melon", 
				"berry"};
		Stack<String> stack = new Stack<>();
		stack.push(food[0]); //"apple"
		String clone = "";
		for (int i = 1; i < food.length; i++) {
			if(!food[i].equals(stack.peek())) {
				stack.push(food[i]);
			}else{
				if(!clone.contains(food[i])) {
					clone += food[i] + " ";
				}
			}
		}
		System.out.println(stack);
		System.out.println(clone);
		
		System.out.println("--------------------");
		String[] wait = {"홍길동", "김길동", "송길동", "정길동", "박길동", "이길동"};
		LinkedList<String> queue = new LinkedList<String>();
		for (String x : wait) {
			queue.add(x);
		}
		System.out.println(queue);
		queue.remove(); //"홍길동"
		queue.remove(); //"김길동"
		queue.add(queue.remove());//"송길동"
		System.out.println(queue);
		queue.remove(); //"정길동"
		queue.add(queue.remove());//"박길동"
		System.out.println(queue);
		System.out.println(queue.size());
	}

}
