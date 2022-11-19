package test.ch07.poly3;

public class Driver {
	// 메소드(매개변수로 다형성을 구현한다.)
	// 매개변수로 Vehicle을 선언(가져온다)
	// test.ch07.poly1의 Car.java에서는 선언(가져오기)을 필드로 하였다
	// 메소드 생성(선언 값을 매개변수에 넣기)
	public void drive(Vehicle vehicle) {

		vehicle.run();
		// 결론적으로는 run()을 실행시키면
		// Vehicle함수가 실행된다.
		// Vehicle은 슈퍼클래스 Bus, Taxi가 서브클래스 이므로
		// Bus, Taxi도 같이 쓸 수 있다
	}
}
