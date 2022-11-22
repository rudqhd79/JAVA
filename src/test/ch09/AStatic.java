package test.ch09;

public class AStatic {
	
	//public, private, default 접근제한자 사용가능
	static class B {
		int field = 1;
		
		B () {
			System.out.println("b 생성자 실행");
		}
		
		void method1() {
			System.out.println("b 메소드 실행");			
		}
	}
	
	//필드로 사용
	//중첩된 클래스를 필드로 사용 가능하다
	B field = new B();
	
	//static 클래스이기 때문에 정적 필드값으로 사용 가능하다
	static B field2 = new B();
	
	//생성자로 사용
	AStatic() {
		B b = new B();
	}
	
	//메소드로 사용
	void method1() {
		B b = new B();
	}
	
	//static 클래스이기 때문에 정적 메소드로도 사용가능하다
	static void method2() {
		B b = new B();
	}
}
