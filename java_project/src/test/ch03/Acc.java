package test.ch03;

public class Acc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int apple = 1; double pieceUnit = 0.1; int number = 7;
		 * 
		 * double result = apple - number * pieceUnit;
		 * System.out.println("사과 1개에서 남은 양 :   " + result); //원래 값이 0.3이 나와야 하는데 결과값은
		 * 0.299...이다 //0.3이 정확히 나오려면 int로 써주어야 한다
		 * 
		 * int apple1 = 1; int pieceUnit1 = apple * 10; int number1 = 7;
		 * 
		 * //정확한 계산은 항상 정수로 해야한다 int result1 = pieceUnit1 - number;
		 * System.out.println("사과 1개에서 남은 양 :   " + result1/10.0); //실수 주입으로 값 나온다
		 */

		int x = 5;
		double y = 0;
//		double z = x / y;
		// 0.0000.....이 무한대로 나오기때문에 infinity가 나온다
		double z = x % y;
		// 값이 떨어지지 않기 떄문에 Nan이 나온다

		System.out.println(z + 2);

		if (Double.isInfinite(z) || Double.isNaN(z)) {
			// 실수 변수 z가 무한대인지 or 실수 변수 z가 NaN인지
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z);
		}

	}

}
