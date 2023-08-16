package 정렬;

import java.util.Arrays;

public class SwapTest {

	public static void main(String[] args) {
		int[] num = { 6, 1, 2, 3, 5, 9 };
		//6,9를 swap
		//swap자리를 바꿀때는 temp임시변수가 필요
		//덮어써지는 데이터가 사라지기 때문에
		//사라지기 전에 백업하는 목적 
		int temp = num[0]; //6
		num[0] = num[5]; //{ 9, 1, 2, 3, 5, 9 }
		num[5] = temp; //{ 6, 1, 2, 3, 5, 9 }
		System.out.println(Arrays.toString(num));
	}
}
