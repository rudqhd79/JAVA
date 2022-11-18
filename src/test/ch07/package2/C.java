package test.ch07.package2;

import test.ch07.package1.A;

public class C {
	//protected는 패키지가 달라 실행이 안된다
	A a = new A();
	a.field = "1";
	a.method();
}
