package test.ch09.noname;

public class Car {
	// 필드에 Tire 객체 대입
	// 익명객체
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() {	//익명개체로 재정의를 한번에 할 수 있다 + 자동형변환도 된다
	//익명객체 생성 + 상속 + 자동형변환

		// 오버라이드를 할 수 있는 이유는 Tire클래스가 슈퍼클래스가 되고 생성된 객체는 서브 클래스가 되는 것이다
		// (이름없는 익명객체이므로 new Tire()가 서브클래스)
		@Override	//재정의
		public void roll() {
			System.out.println("한국 타이어가 굴러갑니다.");
		}
	};

	// 메소드
	public void run1() {
		tire1.roll();
		tire2.roll();
	}

	public void run2() {
		
		// 로컬 변수에 익명 자식 객체 사용
		Tire tire = new Tire() {
			
			@Override
			public void roll() {
				System.out.println("금호 타이어가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	
	//메소드의 매개변수에 선언(가져오기)
	public void run3(Tire tire) {
		tire.roll();
	}
}
