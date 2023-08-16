package 컬렉션기본;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 콜렉션구분2 {

	public static void main(String[] args) {
		HashSet<String> tour = new HashSet<>();
		tour.add("일본");
		tour.add("미국");
		tour.add("제주도");
		tour.add("부산");
		tour.add("일본");
		System.out.println(tour);
		
		HashMap<String, String> room = new HashMap<String, String>();
		room.put("안방", "TV");
		room.put("거실", "쇼파");
		room.put("부엌", "냉장고");
		room.put("현관", "신발");
		System.out.println(room);
		System.out.println("현관>> " + room.get("현관"));
		room.put("거실", "책상");
		System.out.println(room);
		
		ArrayList list = new ArrayList();
		list.add("컬렉션");
		list.add("제너릭");
		list.add("프로그래머테스트구조");
		list.add("문제풀이1");
		list.add("문제풀이2"); //double --> Object
		//double d = (double)list.get(4);//double(작) <-- Object(큰)
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		list.set(1, "청소");
		System.out.println(list);
		
//		public class ArrayList{
//			Object o;
//			public void add(Object o) {
//				this.o = o;
//			}
//		}
		
		
		
		
		
		
		
		
		
		
	}

}
