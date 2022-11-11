package test.ch04;

import java.util.Scanner;

public class KeyControl_EX {

	public static void main(String[] args) {
		// 1,2를 입력했을 때 속도를 증가, 감속시키고, 3입력시 종료시키는 프로그램
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int speed = 0;

		while (run) {
			System.out.println("--------------");
			System.out.println("1. 증속, 2. 감속, 3. 중지");
			System.out.println("--------------");
			System.out.println("선택:  ");

			String str = scan.nextLine();

			if (str.equals("1")) {
				speed++;
				System.out.println("현재속도:   " + speed);
			} else if (str.equals("2")) {
				speed--;
				System.out.println("현재속도:   " + speed);
			} else if (str.equals("3")) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}

}
