package 검색;

import java.util.Arrays;

public class BinarySearchTest {

	public static void main(String[] args) {
		int[] n = {3,4,2,6,8,9,1};
		Arrays.sort(n);
		System.out.println(Arrays.binarySearch(n, 3));
		System.out.println(Arrays.binarySearch(n, 30));

	}

}
