package test.ch12.Interface;

public class Generic_EX {

	public static void main(String[] args) {
		HomeAgency hoemAgency = new HomeAgency();

		// rent()를 실행하면 hoemAgency클래스에서 rent가 오버라이드 되어 리턴된다
		// return값이 목적지가 없으므로 Home 타입의 home을 생성한다
		Home home = hoemAgency.rent();
		home.turnOnLight();

		CarAgency carAgency = new CarAgency();
		//carAgency.rent()는 new Car 객체를 리턴
		Car car = carAgency.rent();
		car.run();

	}

}
