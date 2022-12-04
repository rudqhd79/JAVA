package singletone;

public class User {
	// 사용자 이름 필드
	private String name;

	public User(String name) {
		this.name = name;
	}

	public void print() {
		// getPrinter는 static 이므로 클래스 명으로 쓸 수 있다
		Printer printer = Printer.getPrinter();
		System.out.println(this.name + "사용자가 사용하는 프린트:  " + printer.toString());
	}
}
