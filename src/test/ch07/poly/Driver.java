package test.ch07.poly;

public class Driver {
	// 메소드(매개변수로 다형성을 구현한다.)
	public void drive(Vehicle vehicle) {
		// 매개변수로 받아와서 실행 시킬 수 있다.
		vehicle.run();
	}

}
