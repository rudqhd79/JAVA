package test.ch07;

// class A 생성
class A {}

class B extends A {}

class C extends A {}

class D extends B {}

class E extends C {}

public class Promotion_EX {

	public static void main(String[] args) {

		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//자동타입 변환
		//A가 최상위 객체이기 때문에 가능하다
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		//자동타입 변환이 안되는 이유는 B의 직속관계는 A와 D이기 때문이다
		B b3 = e;
		C c2 = d;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
