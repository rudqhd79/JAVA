package test.ch11.Math;

public class Random_EX {

	public static void main(String[] args) {
		// 0.0 초과 ~ 1.0 미만 사이의 숫자 출력(소수만, double타입)
		System.out.println(Math.random());

		//랜덤한 정수를 얻고 싶을 때 공식
		int n = 9;	//n개의 정수 (내가 얻고싶은 정수의 갯수)
		int start = 1; // 시작하는 숫자
		int num = (int) (Math.random() * n) + start;
		
		System.out.println(num);
	}

}
