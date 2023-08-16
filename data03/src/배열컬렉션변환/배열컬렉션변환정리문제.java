package 배열컬렉션변환;

import java.util.Arrays;
import java.util.List;

public class 배열컬렉션변환정리문제 {

	public static void main(String[] args) {
		String[] 냉장고음식 = {"감자", "고구마", "우유", "감자", "양파"};
		PrintAll.print(냉장고음식);
		
		//1.감자가 들어가 있는 마지막 위치
		int lastIndex = 0;
		for (int i = 0; i < 냉장고음식.length; i++) {
			if(냉장고음식[i].equals("감자")) {
				lastIndex = i;
			}
		}
		System.out.println(lastIndex);
		
		List<String> list = Arrays.asList(냉장고음식);
		System.out.println(list.lastIndexOf("감자"));
		
		//2. 양파를 포함하고 있으면 출력을 다르게 
		if(list.contains("양파")) {
			System.out.println("양파는 안사도 된다.");
		}else {
			System.out.println("양파는 사야 된다.");
		}
		
		//3.  Arrays.asList()로 생성된 
		//   list는 검색/set이 아닌 기능은 제공X!!
		//   size()를 변화시키는 add, remove() X
		System.out.println(list.get(2));
		list.set(2, "춘식이 우유");
		System.out.println(list);
		//list.add("test");
		//list.remove(2);
		System.out.println(list);
		
		//4. 양파위치찾아서, "양파즙"으로 수정
		int index = list.indexOf("양파");
		list.set(index, "양파즙");
		System.out.println(list);
		
		//5. 다시 배열로 변경해보자.
		String[] result = (String[])list.toArray(); //Object[]
		PrintAll.print(result);
	}

}
