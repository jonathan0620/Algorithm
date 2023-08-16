package 정렬;

import java.util.Arrays;

public class SwapTest3_함수만들기연습 {

	public static void print(String[] str) {
		System.out.println(Arrays.toString(str));
		//입력으로 받은 배열이 가르키고 있는 값들을
		//String으로 만들어서 프린트하는 기능 
	}
	
	public static void swap(String[] str, int idx1, int idx2) {
		//임시변수를 만들어라. 덮어써서 없어질 값을 백업해놓으세요.
		String temp = str[idx1]; //"햄버거"
		str[idx1] = str[idx2];
		str[idx2] = temp;
	}
	public static void main(String[] args) {
		String[] str = {"햄버거", "샌드위치", "커피"};
		print(str);
		//"str배열"에 있는 것 중에서 "0번째 위치"와 "1번째 위치"를 바꾸어라.
		swap(str, 0, 1);
		print(str);
	}
}
