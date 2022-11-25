package test.ch11.Hash;

public class HashCode_EX {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");

		// 해시코드: 객체를 식별하는 정수(객체의 메모릴 번지를 이용해서 만들어짐)
//		System.out.println(s1.hashCode() + "  ,  " + s2.hashCode());

		if (s1.hashCode() == s2.hashCode()) {
			if (s1.equals(s2)) { // 오버라이드 된 equals()메소드가 실행된다 없으면 주소만 비교한다)
				System.out.println("논리적 동등입니다.");
			} else {
				System.out.println("no하고 name이 데이터가 다르므로 논리적 동등이 아닙니다..");
			}
		}
	}

}
