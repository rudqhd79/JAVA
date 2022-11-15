package test.ch06.exam01.packge2;

import test.ch06.exam01.package1.A;
import test.ch06.exam01.package1.B;

public class C {
	A a = new A(true); // 실행 됨
	A a1= new A(1); // 실행 됨
	A a2= new A("A"); // 실행 됨
}
