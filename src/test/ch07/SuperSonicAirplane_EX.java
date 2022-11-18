package test.ch07;

public class SuperSonicAirplane_EX {

	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff();
		sa.fly();
		// 필드 flyMode의 값을 바꾸고 싶으면 SuperSonicAirplane에 .을 붙이고 상수를 붙이면 된다
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		sa.fly();

	}

}
