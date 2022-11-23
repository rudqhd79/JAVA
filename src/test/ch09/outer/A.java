package test.ch09.outer;

public class A {
	// A클래스의 인스턴스 필드와 메소드 생성
	int field1;

	void method1() {
	}

	// A클래스의 정적 필드와 메소드
	static int field2;

	static void method2() {
	}

	// 인스턴스 멤버 클래스
	class B {
		// method() 인스턴스 클래스는 바깥 클래스의 인스턴스 필드와 메소드가 접근이 모두 가능하다
		void method() {
			field1 = 10;
			method1();

			field2 = 10;
			method2();
		}
	}

	// 정적 멤버 클래스
	static class C {
		// method() 정적 클래스는 바깥 클래스의 정적 멤버만 접근할 수 있다
		void method() {
			field1 = 10;
			method1();

			field2 = 10;
			method2();
		}
	}
}
