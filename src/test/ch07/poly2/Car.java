package test.ch07.poly2;

public class Car {
	// 필드로 타이어 객체 선언
	// 객체 생성은 원래 main에서 했었다 (Tire tire = new Tire();)
	// 객체를 필드로 선언했다
	// 이렇게 선언(가져온 것) 된 것은
	public Tire tire;
	
	
	public void run() {
		// 타이어를 굴린다
		tire.roll();
	}
}
