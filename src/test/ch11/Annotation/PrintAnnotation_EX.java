package test.ch11.Annotation;

import java.lang.reflect.*;

public class PrintAnnotation_EX {

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// Service클래스 정보를 decalerdMethods에 넣어준다
		Method[] decalerdMethods = Service.class.getDeclaredMethods();
		for (Method method : decalerdMethods) {
			// getAnnotation()의 괄호안에 PrintAnnotation.class는
			PrintAnnotation printAno = method.getAnnotation(PrintAnnotation.class);
			printLine(printAno);

			// invoke는 메소드를 실행시키는 명령어이다
			// 괄호 안에는 새로운 객체를 넣어줘야 한다
			method.invoke(new Service());
		}
	}

	public static void printLine(PrintAnnotation printAno) {
		if (printAno != null) {

			// num속성 값 얻기
			int num = printAno.num();
			String value = printAno.value();

			System.out.println(num);
			System.out.println(value);
		}
	}
}
