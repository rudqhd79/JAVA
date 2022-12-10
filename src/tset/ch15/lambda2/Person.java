package tset.ch15.lambda2;

public class Person {
/*
	@Override
	public double clac(double x, double y) {
		double sum = x + y;
		System.out.println(sum);
		return sum;
	}
	*/
	public void action(Calculable2 calculate) {
		double result = calculate.clac(10, 4);
		double result2 = calculate.clac(50, 3);
		System.out.println("결과:  " + result);
		System.out.println("결과2:  " + result2);
	}
}
