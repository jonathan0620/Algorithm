package 프로그래머스입문;

public class 배열의평균값 {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		double result = s.solution(numbers);
		System.out.println(result);
	}
}



class Solution3 {
	public double solution(int[] numbers) {
        double answer = 0;
        //평균을 구해보자.!!!
        //for문 순회 
        int sum = 0;
        for (int x : numbers) {
			sum += x;
		}
        answer = (double)sum / numbers.length;
        return answer;
    }
}
