package test.ch11.Reflection;

//import.java.lang.reflect.*;	(모두 임포트)
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import test.ch06.Car;

public class Reflection_EX {

	public static void main(String[] args) {
		Class clazz = Car2.class; // Car객체

		System.out.println("[생성자 정보]");
		// Car 객체에 선언된 constructors라는 뜻
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");

			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}

		System.out.println("[필드 정보]");
		// Car 객체에 선언된 Fields라는 뜻
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getName() + "  " + field.getName());
		}

		System.out.println("[메소드 정보]");
		// Car 객체에 선언된 methods라는 뜻
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getName() + "(");

			// .getParameterTypes();는 파라미터의 타입을 가져 올 수 있다
			// 지금같은 경우는 Method 타입을 가져온다
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}

	private static void printParameters(Class[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i < (parameters.length - 1)) {
				System.out.print(",");
			}
		}
	}

}
