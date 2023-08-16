package 선형.큐;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class 큐확인 {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<>();
		queue.add("추가1");
		queue.add("추가2");
		System.out.println(queue);
		System.out.println(queue.peek()); //front의 데이터를 확인 
		System.out.println(queue.isEmpty());
		System.out.println(queue.get(0));
		//queue.remove();
		System.out.println(queue);
		System.out.println(queue.peek());
		for (String x : queue) {
			System.out.println(x);
		}
		for (int i = 0; i < queue.size(); i++) {
			System.out.println(queue.get(i));
		}
		Iterator<String> iter = queue.iterator();
		for (int i = 0; i < queue.size(); i++) {
			if(iter.hasNext()) {
				System.out.println(iter.next());
			}
		}
	}

}
