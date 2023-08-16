package 문자열관련;

public class Test {

	public static void main(String[] args) {
		String A = "hello";
		String B = "elloh";
		System.out.println(B+B);
		System.out.println((B+B).indexOf(A));
		char[] c = {'a', 'b', 'c'};
		
		String s = String.valueOf(c);
		System.out.println(s);
	}
}
