package test.ch06;

public class Korea_EX {

	public static void main(String[] args) {
		Korea k1 = new Korea("123456789", "김경범");
		// Korea 생성자에 값이 없기 때문에 값을 넣어줘야 한다
		k1.name = "김자바";
//		k1.nation = "america";
		// final이라 nation 값을 바꾸려면 final을 지워야한다

		System.out.println(k1.name);
		System.out.println(k1.nation);
		System.out.println(k1.ssn);

	}

}
