package test.ch02;

public class sol {

	public static void main(String[] args) {
		System.out.printf("이름 : %s", "감자바");
		//printf의 %s(s는 String의 약자)는 문자열을 선택하는 것이다
		System.out.printf("이름 : %d", 25);
		//printf의 %d는 정수열을 선택하는 것이다
		
		System.out.printf("정수출력1: %6d\n", 123);
		//printf의 %6d\n(%6\n은 정수 6자리 정수라는 의미)
		
		System.out.printf("실수: %10.2f\n", 3.14);
		//3.14는 4자리를 차지하는데 %10.2f\n은 10자리 이기때문에 6자리 공백이 남는다
		System.out.printf("정수출력1: %d, 실수출력: %f", 123, 3.45);
		//정수출력1은 정수로, 실수출력은 실수로 출력된다
	}
}
