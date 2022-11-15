package test.ch06;

public class Calculator_EX {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.areaRectangle(10);
		//class calculator의 areaRectangle에 매개변수를 10을 지정했다
		System.out.println(result1);
		double result2 = myCalc.areaRectangle(10, 20);
		System.out.println(result2);
		
		
	/*	Calculator myCalc = new Calculator();

		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println(result1);

		int x = 10, y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println(result2);
		
		myCalc.powerOff();
		*/
	}

}
