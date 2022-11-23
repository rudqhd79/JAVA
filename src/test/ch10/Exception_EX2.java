package test.ch10;

public class Exception_EX2 {

	public static void main(String[] args) {
		try {
			//String은 어디서든지 쓸 수 있기 때문에 존재한다고 문구가 뜬다
			Class.forName("java.lang.String"); // 주어진 클래스를 찾는 코드
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
