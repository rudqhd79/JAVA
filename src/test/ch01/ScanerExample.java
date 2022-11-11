package test.ch01;
import java.util.Scanner;

public class ScanerExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("x값 입력:   ");

		String strX= scan.nextLine();
		// nextLine()은 enter키를 누르면 문자열을 읽는다.
		int x = Integer.parseInt(strX);
		// x라는 변수는 strX 변수를 정수형으로 변환하는 식이다

		System.out.println("y값 입력:   ");
		String strY = scan.nextLine();
		int y = Integer.parseInt(strY);


		int result = x + y;

		System.out.println("result:   " + result);
		System.out.println();

		while (true) {
			System.out.println("입력 문자열     ");
			String data = scan.nextLine();

			if (data.equals("q")) {
				// equals(===)는 문자형 String 데이터이다
				break;
				// break는 반복문이 끝나는 지점
			}

			System.out.println("출력 문자열:   " + data);
			System.out.println();
		}

		System.out.println("종료");

	}
}
