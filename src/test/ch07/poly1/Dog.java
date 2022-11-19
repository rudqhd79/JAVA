package test.ch07.poly1;

public class Dog extends Animal {

	//슈퍼 클래스가 추상 클래스이기 때문에 오버라이드가 되어야 한다
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
