package test.ch07;

public class Computer extends Calculator {

	@Override
	//오버라이드는 부모 클래스에 있는 메소드를 재정의 하는것이다
	//오버라이드는 이름, 메소드 이름이 같아야 한다
	public double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
