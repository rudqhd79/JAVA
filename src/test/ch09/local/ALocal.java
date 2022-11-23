package test.ch09.local;

public class ALocal {
	//useB의 매개변수 arg는 안에서 값을 줄 수 없다
	void useB(int arg) {
		
		//로컬변수
		//중첩 되었을 때는 클래스 안에서 바꿀 수 없다(로컬변수 구역에서만 변경 가능)
		int var = 1;	//final int var
		
		class B {
			//인스턴스 필드
			int field1 = 1;
			
			//생성자
			B() {
				System.out.println("B 생성자 실행");
			}
			
			//메소드
			void method1() {
				System.out.println("B 메소드 실행" + arg);
			}
			void method2() {
//				var = 2;
//				arg = 2;
			}
		}
		//useB 메소드 안에서 객체 생성 할 수 있다
		B b = new B();
		System.out.println(b.field1);
		b.method1();
	}
}
