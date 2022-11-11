package test.ch06;

public class Calculator_EX {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();

		myCalc.powerOn();
		myCalc.powerOff();

		int result1 = myCalc.plus(5, 6);
		System.out.println(result1);

		int x = 10, y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println(result2);
	}

}
