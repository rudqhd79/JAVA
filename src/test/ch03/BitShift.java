package test.ch03;

public class BitShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int result1 = num1 << 3;
		// << 좌측 이동 연산자는 1을 3칸 옆으로 이동 시킨다 (2의 3제곱)
		// 2진법에선 1000이 8이다
		System.out.println(result1);

		int num2 = -8;
		int result2 = num2 >> 3;
		// >> 우측 이동 연산자는 2의 -3제곱이다
		// 2^-3 = 1/2^3
		System.out.println(result2);

	}

}
