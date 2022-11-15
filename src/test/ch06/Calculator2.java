package test.ch06;


//class에서는 필드값이 필수가 아니다.
//class에서는 메소드 선언이 JS랑 비슷하다
//class에서는 static 정적함수가 있으면 인스턴트(객체)를 생성 안해도 값을 출력할 수 있다

public class Calculator2 {
	//1. 필드
	static double pi = 3.14159;
	//static은 정적 멤버가 된다
	//static은 전역변수 같이 생각하면 된다
	//static은 인스턴트에 관한 것을 쓸 수 없다 (오직 static에 관한 내용만 쓸 수 있음)
	
	//static은 class에 귀속된 것이 아니어서 static 블록 밖에 변수를 선언할 수 있다.
	static String model = "calc1";
	static String number = "1";
	static String info;
	//static 블록 만들기
	//static 값 초기화
	static {
		info = model + "_" + number;
		//class에 귀속되지 않아 this를 쓰지 않아도 된다
	}
	
	//2. 메소드
	static int plus(int x, int y) {
		//static은 정적 멤버가 된다
		return x + y;
	}
	static int minus(int x, int y) {
		//static은 정적 멤버가 된다
		return x - y;
	}
	
}
