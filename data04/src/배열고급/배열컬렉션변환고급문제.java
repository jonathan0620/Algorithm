package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 배열컬렉션변환고급문제 {

	public static void main(String[] args) {
		String[] s3 = { "박명수", "유재석", "김종국", "송지효", "하하" };
		//size를 변경하기 위해서는 새로운 ArrayList를 만드는 것이 좋겠다.
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(s3));
		
//		오름차순 정렬해서 프린트
		Collections.sort(list);
		System.out.println(list);
//		내림차순 정렬해서 프린트
		Collections.reverse(list);
		System.out.println(list);
//		글자수가 3미만인 사람 삭제후  프린트
		String find3 = "";
		for (String x : list) {
			if(x.length() < 3) {
				find3 = x;
			}
		}
		list.remove(find3);
		System.out.println(list);
		
		//여러개를 찾아라! 
		System.out.println(list.add("박명수"));
		System.out.println(list);
		//박명수이 있는 위치를 아래 세 경우로 풀어보세요.! 
		//데이터의 개수(렝쓰, 길이, 개수, 사이즈)
		//String- length(), 배열- length, collection- size()
		
		//1. 찾아서 프린트 String에 붙여서 프린트==> 2 4 
		String result = "";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("박명수")) {
				result += i + " "; //result = result + i;
			}
		}
		System.out.println(result);
		
		//2. 크기고정X 여러개 --> 컬렉션==> {2, 4}
		ArrayList<Integer> result2 = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("박명수")) {
				result2.add(i);
			}
		}
		System.out.println(result2);
		
		//3. 크기고정 여러개 --> 배열==> {2, 4}
		ArrayList<Integer> result4 = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("박명수")) {
				result4.add(i);
			}
		}
		int[] result3 = new int[result4.size()];
		for (int i = 0; i < result4.size(); i++) {
			result3[i] = result4.get(i);
		}
		//Integer[] result = (Integer[])result4.toArray();
		//String[] result = (String[])result4.toArray(); --Collection --> Array!!
		System.out.println(Arrays.toString(result3));
		
//		유재석을 찾아서 유재돌로 변경한 후 프린트
		int index = list.indexOf("유재석");
		System.out.println(index);
		list.set(index, "유재돌");
		System.out.println(list);
		
//		전체 목록에 “김종민"을 3번째에 삽입한 후 프린트 --> 0, 1, 2
		list.add(2, "김종민");
		System.out.println(list);
		
		int num = 29183;
		int find = 1; //위치! 
		
		//int --> String 
		//1) String.valueOf(int값)
		//2) int값 + ""
		String num2 = num + "";
		String find2 = find + "";
		int answer = -1;
		if(num2.contains(find2)) {
			answer = num2.indexOf(find2) + 1;
		}
	}
}
