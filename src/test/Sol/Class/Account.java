package Class_Sol;

public class Account {

	private int balance; // 잔고 필드
	public static final int MIN_BANLANCE = 0;
	public static final int MAX_BANLANCE = 1000000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance < MIN_BANLANCE || balance > MAX_BANLANCE) {
			return;
		} else if (balance > MIN_BANLANCE && balance < MAX_BANLANCE) {
			this.balance = balance;
			return;
			//this.balance는 private int balance 로 return된다
		}
	}
}
