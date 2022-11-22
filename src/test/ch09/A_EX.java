package test.ch09;

public class A_EX {

	public static void main(String[] args) {
		//외부에서 B클래스를 쓸 수 있다
		A a = new A();
		
		//A 클래스 안에 있는 B클래스를 생성할 때 B클래스가 A클래스 안에 있는 것이라고 써야한다
		A.B b = a.new B();
		
		a.useB();
	}
}
