package test.ch09;

public class AStatic_EX {

	public static void main(String[] args) {
		// 평소에 받아오는 값은 A클래스를 만들고
		// b1에 a의 새로운 인스턴트라는 것이 된다
//				AStatic a = new AStatic();
//				AStatic.B b1 = a.new B();
		
		// static이기 때문에 클래스 명으로 인스턴트 생성이 가능하다
		AStatic.B b = new AStatic.B();
		
		System.out.println(b.field);
		b.method1();
	}
}
