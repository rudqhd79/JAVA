package test.ch06;

public class Car_EX {

	public static void main(String[] args) {
		// 1. 객체 생성
//		Car myCar = new Car("그랜저", "검정", 250);
//		System.out.println(myCar.model);
//		System.out.println(myCar.speed);
//		System.out.println(myCar.start);
//		System.out.println(myCar.color);
//		System.out.println(myCar.maxSpeed);
//		System.out.println("-------------------------");

		// 생성자가 두개 이상 제공되는 경우를 말한다
		// 같은 이름의 메소드를 여러개 선언하는 것
		Car car2 = new Car();
//		System.out.println(car2.model);
		System.out.println(Car.numbering);
		System.out.println("-------------------------");

		Car car3 = new Car();
//		System.out.println(car3.model);
//		System.out.println(car3.color);
		System.out.println(Car.numbering);
		System.out.println("-------------------------");
	}

}
