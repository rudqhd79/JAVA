package test.ch06.exam01.package1;

//클래스는 public , default 접근제한자를 가질 수 있다.
//default는  아무것도 안적은 class이다
//public은 모두 적용 가능, default는 같은 package 안에서 적용 가능, private는 같은 파일안에서만 사용 가능하다
public class A {
	A a2 = new A("A");
	//a2는 private이여서 밖에 있는 B.java에서 적용이 안된다
	
	public A(boolean b) {

	}

	A(int b) {
		
	}
	
	private A(String s) {

	}

}
