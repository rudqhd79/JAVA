package test.ch04;

import java.util.Scanner;

public class If_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("점수를 입력해 주세요");
//
//		int score = scan.nextInt();
//
//		if (score >= 90) {
//			System.out.println("90점 이상입니다");
//		} else if (score >= 80) {
//			System.out.println("80점 이상입니다");
//		} else if (score >= 70) {
//			System.out.println("70점 이상입니다");
//		} else {
//			System.out.println("70점 미만입니다");
//		}

		int num = (int) (Math.random() * 6) + 1;
		// Math.random에 값을 주지 않으면 0.0~0.1사이의 값만 입력

		if (num == 1) {
			System.out.println("1번");
		} else if (num == 2) {
			System.out.println("2번");
		} else if (num == 3) {
			System.out.println("3번");
		} else if (num == 4) {
			System.out.println("4번");
		} else if (num == 5) {
			System.out.println("5번");
		} else {
			System.out.println("6번");
		}
		System.out.println(num);

		char grade = 'B';
		// byte, char, short, int, long, String
		switch (grade) {
		case 'A':
			System.out.println("1번");
			break;

		case 'B':
			System.out.println("2번");
			break;

		case 'C':
			System.out.println("3번");
			break;

		case 'D':
			System.out.println("4번");
			break;

		case 'E':
			System.out.println("5번");
			break;

		case 'F':
			System.out.println("6번");
			break;
		}
		System.out.println(num);
	}
}
