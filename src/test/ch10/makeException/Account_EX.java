package test.ch10.makeException;

public class Account_EX {

	public static void main(String[] args) {
		Account ACC = new Account();	//계좌 생성
		ACC.deposit(10000);	//만원 저축
		System.out.println("예금액:  " + ACC.getBalance());
		
		try {
			ACC.withdraw(500000);
		} catch (InsuffException e) {
			e.printStackTrace();
		}	//만원 출금
		System.out.println("출금액:  " + ACC.getBalance());
		
		
	}

}
