package test.ch07.poly;

public class Driver_EX {

	public static void main(String[] args) {
		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		// driver에서 drive의 매개변수는 Vehicle vehicle이니깐 결론적으로는 class Vehicle의 값을 줘야한다
		driver.drive(taxi);
	}

}
