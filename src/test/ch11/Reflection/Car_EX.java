package test.ch11.Reflection;

public class Car_EX {

	public static void main(String[] args) throws ClassNotFoundException {
		// .class는 Car_EX의 정보들이 clazz에 들어간다
		Class clazz = Car_EX.class; // 클래스 객체를 얻는 첫번째 방법
		// try catch 보다 throws로 했음 (JVM에서 알아서 처리 해준다)
		Class clazz2 = Class.forName("test.ch11.Reflection.Car_EX"); // 클래스 객체를 얻는 두번째 방법

		Car car = new Car(); // 클래스 객체를 얻는 세번째 방법
		Class clazz3 = car.getClass();

		// 출력 결과로 알 수 있듯이 패키지와 이름을 알 수 있다
		System.out.println("패키지 이름:  " + clazz.getPackage().getName());
		System.out.println("클래스의 간단한 이름:  " + clazz.getSimpleName());
		System.out.println("클래스의 전체 이름:  " + clazz.getName());
	}

}
