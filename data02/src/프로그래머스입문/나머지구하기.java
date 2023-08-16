package 프로그래머스입문;

public class 나머지구하기 {

	public static void main(String[] args) {
		Solution s = new Solution();
		int result = s.solution(10, 5);
		System.out.println(result);
	}
}

class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }
}
