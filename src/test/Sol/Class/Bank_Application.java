package test.Sol.Class;

import java.util.Scanner;

public class Bank_Application {

	private static Scanner scan = new Scanner(System.in);

	private static Bank_Account[] accountArray = new Bank_Account[100];

	public static void createAccount() {
		System.out.println("———————————");
		System.out.println("계좌생성");
		System.out.println("———————————");
		System.out.print("계좌번호 : ");
		String ACC = scan.next();
		System.out.print("계좌주 : ");
		String Name = scan.next();
		System.out.print("초기입금액 : ");
		int Deposit = scan.nextInt();

		Bank_Account newAccount = new Bank_Account(ACC, Name, Deposit);
		// 계좌 번호, 계좌주, 초기입금액 입력하면 계좌가 생성된다는 것을 의미한다
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과:   계좌가 생성되었습니다.");
				System.out.println("계좌번호" + ACC + "\n" + "계좌주" + Name + "\n" + "입금액" + Deposit);
				break;
			}
		}
	}

	public static void accountList() {
		System.out.println("———————————");
		System.out.println("계좌목록");
		System.out.println("———————————");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i].getACC() + "    " + accountArray[i].getName() + "    "
						+ accountArray[i].getDeposit());
			}
		}
	}

	public static void deposit() {
		System.out.println("———————————");
		System.out.println("예금");
		System.out.println("———————————");
		System.out.println("계좌번호를 입력해 주세요");
		String ACC = scan.next();
		System.out.println("예금액을 입력해 주세요");
		int deposit = scan.nextInt();

		// findnewAccount로 찾아온 계좌 객체 저장
		Bank_Account newAccount = findnewAccount(ACC);

		int AccountBallance = newAccount.getDeposit();
		newAccount.setDeposit(AccountBallance + deposit);
	}

	public static Bank_Account findnewAccount(String a) {
		Bank_Account bankAccount = null;
		for (Bank_Account ACC_item : accountArray) {
			if (ACC_item.getACC().equals(a)) {
				bankAccount = ACC_item;
				break;
			}
		}
		return bankAccount;
	}

	public static void withdraw() {
		System.out.println("———————————");
		System.out.println("출금");
		System.out.println("———————————");
		System.out.println("계좌번호를 입력해 주세요");
		String ACC = scan.next();
		System.out.println("출금액을 입력해 주세요");
		int withdraw = scan.nextInt();

		Bank_Account newAccount = findnewAccount(ACC);
		int AccountBallance = newAccount.getDeposit();
		newAccount.setDeposit(AccountBallance - withdraw);
	}

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1, 2, 3, 4, 5번 중에 선택해 주세요");
			System.out.println("------------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택>");
			int a = scan.nextInt();
			switch (a) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
			}
		}

		System.out.println("프로그램 종료");
	}
}
