package test.ch03;

public class LogicalOperater {

	public static void main(String[] args) {
		int charCode = 'A'; // 65

		if ((65 <= charCode) & (charCode <= 90)) { // 65~90
			System.out.println("대문자입니다");
		}
		if ((97 <= charCode) && (charCode <= 122)) { // 97~122
			System.out.println("소문자입니다");
		}
		if ((48 <= charCode) && (charCode <= 57)) { // 48~57
			System.out.println("0~9 숫자입니다");
		}
		// &는 비트 연산자 && 논리연산자

		int value = 6;

		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2또는 3의 배수");
		}
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2또는 3의 배수");
		}
	}
}
