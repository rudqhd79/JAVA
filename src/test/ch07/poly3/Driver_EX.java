package test.ch07.poly3;

public class Driver_EX {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		// driver에서 drive의 매개변수는
		// 슈퍼클래스 Vehicle 서브클래스 Bus, Taxi 이니까
		// 3개 중 쓰고 싶은것을 쓰면 된다
		driver.drive(bus);
	}

}
