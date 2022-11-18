package test.ch07.package2;

import test.ch07.package1.A;

//A클래스는 슈퍼클래스 D클래스는 서브클래스
//패키지가 달라 import 해줘야 한다
public class D extends A {
	public D() {
		super();	//A클래스의 생성자 호출
	}
	
	public void method1() {
		//A클래스의 필드를 호출, 값 선언
		super.field = "2";
		super.method();
		
		/*상속을 받으면 super말고도
		this로도 쓸 수 있다*/
		this.field = "1";
		this.method();
		
		/*상속을 통한 것이 아닌
		 * super나 this가 없는(상속이 없는)
		 * 것을 통해 사용은 안된다*/
		public void method2() {
			//protected는 패키지 안, 상속관계에서 사용가능
			//아무런 문제 없이 실행이 된다
			A a = new A();
			a.field = "1";
			a.method();
		}
	}
}
