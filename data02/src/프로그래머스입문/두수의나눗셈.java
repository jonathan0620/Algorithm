package 프로그래머스입문;

public class 두수의나눗셈 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int result = s.solution(1, 16);
		System.out.println(result);
	}
}

class Solution2 {
    public int solution(int num1, int num2) {
        int answer = 0;
        double result = (double)num1 / num2; //1.....
        //자바에서의 연산은 int/int면 무조건 int 
        //무조건 1개 이상은 실수가 되어야 한다.!
        System.out.println((int)(result * 1000));
        answer = (int)(result * 1000);
        return answer;
    }
}
