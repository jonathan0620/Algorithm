package 컬렉션기본;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션구분 {

	public static void main(String[] args) {
		//1.중복허용X, 가방문제, 중복이 되면 안들어가버림
		//  HashSet
		HashSet<String> team = new HashSet<>();
		//String만 모아놓은 중복을 제거한 모음
		team.add("디자이너");
		System.out.println(team); //toString() 오버라이드
		team.add("프로그래머");
		System.out.println(team);
		team.add("DB관리자");
		System.out.println(team);
		team.add("DB관리자");
		System.out.println(team);
		
	//	int[] num = {11, 33, 55, 66, 11, 22, 33, ,,,,,,};
		
		//2. 냉장고(순서 + First Input First Output, FIFO, 선입선출)
		//   Queue구조, ==> LinkedList
		LinkedList<String> cold = new LinkedList<>();
		cold.add("상한우유");
		cold.add("싱싱우유");
		System.out.println(cold);
		cold.remove();
		System.out.println(cold);
		cold.remove(0);
		System.out.println(cold);
		
		//3. 대회(순서)
		ArrayList<String> ski = new ArrayList<String>();
		ski.add("박스키"); //0
		ski.add("송스키"); //1
		ski.add("김스키");
		ski.add("정스키");
		System.out.println(ski);
		ski.remove(1);
		System.out.println(ski);
		ski.add(0, "김연아");
		System.out.println(ski);
		System.out.println(ski.get(0));
		System.out.println(ski.indexOf("김연아"));
		ski.clear(); //파괴함수
		System.out.println(ski);
		
		//4. 휴대폰 key+value ==> HashMap
		HashMap<Integer, String> phone = new HashMap<>();
		phone.put(1, "엄마");
		//key+value: java(map), javascript(json), python(dictionary)
		System.out.println(phone);
		phone.put(2, "아빠");
		phone.put(3, "친구");
		phone.put(4, "동생");
		System.out.println(phone);
		System.out.println(phone.get(1));
		phone.put(3, "형");
		System.out.println(phone);
		//phone.getOrDefault(5, "팀원1");
		
		
		
		
		
		
		
		
		
		
	}
}
