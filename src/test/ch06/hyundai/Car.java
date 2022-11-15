package test.ch06.hyundai;

import test.ch06.hankook.SnowTire;
import test.ch06.kumho.AllSeasonTire;

public class Car {
	// 다른 패키지에 있는 class는 반드시 패키지 inport를 해줘야한다.
	SnowTire snowT = new SnowTire();
	AllSeasonTire AllT = new AllSeasonTire();
	Test test = new Test();
	test.ch06.hankook.Tire tire1 = new test.ch06.hankook.Tire();
	// import 대신 쓸 수 있음
}
