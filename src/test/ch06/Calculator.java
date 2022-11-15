package test.ch06;

public class Calculator {
	// 메소드 오버로딩: 같은 이름의 메소드를 여러개 만든다
	// 매개변수의 순서, 갯수, 타입 중 하나가 달라야 한다
	// 메소드 오버로딩은 매개변수의 타입과 순서가 반드시 달라야 겹치지 않는다

	double areaRectangle(double width) {
		return width * width;
		// 정사각형 넓이 공식
	}

	double areaRectangle(double width, double height) {
		return width * height;
		// 직사각형 넓이 공식
	}

	double areaRectangle(double h, int a) {
		return h * a;
	}

	// 리턴값이 없는 메소드 선언
	/*
	 * void powerOn() { System.out.println("전원을 켭니다"); return; //사용가능 }
	 * 
	 * void powerOff() { System.out.println("전원을 끕니다"); }
	 * 
	 * int plus(int x, int y) { int result = x + y; return result; }
	 * 
	 * // double형으로 리턴값이 있는 메소드 double divide(int x, int y) { double result =
	 * (double) x / (double) y; return result; }
	 */
}
