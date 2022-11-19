package test.ch07.poly3;

public class Vehicle {

	public void run() {
		System.out.println("차량이 달립니다.");
	}
}

//선언(가져오는 것)을 매개변수로 하면 알 수 있는 점은

//메소드의 매개변수로 넣었을 때에는 private처럼 한정된 공간에서만 실행이 가능하다
//직접 실행 했을 때(main 공간에서)는 넣고 싶은 객체를 직접 생성하여 매개변수 대체하여 넣어야한다
//매개변수로 선언(가져오기)은 오버라이드 된 값을 한번에 끌어오는 느낌이다