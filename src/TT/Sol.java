package TT;

//----------------------------------------13, 14번--------------------------------------------------------------
public class Sol {
	String name;
	String id;
	String pass;
	int age;

	Sol(String name, String id, String pass, int age) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.age = age;
	}

	public static void main(String[] args) {
		Sol a = new Sol("김경범", "ID", "PASS", 25);
		System.out.println("이름은:  " + a.name);
		System.out.println("아이디는:  " + a.id);
		System.out.println("비밀번호는:  " + a.pass);
		System.out.println("나이는:  " + a.age);
	}

}
