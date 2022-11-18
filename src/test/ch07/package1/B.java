package test.ch07.package1;

public class B {
	public void method() {
		//protected는 패키지 안, 상속관계에서 사용가능
		//아무런 문제 없이 실행이 된다
		A a = new A();
		a.field = "1";
		a.method();
	}
}
