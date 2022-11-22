package test.ch08.poly3;

public class Driver_EX {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		// driver 메소드 안에는 현재 Vehicle의 매개변수가 있기 때문에 출력은
		driver.driver(bus);
		driver.driver(taxi);

	}

}
