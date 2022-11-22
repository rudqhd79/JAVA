package test.ch08.Interface3;

//C는 A,B의 자식객체이다
//implements할 때 오버라이드 할 것들은 A,B,C 전부 해야한다
public class InterfaceImpl implements C {

	@Override
	public void methodA() {
		System.out.println("InterfaceImpl-A 메소드 실행");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceImpl-B메소드 실행");

	}

	@Override
	public void methodC() {
		System.out.println("InterfaceImpl-C 메소드 실행");

	}

}
