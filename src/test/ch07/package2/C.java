package test.ch07.package2;

import test.ch07.package1.A;

public class C {
	//A 클래스 객체를 만들 수 없는 이유
	//클래스 A는 protected라는 접근 제한자를 사용했다
	//protected는 같은 패키지에 있거나 상속관계에 있어야 쓸 수 있기 때문이다
	//결론은 실행 불가하다
	
	A a = new A();
	a.field = "1";
	a.method();
	
}
