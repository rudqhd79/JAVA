package test.ch06;

public class This {
	// 필드 2개 생성
	String model;
	int speed;

	// 생성자
	This(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}

	// 매개변수명이 필드에 있는 데이터명과 같으면 필드 데이터는 this를 붙인다
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		// setSpeed는 함수이지만 같은 class안에 있는 것이라 this를 붙여줘도 상관없다 (구분이 확실하게 됨)
//		this.setSpeed(100);
		System.out.println(this.model + "," + this.speed);
		// this가 생략 가능하지만 확실하게 구분짓기 위해서 해주는것이 더 나은거 같다
	}
}
