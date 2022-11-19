package test.ch07.package1;

public class B {
	public void method() {
		//protected는 패키지 안, 상속관계에서 사용가능
		//아무런 문제 없이 실행이 된다
		
		//객체 a 생성(클래스 A와 연결)
		A a = new A();
		
		//(클래스 a의 필드 값을 설정했다)
		//String문자열 1로 설정
		
		a.field = "1";
		//(클래스 a의 메소드를 실행한다)
		a.method();
	}
}
