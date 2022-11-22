package test.ch08.poly2;

public class Car_EX {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();

		// 타이어 객체 교체
		// myCar는 Car 클래스에서 정의된 Tire가 있어서 가능한 일이다
		// 조건1. 바꾸려는 클래스에 상속된 최상위 객체가 있어야 된다
		// 조건2. 최상위 객체는 바꾸려는 객체와 상속관계가 되어야한다
		myCar.tire1 = new KumhoTire(); // 원래 한국타이어 였던 것이 금호타이어가 되었다
		myCar.tire2 = new KumhoTire(); // 원래 한국타이어 였던 것이 금호타이어가 되었다
		myCar.run();
	}

}
