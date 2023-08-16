package 배열컬렉션변환;

public class CharInt로변환 {

	public static void main(String[] args) {
		//1. char --> int로 변경하는 방법
		//   '문자' - '0'
		//char c = '0' - '0';
		//char c = '1' - '0';
		char c = '1'; //49, '0' = 48
		System.out.println(c + 1);
		
		//2. char --> int로 변경하는 방법
		//Integer.parseInt(c + "")
		int i = Integer.parseInt(c + "");
		System.out.println(i + 1);
	}

}
