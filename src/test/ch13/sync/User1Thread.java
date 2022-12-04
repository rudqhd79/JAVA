package test.ch13.sync;

public class User1Thread extends Thread {
	private Calculator calculator;
	
	public User1Thread() {
		setName("user1Thread");//thread의 이름 변경
	}
	
	public void setCalculator(Calculator calculator) {
		//매개변수 calculator는 필드의 calculator가 된다
		this.calculator = calculator;
	}

	//thread가 실행될 때 실행되는 코드
	@Override
	public void run() {
		calculator.setMemory1(100);
	}
}
