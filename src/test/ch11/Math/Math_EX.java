package test.ch11.Math;

public class Math_EX {

	public static void main(String[] args) {
		double v1 = Math.ceil(5.3); // 소수점 올림
		double v2 = Math.floor(5.3); // 소수점 버림
		System.out.println(v1 + "," + v2);
		System.out.println(v1 + "," + v2);

		long v3 = Math.max(3, 7); // 최대값
		long v4 = Math.min(3, 7); // 최소값
		System.out.println(v3 + "," + v4);
		
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);	//반올림
		System.out.println(temp2);
		double v5 = temp2 / 100.0;
		System.out.println(v5);

	}
}
