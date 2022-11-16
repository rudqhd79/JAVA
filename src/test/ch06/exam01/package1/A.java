package test.ch06.exam01.package1;

//클래스는 public , default 접근제한자를 가질 수 있다.
//default는  아무것도 안적은 class이다
//public은 모두 적용 가능, default는 같은 package 안에서 적용 가능, private는 같은 파일안에서만 사용 가능하다
public class A {
	public int field1;
	//All
	int field2;
	//in package
	private int field3;
	//in class
	
	public A() {
		//같은 class 안에 있기떄문에 this를 쓰지 않아도 된다
		field1 = 1;
		field2 = 1;
		field3 = 1;
		method1();
		method2();
		method3();
	}
		
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	
	/*
	A a2 = new A("A");
	//a2는 private이여서 밖에 있는 B.java에서 적용이 안된다
	
	public A(boolean b) {

	}

	A(int b) {
		
	}
	
	private A(String s) {

	}
	*/

}
