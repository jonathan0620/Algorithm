package 선형.큐;

import java.util.LinkedList;

public class 큐확인_백준카드2문제 {

	public static void main(String[] args) {
		int n = 6; //1~6
		
		//맨 앞에 있는거 하나 버리고,
		//그 다음 앞에 있는거 빼서 맨 뒤로 붙이자
		LinkedList<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			queue.add(i); 
		}
		System.out.println(queue);
		
		for (int i = 0; i <= queue.size(); i++) {
			queue.remove();
			queue.add(queue.remove());
			System.out.println(queue);
		}
		queue.remove();
		System.out.println(queue);
	}

}
