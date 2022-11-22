package test.ch08.poly1;

public class Cast_EX {

	public static void main(String[] args) {
		// Bus를 Vehicle에 넣는다
		Vehicle vehicle = new Bus(); // 자동 타입변환
		vehicle.run();
		// 자동 형변환 일때 오버라이드 되지 않는 것이라 실행 안됨
//		vehicle.checkFare();

		// vehicle을 Bus 객체로 넣는다
		// 강제 타입변환(변환 후 instanceof로 확인을 한번 하자)
		Bus bus = (Bus) vehicle;
//		Bus bus = new Bus();

		// 아래 메소드를 실행시키려면 Bus 인스턴스를 만들거나 vehicle을 강제형변환 해야한다
		bus.run();
		bus.checkFare();
	}
	//Vehicle을 선언(가져오기)
	public static void ride(Vehicle vehicle) {
		//vehicle이 Bus 객체를 가지고 있는지 물어보는 것
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
	}
}
