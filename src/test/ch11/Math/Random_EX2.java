package test.ch11.Math;

import java.util.Random;

public class Random_EX2 {

	public static void main(String[] args) {
		// 패키지에 없는 class 이므로 import 해줘야한다
		Random rand = new Random();

		// 숫자가 6개 나오는 것은 0~5까지 횟수
		for (int i = 0; i <= 5; i++) {
			// nextInt(n) : (0 <= ~ < n) (0부터 9까지 숫자를 랜덤하게 생성)
			System.out.print(rand.nextInt(10) + ",");
		}

		System.out.println("");

		Random rand2 = new Random(100); // seed를 넣어줌
		for (int i = 0; i <= 5; i++) {
			System.out.print(rand2.nextInt(10) + ",");
		}
	}

}
