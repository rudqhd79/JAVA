package test.ch03;

public class BitLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("45 & 25 = " + (45 & 25));
		// 둘다 조건 만족
		System.out.println("45 | 25 = " + (45 | 25));
		// 둘 중 하나만 조건 만족
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		// and와 or의 합. 즉, 비교 대상의 수가 다르면 1, 1이 같으면 1, 0이 같으면 0이다
		System.out.println("~45 = " + (~45));

		System.out.println("---------------------------------");

		byte recieveData = -128;
		int unsignedInt = Byte.toUnsignedInt(recieveData);
		System.out.println(unsignedInt);
	}

}
