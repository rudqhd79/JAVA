package test.ch11.Reflection;

import test.ch06.Car;

public class GetResource_EX {

	public static void main(String[] args) {
		Class clazz = Car.class;

		// 괄호안에 이미지 파일 이름을 적어주면 된다
		// getPath는 이미지의 경로를 알려준다
		String photo1Path = clazz.getResource("download.jpg").getPath();
		String photo2Path = clazz.getResource("Images/download.jpg").getPath();

		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

	// 어노테이션 (annotation)
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
