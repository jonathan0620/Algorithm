package 정렬;

import java.util.Arrays;

public class 퀵정렬_오름차순 {
	public static void swap(int[] arr, int i, int min) {
		int temp = arr[i];  
		arr[i] = arr[min];
		arr[min] = temp;
	}
	
	public static void quickSort(int[] arr, int left, int right) {
		int pl = left; //0
		int pr = right; //6
		int pivot = arr[(left+right)/2];
		do {
			while (arr[pl] < pivot) {
				pl++;
			}
			while (arr[pr] > pivot) {
				pr--;
			}
			
			if(pl <= pr) {
				swap(arr, pl++, pr--);
			}
		} while (pl <= pr);
			if(left < pr) {
				quickSort(arr, left, pr);
			}
			if(pl < right) {
				quickSort(arr, pl, right);
			}
	}
	
	
	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 1, 2, 6 };
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length -1);
		System.out.println(Arrays.toString(arr));
	}
}
