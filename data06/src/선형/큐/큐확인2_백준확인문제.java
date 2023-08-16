package 선형.큐;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class 큐확인2_백준확인문제 {

	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		System.out.println(queue.peek());
		System.out.println(queue.get(queue.size() - 1));
		System.out.println(queue.size());
		System.out.println(queue.isEmpty()? 1: 0);
		try {
			System.out.println(queue.remove());
			System.out.println(queue.remove());
			System.out.println(queue.remove());
		} catch (Exception e) {
			System.out.println("-1");
		}
		System.out.println(queue.size());
		System.out.println(queue.isEmpty()? 1: 0);
		try {
			queue.remove();
		} catch (Exception e) {
			System.out.println("-1");
		}
		queue.add(3);
		System.out.println(queue.isEmpty()? 1: 0);
		System.out.println(queue.peek());
	}

}
