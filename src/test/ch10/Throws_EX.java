package test.ch10;

public class Throws_EX {

	public static void main(String[] args) throws ClassNotFoundException {
	
			findClass();	//메소드를 호출한 곳에서 예외처리

	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
