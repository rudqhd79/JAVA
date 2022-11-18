package test.ch07.poly;

public class Car_EX {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		//Tire 객체를 넣어준다
//		myCar.tire = new Tire();
		//Tire의 자식객체인 금호타이어나 한국타이어로 교체하려면
		myCar.tire = new HankookTire();
//		myCar.tire = new KumhoTire();
		//결과로 알 수 있듯이 (생성자명.최상위객체 = new 자식객체(오버라이드(재정의) 된 메소드)
		
		myCar.run();
		
	}

}
