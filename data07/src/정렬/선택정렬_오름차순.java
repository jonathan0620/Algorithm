package 정렬;

import java.util.Arrays;

public class 선택정렬_오름차순 {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 1, 2, 6 };
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length - 1; i++) {
			// 앞에 정렬된 것을 넣어줄 Index체크
			int min = i; // 최소값을 찾아서 넣을 위치 index ==> 0
			// 정렬되지 않은 데이터중에서 최소값을 찾아서
			// 앞에서 부터 채워주는 방식

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j; // 3
				}
			}
			System.out.println(min); // 위치를 찾았음 ==> 3
			int temp = arr[i];  //backup용
			arr[i] = arr[min];
			arr[min] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}
}
