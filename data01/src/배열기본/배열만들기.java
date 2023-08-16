package 배열기본;

import java.util.*;

//import java.lang.*; //System,String,Integer,Double

public class 배열만들기 {

	public static void main(String[] args) {
		// 배열 만들때,
		// 1. 이미 값을 알고 있는 경우
		int[] ages = { 60, 50, 30, 20, 10 };//5
		System.out.println(ages);
		//ages가 가르키고 있는 데이터들 프린트
		//1. for문
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}
		System.out.println();
		for (int x : ages) {
			System.out.print(x + " ");
		}
		System.out.println();
		//2. 함수를 사용!
		System.out.println(Arrays.toString(ages));
		//[60, 50, 30, 20, 10]
		//참조형 변수가 가르키고 있는 heap의 데이터를
		//string으로 만들어주는 함수
		
		// 2. 값을 모르고 있는 경우
		double[] weight = new double[5]; 
		//stack영역(weight변수:heap영역 주소)
		//         0,1,2,3,4,length
		//heap(무더기)영역(0,0,0,0,0,5)
		weight[0] = 55;
		weight[1] = 56;
		weight[2] = 57;
		weight[3] = 58;
		weight[4] = 59;
		

	}

}
