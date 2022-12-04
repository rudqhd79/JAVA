package singletone;

public class Main {

	public static void main(String[] args) {
		User[] user = new User[10]; // 10개의 빈 배열칸을 만듦

		for (int i = 0; i < user.length; i++) {
			user[i] = new User("user" + i); // user0, user1....

			user[i].print();// 생성한 객체에서 print() 메소드 실행
		}

	}
}
