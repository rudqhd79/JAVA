package test.ch07;

//Parent는 슈퍼클래스 Child는 서브클래스
public class Child extends Parent {
	// 필드
	public int b = 1;

	//오버라이드는 메소드에서만 쓸 수 있다
	@Override
	public void method2() {
		System.out.println("Parent-mehod2()");
	}

	public void method3() {
		System.out.println("Parent-mehod3()");
	}

	// ------------------------자동 타입변환-----------------
	// ------------------------강제 타입변환-----------------

}
