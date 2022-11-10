package test.ch02;

public class test02 {

	public static void main (String[] args) {
		int v1= 15;
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
		
		int v3 = v1 + v2 + 5;
		// if문에 v2가 있기떄문에 제대로 선언되지 않는 변수이다
	}
}
