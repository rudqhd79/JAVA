package test.ch10.makeException;

public class Account {
	//필드
	private long balance; //잔고
	
	//생성자
	public Account() {}
	
	//메소드
	public long getBalance() {
		return this.balance;
	}
	
	//입금
	public void deposit(int money) {
		balance += money;
		//잔고에 입금액을 누적합산
	}
	
	//출금
	public void withdraw(int money) throws InsuffException {
		//잔고보다 내가 출금하려는 돈이 더 크면 예외 발생시킴
		if (balance < money) {
			//예외 발생시키기(if문에 걸리면 출금 메소드를 빠져나가 예외가 된다)
			throw new InsuffException("잔고 부족:  " + (money - balance) + "원이 모자랍니다.");
		}
		balance -= money;
		
	}
}
