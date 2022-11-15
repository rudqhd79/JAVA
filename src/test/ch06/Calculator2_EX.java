package test.ch06;

public class Calculator2_EX {

	public static void main(String[] args) {
//		Calculator2 calc2 = new Calculator2(); // 객체생성 = 인스턴스를 생성
//    객체를 생성해야만 인스턴트를 실행시킬 수 있다.
//		calc2.pi = 10; (pi가 10으로 바뀜)

		Calculator2.plus(1, 2);
		Calculator2.minus(1, 2);
		System.out.println(Calculator2.pi);
		System.out.println(Calculator2.plus(1, 2));
		System.out.println(Calculator2.minus(1, 2));
		// 필드도 출력 가능
		// 정적 함수 Static이 있으면 인스턴트가 없어도 값을 출력 할 수 있다.
	}

}
