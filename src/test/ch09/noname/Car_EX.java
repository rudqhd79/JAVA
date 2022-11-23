package test.ch09.noname;

public class Car_EX {

	public static void main(String[] args) {
		// Car 객체 생성
		Car car = new Car();

		car.run1();
		car.run2();
		// 익명객체에 값을 주는 방법
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("이젠 타이어가 굴러갑니다.");
			}
		});

	}

}
