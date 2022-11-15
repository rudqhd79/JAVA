package test.ch06;

public class Car2 {

	// speed라는 인스턴트 필드 (정적 필드는 static이 붙어야 된다)
	static int speed;

	// void는 return이 없는 함수이다
	void run() {
		System.out.println(this.speed + "으로 달립니다.");
		// speed에 this를 붙여도 되고 안붙여도 된다 (왜냐하면 같은 class안에 있기 떄문에 this라는 지목을 안해도 된다)
		// static은 this를 안붙여도 된다 (static이라는 공간이 따로 생기기 때문)
	}

	void run2() {
		run();
		System.out.println(this.speed + "으로 달립니다.");
		// speed에 this를 붙여도 되고 안붙여도 된다 (왜냐하면 같은 class안에 있기 떄문에 this라는 지목을 안해도 된다)
		// static은 this를 안붙여도 된다 (static이라는 공간이 따로 생기기 때문)
	}

	static void simulate() {
		// 인스턴트 생성 (자기 자신을 인스턴트로 만들 수 있다)
		speed = 200;
		// this.speed는 실행 할 수 없다(왜냐하면 필드의 값을 가져 오려면 객체를 생성하여 새로 만들어야 한다)
		// 또한, 필드값 speed는 static이 아니라서 객체를 생성하여 사용해야 한다

		System.out.println(speed + "으로 달립니다.");
	}
	// 정적 메소드 (static 사용)

	public static void main(String[] args) {
		// 실행시키면 main method가 먼저 실행이 된다

		// Car2.는 안붙여도 된다(왜냐하면 이미 method는 class Car2 안에 있기 때문에 생략이 가능하다)
		Car2 myCar = new Car2();

		myCar.speed = 150;
		myCar.simulate();

		myCar.speed = 60;
		myCar.run();
		myCar.speed = 120;
		myCar.run2();
	}

}
