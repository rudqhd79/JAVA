package test.ch07.poly2;

public class Car_EX {

	public static void main(String[] args) {

		//타이어가 매개변수로 선언되었을 때에는 새로운 객체를 생성하여 타이어를 갈아끼운다
		Car myCar = new Car();
		
		myCar.run();
		
		// Tire를 선언(가져오기)한다
		myCar.tire = new Tire();

		// Tire의 자식객체인 금호타이어나 한국타이어로 교체하려면
//		myCar.tire = new HankookTire();
//		myCar.tire = new KumhoTire();
		// 결과로 알 수 있듯이 (생성자명.최상위객체 = new 자식객체(오버라이드(재정의) 된 메소드)

		myCar.run();

	}

}
