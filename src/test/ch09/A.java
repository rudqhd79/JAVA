package test.ch09;

//중첩 클래스
public class A {
	//인스턴트 멤버 클래스
	//public, default, private 접근 제한자 사용가능
	class B {
		//필드
		int field1 = 1;
		
		//생성자
		B() {
			System.out.println("B 생성자 실행");
		}
		
		//메소드
		void method1() {
			System.out.println("B 메소드 실행");			
		}
	}
	
	void useB() {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
	}
	
/*	//필드로 만들기
	//B 클래스 자체를 타입으로 했다
	B field = new B();
	
	//A 클래스 생성자에서 사용 가능(A클래스 안에 있기 때문이다)
	A() {
		B b = new B();
	}
	
	//메소드에서 사용 가능
	void method() {
		B b = new B();		
	}*/
}
