package 배열응용;

public class 배열최소값구하기 {

	public static void main(String[] args) {
		int[] s = {90,80,20,60,70};
		int min = s[0];
		for (int x : s) {
			if (x < min) {
				min = x;
			} //if
		}//for

		System.out.println("최소값>> "+ min);
	}

}
