package test.ch13.sync;

public class Sync_EX {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		// setCalculator 메소드는 Calculator 객체 생성하는 메소드가 된다
		User1Thread user1 = new User1Thread();
		user1.setCalculator(calculator);
		user1.start();
		
		// setCalculator 메소드는 Calculator 객체 생성하는 메소드가 된다
		User2Thread user2 = new User2Thread();
		user2.setCalculator(calculator);
		user2.start();

	}
}
